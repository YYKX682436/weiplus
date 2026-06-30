package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class a9 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f200790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f200791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f200793g;

    public a9(t21.v2 v2Var, com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f200790d = v2Var;
        this.f200791e = jaVar;
        this.f200792f = f9Var;
        this.f200793g = i17;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        if (r1Var != null) {
            t21.v2 v2Var = this.f200790d;
            com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f200791e;
            com.tencent.mm.storage.f9 f9Var = this.f200792f;
            int i17 = this.f200793g;
            if (v2Var.d().equals(r1Var.f445529a)) {
                t21.i3 i3Var = t21.j3.f414800h;
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String str = r1Var.f445529a;
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(str);
                t21.j3 d17 = i3Var.d(h17 != null ? h17.g() : null);
                if (d17 == null || d17.f414804b) {
                    return;
                }
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(this);
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.gallery.z8(jaVar, f9Var, i17));
            }
        }
    }
}
