package l26;

/* loaded from: classes16.dex */
public abstract class o0 implements l26.i {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f315260a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315261b;

    public o0(java.lang.String str, yz5.l lVar, kotlin.jvm.internal.i iVar) {
        this.f315260a = lVar;
        this.f315261b = "must return " + str;
    }

    @Override // l26.i
    public java.lang.String a(o06.n0 n0Var) {
        return l26.h.a(this, n0Var);
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        kotlin.jvm.internal.o.g(functionDescriptor, "functionDescriptor");
        return kotlin.jvm.internal.o.b(functionDescriptor.getReturnType(), this.f315260a.invoke(v16.f.e(functionDescriptor)));
    }

    @Override // l26.i
    public java.lang.String getDescription() {
        return this.f315261b;
    }
}
