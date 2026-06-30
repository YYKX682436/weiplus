package u12;

/* loaded from: classes6.dex */
public enum w implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f423753d = null;

    w() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f423753d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f423753d;
                if (obj == null) {
                    obj = new u12.v();
                    this.f423753d = obj;
                }
            }
        }
        return (u12.v) obj;
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
        return "provider ".concat(u12.v.class.getName());
    }
}
