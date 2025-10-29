package CC.$.Q2$2;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Int2$2
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Int2$2(int A,int B,
		int[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default int[] Int2$2(int A,int B)
		{
			int[] Rsult=new int[2];

			Int2$2(A,B,Rsult);

			return Rsult;
		}
}