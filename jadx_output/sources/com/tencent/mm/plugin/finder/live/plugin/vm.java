package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vm implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f114795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f114796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f114797f;

    public vm(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.plugin.bn bnVar, kotlinx.coroutines.q qVar) {
        this.f114795d = c0Var;
        this.f114796e = bnVar;
        this.f114797f = qVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, onAnimationCancel");
        kotlin.jvm.internal.c0 c0Var = this.f114795d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f114796e.f112052p.i(this);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f114797f.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, onAnimationEnd");
        kotlin.jvm.internal.c0 c0Var = this.f114795d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f114796e.f112052p.i(this);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f114797f.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
