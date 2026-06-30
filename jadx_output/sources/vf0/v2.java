package vf0;

/* loaded from: classes11.dex */
public final class v2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf0.y2 f436291d;

    public v2(vf0.y2 y2Var) {
        this.f436291d = y2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qi3.e0 e0Var = (qi3.e0) obj;
        java.util.Objects.toString(e0Var);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) ((jz5.n) this.f436291d.f436306m).getValue()).iterator();
        while (it.hasNext()) {
            ((wf0.j1) it.next()).l1(e0Var);
        }
        return jz5.f0.f302826a;
    }
}
