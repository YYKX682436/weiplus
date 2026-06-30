package mh2;

/* loaded from: classes10.dex */
public final class z implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f326491d;

    public z(mh2.k0 k0Var) {
        this.f326491d = k0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mh2.a aVar = this.f326491d.f326392p;
        mh2.f1 f1Var = aVar instanceof mh2.f1 ? (mh2.f1) aVar : null;
        if (f1Var != null) {
            f1Var.h();
        }
        return jz5.f0.f302826a;
    }
}
