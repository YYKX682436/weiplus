package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class w1 implements com.tencent.mm.plugin.mmsight.segment.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149440d;

    public w1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149440d = a2Var;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void d(boolean z17, float f17, float f18) {
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void j(boolean z17, float f17, float f18) {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f149440d.f149272h;
        if (videoPlayerTextureView == null) {
            return;
        }
        videoPlayerTextureView.pause();
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void p(boolean z17, float f17, float f18) {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149440d;
        if (a2Var.f149272h == null) {
            return;
        }
        float f19 = a2Var.f149267c;
        a2Var.f149268d = java.lang.Math.round(f19 * f17);
        a2Var.f149269e = java.lang.Math.round(f19 * f18);
        if (a2Var.f149269e <= 0) {
            a2Var.f149269e = 1000;
        }
        a2Var.f149272h.a(a2Var.f149268d, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "onUp, start: %s, end: %s %s %s", java.lang.Integer.valueOf(a2Var.f149268d), java.lang.Integer.valueOf(a2Var.f149269e), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void u(float f17, float f18) {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149440d;
        if (a2Var.f149272h == null) {
            return;
        }
        float f19 = a2Var.f149267c;
        a2Var.f149268d = java.lang.Math.round(f19 * f17);
        a2Var.f149269e = java.lang.Math.round(f19 * f18);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "onRecyclerChanged, start: %s, end: %s %s %s", java.lang.Integer.valueOf(a2Var.f149268d), java.lang.Integer.valueOf(a2Var.f149269e), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        a2Var.f149272h.a(a2Var.f149268d, true);
    }
}
