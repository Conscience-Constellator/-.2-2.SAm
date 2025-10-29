package CC.$.Q2$2;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Dubl2$2
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Dubl2$2(double A,double B,
		double[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default double[] Dubl2$2(double A,double B)
		{
			double[] Rsult=new double[2];

			Dubl2$2(A,B,Rsult);

			return Rsult;
		}
}