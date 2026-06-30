package mh2;

/* loaded from: classes10.dex */
public final class c implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k f326304d;

    public c(mh2.k kVar) {
        this.f326304d = kVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        om2.d0 d0Var = (om2.d0) obj;
        mh2.k kVar = this.f326304d;
        kVar.f326381m = d0Var;
        if (d0Var instanceof om2.e0) {
            kotlinx.coroutines.l.d(kVar.f326375d.a(), null, null, new mh2.i(kVar, d0Var, null), 3, null);
        } else {
            if (d0Var instanceof om2.v ? true : d0Var instanceof om2.x ? true : d0Var instanceof om2.c0) {
                kVar.g();
            }
        }
        return jz5.f0.f302826a;
    }
}
