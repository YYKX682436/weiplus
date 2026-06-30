package cw0;

/* loaded from: classes5.dex */
public final class h implements vu0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222632a;

    public h(cw0.l0 l0Var) {
        this.f222632a = l0Var;
    }

    @Override // vu0.c
    public void a(java.lang.String requestId, java.util.List textResult, boolean z17) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(textResult, "textResult");
        cw0.l0.k7(this.f222632a, requestId, textResult, z17, true);
    }

    @Override // vu0.c
    public void b(java.lang.String requestId, java.util.List textResult, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(textResult, "textResult");
        cw0.l0.k7(this.f222632a, requestId, textResult, z17, z18);
    }

    @Override // vu0.c
    public void c(java.lang.String requestId, vu0.u state) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(state, "state");
        this.f222632a.Y7(requestId, state);
    }
}
