package dw3;

/* loaded from: classes4.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244262d;

    public r(java.lang.String str) {
        this.f244262d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "handleMultiVideoResult videoState : " + o17 + ' ');
        if (o17) {
            java.lang.String a17 = q75.c.a("jpg");
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = this.f244262d;
            kotlin.jvm.internal.o.d(str);
            ((yb0.g) b0Var).getClass();
            com.tencent.mm.platformtools.ExportFileUtil.b(context, str, a17);
            q75.c.f(a17, com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }
}
