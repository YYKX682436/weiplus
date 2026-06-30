package t22;

@j95.b
/* loaded from: classes5.dex */
public final class v extends i95.w implements o22.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f415110d = "MicroMsg.PluginEmojiCapture";

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f415110d, "onAccountInitialized: ");
        q25.b.b(new t22.m(), "//emojicapture");
        p05.p3 p3Var = p05.p3.f350639a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "init: ");
        int n17 = p3Var.b().n("sdk_version");
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        if (n17 == tq5.i.f421269a) {
            r45.v87 v87Var = p05.p3.f350641c;
            byte[] j17 = p3Var.b().j("local_info");
            if (j17 != null) {
                try {
                    v87Var.parseFrom(j17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            r45.v87 v87Var2 = p05.p3.f350642d;
            byte[] j18 = p3Var.b().j("target_info");
            if (j18 != null) {
                try {
                    v87Var2.parseFrom(j18);
                } catch (java.lang.Exception e18) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                }
            }
        } else {
            p3Var.b().d();
        }
        p3Var.f();
        p3Var.e();
        pm0.v.V(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, p05.k3.f350573d);
        p05.v2.f350704d.getClass();
        com.tencent.mars.xlog.Log.i(p05.v2.f350705e, "init: deviceModel:" + wo.q.f447782c);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f415110d, "onAccountRelease: ");
        q25.b.c("//emojicapture");
    }
}
