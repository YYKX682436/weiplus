package kk2;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f308503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f308504e;

    public o(kk2.p pVar, r45.fa2 fa2Var) {
        this.f308503d = pVar;
        this.f308504e = fa2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg2.s1 s1Var = this.f308503d.f308510o;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView liveThree = s1Var.f262302h;
        kotlin.jvm.internal.o.f(liveThree, "liveThree");
        r45.ea2 ea2Var = (r45.ea2) this.f308504e.f374129h.get(2);
        com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView.e(liveThree, ea2Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2) : null, 2, 1.3333f, 0, 8, null);
    }
}
