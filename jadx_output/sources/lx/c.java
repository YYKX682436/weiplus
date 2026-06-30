package lx;

/* loaded from: classes10.dex */
public final class c implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.k f321703a;

    public c(lx.k kVar) {
        this.f321703a = kVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        bw5.bu buVar = (bw5.bu) obj;
        lx.k kVar = this.f321703a;
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "delete update success");
        com.tencent.pigeon.biz.BizFinderFlutterApi bizFinderFlutterApi = kVar.f321823e;
        if (bizFinderFlutterApi != null) {
            byte[] byteArray = buVar.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            bizFinderFlutterApi.updateFinderData(byteArray, new lx.b(kVar));
        }
    }
}
