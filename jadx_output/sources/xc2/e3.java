package xc2;

/* loaded from: classes2.dex */
public final class e3 extends androidx.lifecycle.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f453124d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453125e;

    @Override // androidx.lifecycle.g0
    public java.lang.Object getValue() {
        java.lang.Object obj = this.f453125e;
        return obj == null ? super.getValue() : obj;
    }

    @Override // androidx.lifecycle.j0, androidx.lifecycle.g0
    public void postValue(java.lang.Object obj) {
        super.postValue(obj);
        synchronized (this.f453124d) {
            this.f453125e = obj;
        }
    }

    @Override // androidx.lifecycle.j0, androidx.lifecycle.g0
    public void setValue(java.lang.Object obj) {
        super.setValue(obj);
        synchronized (this.f453124d) {
            this.f453125e = null;
        }
    }
}
