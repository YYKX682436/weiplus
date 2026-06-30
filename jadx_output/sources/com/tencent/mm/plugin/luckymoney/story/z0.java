package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class z0 implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f145937d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f145938e;

    public z0(com.tencent.mm.plugin.luckymoney.story.b1 b1Var, com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager) {
        this.f145937d = new java.lang.ref.WeakReference(b1Var);
        this.f145938e = new java.lang.ref.WeakReference(envelopeStoryVideoManager);
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().p(str, i17, i18, 0);
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) this.f145937d.get();
        if (b1Var == null) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.g(str, str2, str3, null, false, new com.tencent.mm.plugin.luckymoney.story.y0(this, str2, str3), new com.tencent.mm.plugin.luckymoney.story.w0(b1Var));
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().h(str, null);
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        return t21.o2.Di().o(str, i17, i18);
    }
}
