package mh2;

/* loaded from: classes10.dex */
public final class b0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f326300d;

    public b0(mh2.k0 k0Var) {
        this.f326300d = k0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        om2.b0 b0Var = (om2.b0) obj;
        mh2.a aVar = this.f326300d.f326392p;
        if (aVar != null) {
            aVar.d(b0Var.f346275a);
        }
        return jz5.f0.f302826a;
    }
}
