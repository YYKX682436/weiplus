package of1;

/* loaded from: classes8.dex */
public class f implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.g f344911a;

    public f(of1.g gVar) {
        this.f344911a = gVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HTMLViewScanHelper", "share image to friend fail, imgPath is null");
            return;
        }
        of1.m mVar = this.f344911a.f344916d;
        mVar.getClass();
        try {
            mVar.f344882f.X9(str, ((of1.v0) ((of1.w1) mVar.f344880d).getController()).U(), null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "sendImgToFriend(path:%s) ipc forMsgRetransmit get exception:%s", str, e17);
        }
    }
}
