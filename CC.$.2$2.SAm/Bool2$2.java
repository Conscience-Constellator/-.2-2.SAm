package CC.$.Q2$2;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Bool2$2
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Bool2$2(boolean A,boolean B,
		boolean[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean[] Bool2$2(boolean A,boolean B)
		{
			boolean[] Rsult=new boolean[2];

			Bool2$2(A,B,Rsult);

			return Rsult;
		}
}