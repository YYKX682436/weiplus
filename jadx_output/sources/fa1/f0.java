package fa1;

/* loaded from: classes6.dex */
public enum f0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f260686d = null;

    f0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f260686d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f260686d;
                if (obj == null) {
                    obj = new fa1.e0();
                    this.f260686d = obj;
                }
            }
        }
        return (fa1.e0) obj;
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
        return "provider ".concat(fa1.e0.class.getName());
    }
}
