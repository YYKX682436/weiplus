package u14;

/* loaded from: classes5.dex */
public enum a0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f423776d = null;

    a0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f423776d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f423776d;
                if (obj == null) {
                    obj = new u14.z();
                    this.f423776d = obj;
                }
            }
        }
        return (u14.z) obj;
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
        return "provider ".concat(u14.z.class.getName());
    }
}
