package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionUI f137184d;

    public u0(com.tencent.mm.plugin.flash.action.FaceFlashActionUI faceFlashActionUI) {
        this.f137184d = faceFlashActionUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.FaceFlashActionUI faceFlashActionUI = this.f137184d;
        com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout faceFlashActionProcessLayout = faceFlashActionUI.f137103e;
        faceFlashActionProcessLayout.f137099q.cancel();
        faceFlashActionProcessLayout.f137100r.cancel();
        faceFlashActionProcessLayout.f137101s.cancel();
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = faceFlashActionUI.f137102d;
        faceFlashActionPreviewLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "release");
        faceFlashActionPreviewLayout.f137068g.clearAnimation();
        faceFlashActionPreviewLayout.f137069h.clearAnimation();
        faceFlashActionPreviewLayout.f137079t.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "releaseYTSdk");
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().deInit();
        com.tencent.mm.plugin.flash.d0 d0Var = faceFlashActionPreviewLayout.f137077r;
        com.tencent.mm.sdk.platformtools.n3 n3Var = d0Var.f137200c;
        if (n3Var != null) {
            n3Var.post(new com.tencent.mm.plugin.flash.a0(d0Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
        }
        tz2.u uVar = faceFlashActionPreviewLayout.f137081v;
        if (uVar != null) {
            uVar.release();
        }
        faceFlashActionPreviewLayout.f137086y0.cancel();
        wu5.c cVar = faceFlashActionPreviewLayout.G;
        if (cVar != null) {
            cVar.cancel(false);
            faceFlashActionPreviewLayout.G = null;
        }
        if (faceFlashActionPreviewLayout.P) {
            android.content.Context context = faceFlashActionPreviewLayout.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.tencent.mm.plugin.flash.action.j0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.flash.action.j0.class)).f137148d.f423317a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "releaseRecord");
                h72.s.e().d();
            }
        }
        gm0.j1.d().q(5965, faceFlashActionPreviewLayout);
    }
}
