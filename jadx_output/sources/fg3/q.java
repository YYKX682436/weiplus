package fg3;

/* loaded from: classes3.dex */
public final class q implements ig3.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f262447d;

    public q(java.lang.ref.WeakReference ref) {
        kotlin.jvm.internal.o.g(ref, "ref");
        this.f262447d = ref;
    }

    @Override // ig3.d
    public void C(android.view.View view, int i17, int i18) {
        kotlin.jvm.internal.o.g(view, "view");
        ig3.d dVar = (ig3.d) this.f262447d.get();
        if (dVar != null) {
            dVar.C(view, i17, i18);
        }
    }

    @Override // ig3.d
    public void I(ig3.c state) {
        kotlin.jvm.internal.o.g(state, "state");
        ig3.d dVar = (ig3.d) this.f262447d.get();
        if (dVar != null) {
            dVar.I(state);
        }
    }
}
