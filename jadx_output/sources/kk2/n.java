package kk2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f308501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f308502e;

    public n(kk2.p pVar, r45.fa2 fa2Var) {
        this.f308501d = pVar;
        this.f308502e = fa2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg2.s1 s1Var = this.f308501d.f308510o;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView liveTwo = s1Var.f262303i;
        kotlin.jvm.internal.o.f(liveTwo, "liveTwo");
        r45.ea2 ea2Var = (r45.ea2) this.f308502e.f374129h.get(1);
        com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView.e(liveTwo, ea2Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2) : null, 1, 1.3333f, 0, 8, null);
    }
}
