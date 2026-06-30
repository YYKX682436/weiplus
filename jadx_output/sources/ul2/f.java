package ul2;

/* loaded from: classes5.dex */
public enum f implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f428594d = null;

    f() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f428594d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f428594d;
                if (obj == null) {
                    obj = new ul2.e();
                    this.f428594d = obj;
                }
            }
        }
        return (ul2.e) obj;
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
        return "provider ".concat(ul2.e.class.getName());
    }
}
