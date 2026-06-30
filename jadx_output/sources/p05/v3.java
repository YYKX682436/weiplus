package p05;

/* loaded from: classes5.dex */
public enum v3 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f350712d = null;

    v3() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f350712d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f350712d;
                if (obj == null) {
                    obj = new p05.u3();
                    this.f350712d = obj;
                }
            }
        }
        return (p05.u3) obj;
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
        return "provider ".concat(p05.u3.class.getName());
    }
}
