package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class q8 implements xi2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.r8 f119511a;

    public q8(com.tencent.mm.plugin.finder.live.widget.r8 r8Var) {
        this.f119511a = r8Var;
    }

    @Override // xi2.f
    public void onAnimationEnd() {
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f119511a;
        com.tencent.mars.xlog.Log.i(r8Var.f119593d, "onAnimationEnd status:" + r8Var.f119604o);
        int i17 = r8Var.f119604o;
        r8Var.getClass();
        if (i17 == 0) {
            r8Var.c().setVisibility(8);
            r8Var.a().b();
        }
    }

    @Override // xi2.f
    public void onAnimationStart() {
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f119511a;
        com.tencent.mars.xlog.Log.i(r8Var.f119593d, "onAnimationStart status:" + r8Var.f119604o);
        int i17 = r8Var.f119604o;
        r8Var.getClass();
        if (i17 == 0) {
            if (((mm2.o4) r8Var.f119592c.P0(mm2.o4.class)).f329324s.size() == 1) {
                r8Var.a().e();
            }
        }
    }
}
