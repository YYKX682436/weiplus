package f05;

/* loaded from: classes6.dex */
public enum f implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f258433d = null;

    f() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f258433d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f258433d;
                if (obj == null) {
                    obj = new f05.e();
                    this.f258433d = obj;
                }
            }
        }
        return (f05.e) obj;
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
        return "provider ".concat(f05.e.class.getName());
    }
}
