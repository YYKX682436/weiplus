package x0;

/* loaded from: classes14.dex */
public final class t0 implements java.util.Map.Entry, zz5.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f450947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f450948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.u0 f450949f;

    public t0(x0.u0 u0Var) {
        this.f450949f = u0Var;
        java.util.Map.Entry entry = u0Var.f450955g;
        kotlin.jvm.internal.o.d(entry);
        this.f450947d = entry.getKey();
        java.util.Map.Entry entry2 = u0Var.f450955g;
        kotlin.jvm.internal.o.d(entry2);
        this.f450948e = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f450947d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f450948e;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        x0.u0 u0Var = this.f450949f;
        if (u0Var.f450952d.b().f450902d != u0Var.f450954f) {
            throw new java.util.ConcurrentModificationException();
        }
        java.lang.Object obj2 = this.f450948e;
        u0Var.f450952d.put(this.f450947d, obj);
        this.f450948e = obj;
        return obj2;
    }
}
