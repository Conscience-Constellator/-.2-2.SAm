package CC.$.Q2$2;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface FlOt2$2
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void FlOt2$2(float A,float B,
		float[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default float[] FlOt2$2(float A,float B)
		{
			float[] Rsult=new float[2];

			FlOt2$2(A,B,Rsult);

			return Rsult;
		}
}