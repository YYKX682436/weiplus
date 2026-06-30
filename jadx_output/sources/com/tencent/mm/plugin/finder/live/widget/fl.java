package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fl implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f118359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f118360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f118361f;

    public fl(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.widget.hl hlVar, kotlinx.coroutines.q qVar) {
        this.f118359d = c0Var;
        this.f118360e = hlVar;
        this.f118361f = qVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "start random gift animation, onAnimationCancel");
        kotlin.jvm.internal.c0 c0Var = this.f118359d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f118360e.f118573a.i(this);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f118361f.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "start random gift animation, onAnimationEnd");
        kotlin.jvm.internal.c0 c0Var = this.f118359d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f118360e.f118573a.i(this);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f118361f.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
