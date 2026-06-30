package nq0;

/* loaded from: classes7.dex */
public final class k implements jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f338933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nq0.p f338934e;

    public k(kotlin.jvm.internal.h0 h0Var, nq0.p pVar) {
        this.f338933d = h0Var;
        this.f338934e = pVar;
    }

    @Override // jc3.l0
    public void onDestroy() {
        iq0.b bVar = iq0.c.f293642e;
        kotlin.jvm.internal.h0 h0Var = this.f338933d;
        bVar.a((iq0.c) h0Var.f310123d);
        nq0.p pVar = this.f338934e;
        pVar.f338944f.remove(h0Var.f310123d);
        pVar.f338945g.remove(h0Var.f310123d);
    }
}
