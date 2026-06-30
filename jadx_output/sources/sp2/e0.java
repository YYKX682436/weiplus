package sp2;

/* loaded from: classes2.dex */
public final class e0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f411019d;

    public e0(java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.o.g(weakReference, "weakReference");
        this.f411019d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sp2.o2 o2Var = (sp2.o2) this.f411019d.get();
        if (o2Var != null) {
            kotlinx.coroutines.l.d(o2Var.f411129e, null, null, new sp2.d0(booleanValue, o2Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
