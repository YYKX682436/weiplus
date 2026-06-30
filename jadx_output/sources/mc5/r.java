package mc5;

/* loaded from: classes.dex */
public enum r implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f325663d = null;

    r() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f325663d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f325663d;
                if (obj == null) {
                    obj = new mc5.q();
                    this.f325663d = obj;
                }
            }
        }
        return (mc5.q) obj;
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
        return "provider ".concat(mc5.q.class.getName());
    }
}
