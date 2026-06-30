package kk2;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f308499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f308500e;

    public m(kk2.p pVar, r45.fa2 fa2Var) {
        this.f308499d = pVar;
        this.f308500e = fa2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk2.p pVar = this.f308499d;
        fg2.s1 s1Var = pVar.f308510o;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        s1Var.f262301g.setVisibility(0);
        fg2.s1 s1Var2 = pVar.f308510o;
        if (s1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView liveOne = s1Var2.f262301g;
        kotlin.jvm.internal.o.f(liveOne, "liveOne");
        r45.ea2 ea2Var = (r45.ea2) this.f308500e.f374129h.get(0);
        com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView.e(liveOne, ea2Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2) : null, 0, 1.3333f, 0, 8, null);
    }
}
