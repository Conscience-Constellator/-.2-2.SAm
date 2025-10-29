package CC.$.Q2$2;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Short2$2
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Short2$2(short A,short B,
		short[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default short[] Short2$2(short A,short B)
		{
			short[] Rsult=new short[2];

			Short2$2(A,B,Rsult);

			return Rsult;
		}
}