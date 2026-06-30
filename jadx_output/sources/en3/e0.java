package en3;

/* loaded from: classes8.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final en3.e0 f255295d = new en3.e0();

    public e0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ra0.b0 state = (ra0.b0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof sa0.e)) {
            state.f393466e = new java.lang.ref.WeakReference(((sa0.e) dVar).f405249b.f420447b);
        }
        return jz5.f0.f302826a;
    }
}
