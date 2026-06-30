package yf2;

/* loaded from: classes3.dex */
public final class p1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.t1 f461768d;

    public p1(yf2.t1 t1Var) {
        this.f461768d = t1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.fd2 fd2Var = (r45.fd2) obj;
        if (fd2Var != null) {
            this.f461768d.c7(fd2Var);
        }
        return jz5.f0.f302826a;
    }
}
