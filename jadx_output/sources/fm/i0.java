package fm;

/* loaded from: classes6.dex */
public enum i0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f263998d = null;

    i0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f263998d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f263998d;
                if (obj == null) {
                    obj = new fm.h0();
                    this.f263998d = obj;
                }
            }
        }
        return (fm.h0) obj;
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
        return "provider ".concat(fm.h0.class.getName());
    }
}
