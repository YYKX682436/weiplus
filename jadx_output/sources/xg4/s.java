package xg4;

/* loaded from: classes6.dex */
public enum s implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f454459d = null;

    s() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f454459d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f454459d;
                if (obj == null) {
                    obj = new xg4.r();
                    this.f454459d = obj;
                }
            }
        }
        return (xg4.r) obj;
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
        return "provider ".concat(xg4.r.class.getName());
    }
}
