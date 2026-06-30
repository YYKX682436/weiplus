package tb1;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tb1.s f416925e;

    public q(tb1.s sVar, java.lang.String str) {
        this.f416925e = sVar;
        this.f416924d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        try {
            str = com.tencent.mm.plugin.appbrand.jsapi.media.t7.e(this.f416924d);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCameraView", "stopRecord, remux failed, callback with origin videoexp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            str = null;
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            ik1.h0.b(new tb1.p(this, str));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "compressed file not exist");
            this.f416925e.i(-1, "compressed file not exist", null, null);
        }
    }
}
