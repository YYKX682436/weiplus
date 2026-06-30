package t71;

/* loaded from: classes12.dex */
public abstract class a {
    public static android.content.Intent a(s71.b bVar) {
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddrUtil", "addressObj == null");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("addressID", bVar.f403970d);
        intent.putExtra("nationalCode", bVar.f403979p);
        intent.putExtra("userName", bVar.f403977n);
        intent.putExtra("telNumber", bVar.f403978o);
        intent.putExtra("addressPostalCode", bVar.f403975i);
        intent.putExtra("proviceFirstStageName", bVar.f403972f);
        intent.putExtra("addressCitySecondStageName", bVar.f403973g);
        intent.putExtra("addressCountiesThirdStageName", bVar.f403974h);
        intent.putExtra("addressCountiesFourStageName", bVar.f403980q);
        intent.putExtra("addressDetailInfo", bVar.f403976m);
        intent.putExtra("formatErrorCode", 0);
        return intent;
    }
}
