package g10;

/* loaded from: classes6.dex */
public enum z implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f267563d = null;

    z() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f267563d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f267563d;
                if (obj == null) {
                    obj = new g10.y();
                    this.f267563d = obj;
                }
            }
        }
        return (g10.y) obj;
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
        return "provider ".concat(g10.y.class.getName());
    }
}
