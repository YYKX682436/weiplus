package kq0;

/* loaded from: classes6.dex */
public enum g implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f311235d = null;

    g() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f311235d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f311235d;
                if (obj == null) {
                    obj = new kq0.f();
                    this.f311235d = obj;
                }
            }
        }
        return (kq0.f) obj;
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
        return "provider ".concat(kq0.f.class.getName());
    }
}
