package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.f3 f149321d;

    public e3(com.tencent.mm.plugin.mmsight.ui.f3 f3Var) {
        this.f149321d = f3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "onTextureUpdate");
        com.tencent.mm.plugin.mmsight.ui.f3 f3Var = this.f149321d;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = f3Var.f149331d.f149335d.H;
        if (videoPlayerTextureView == null) {
            return;
        }
        videoPlayerTextureView.setAlpha(1.0f);
        f3Var.f149331d.f149335d.i7(4);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.V6(f3Var.f149331d.f149335d);
    }
}
