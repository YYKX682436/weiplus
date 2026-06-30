package sb;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static sb.g f405397b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f405398a = new java.util.HashMap();

    public void a(java.lang.String str, sb.j jVar) {
        if (android.text.TextUtils.isEmpty(com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId())) {
            return;
        }
        tb.b bVar = new tb.b();
        bVar.f405390e = new tb.a(sb.d.a(), jVar, this.f405398a, "datareport");
        if (str.equals("") || android.text.TextUtils.isEmpty(com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId())) {
            return;
        }
        sb.b bVar2 = bVar.f405389d;
        bVar2.f405385g.clear();
        bVar2.f405385g.put(str, "");
        bVar.start();
    }

    public void b(com.tencent.midas.api.request.APMidasDirectRequest aPMidasDirectRequest, java.lang.String str, sb.j jVar) {
        tb.d dVar = new tb.d(aPMidasDirectRequest);
        dVar.f405390e = new tb.c(sb.d.a(), jVar, this.f405398a, "directdatareport");
        java.lang.String str2 = aPMidasDirectRequest.offerId;
        if (str.equals("") || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        sb.b bVar = dVar.f405389d;
        bVar.f405385g.clear();
        bVar.f405385g.put("offer_id", str2);
        bVar.f405385g.put(str, "");
        dVar.start();
    }
}
