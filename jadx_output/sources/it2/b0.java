package it2;

/* loaded from: classes6.dex */
public enum b0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f294504d = null;

    b0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f294504d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f294504d;
                if (obj == null) {
                    obj = new it2.a0();
                    this.f294504d = obj;
                }
            }
        }
        return (it2.a0) obj;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        str.getClass();
        if (str.equals("creator")) {
            return java.lang.Void.class;
        }
        return null;
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(it2.a0.class.getName());
    }
}
