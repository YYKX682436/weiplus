package kk;

/* loaded from: classes9.dex */
public class s implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f308470d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f308471e;

    /* renamed from: f, reason: collision with root package name */
    public long f308472f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public int f308473g;

    public s(java.lang.Object obj, java.lang.Object obj2, int i17) {
        this.f308470d = obj;
        this.f308471e = obj2;
        this.f308473g = i17;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f308470d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f308471e;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("This node is read only");
    }
}
