package vu0;

/* loaded from: classes5.dex */
public final class h implements vu0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0.k f440093a;

    public h(vu0.k kVar) {
        this.f440093a = kVar;
    }

    @Override // vu0.c
    public void a(java.lang.String requestId, java.util.List textResult, boolean z17) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(textResult, "textResult");
        if (fy0.i.a()) {
            this.f440093a.f440107b.a(requestId, textResult, z17);
        } else {
            fy0.i.b(new vu0.e(this, requestId, textResult, z17));
        }
    }

    @Override // vu0.c
    public void b(java.lang.String requestId, java.util.List textResult, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(textResult, "textResult");
        if (fy0.i.a()) {
            this.f440093a.f440107b.b(requestId, textResult, z17, z18);
        } else {
            fy0.i.b(new vu0.g(this, requestId, textResult, z17, z18));
        }
    }

    @Override // vu0.c
    public void c(java.lang.String requestId, vu0.u state) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(state, "state");
        if (fy0.i.a()) {
            this.f440093a.f440107b.c(requestId, state);
        } else {
            fy0.i.b(new vu0.f(this, requestId, state));
        }
    }
}
