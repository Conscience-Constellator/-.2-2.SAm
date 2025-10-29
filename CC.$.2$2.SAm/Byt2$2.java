package CC.$.Q2$2;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface Byt2$2
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Num2$2(byte A,byte B,
		byte[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default byte[] Num2$2(byte A,byte B)
		{
			byte[] Rsult=new byte[2];

			Num2$2(A,B,Rsult);

			return Rsult;
		}
}