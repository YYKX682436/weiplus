package cw4;

@j95.b
/* loaded from: classes12.dex */
public class s extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        ku4.i iVar = ku4.i.f312514a;
        ((ku5.t0) ku5.t0.f312615d).l(ku4.c.f312508d, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "WebCanvasPackageDownManager");
        ku4.z.f312539a.c(false);
        q25.b.b(new com.tencent.mm.plugin.webview.webcompt.j1(), "//webcompt");
        q25.b.b(new com.tencent.mm.plugin.webview.core.s1(), "//webview");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        pv1.c cVar;
        super.onCreate(context);
        km0.b a17 = gm0.j1.p().a();
        if (!a17.a()) {
            a17.b(":tools");
        }
        if (com.tencent.mm.sdk.platformtools.x2.s()) {
            ((ux.a) ((vx.e) i95.n0.c(vx.e.class))).getClass();
            synchronized (pv1.c.class) {
                if (pv1.c.f358569c == null) {
                    pv1.c.f358569c = new pv1.c();
                }
                hv1.d.f();
                cVar = pv1.c.f358569c;
            }
            by5.c4.f("WXFileDownloaderBridge", "setFileDownloaderProxy:" + cVar);
            rx5.c.f401350b = cVar;
            cw4.r rVar = new cw4.r(new cw4.q(this));
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                rVar.run();
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(rVar);
            }
        }
    }
}
