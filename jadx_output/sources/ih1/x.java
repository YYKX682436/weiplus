package ih1;

/* loaded from: classes6.dex */
public enum x implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f291548d = null;

    x() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f291548d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f291548d;
                if (obj == null) {
                    obj = new ih1.w();
                    this.f291548d = obj;
                }
            }
        }
        return (ih1.w) obj;
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
        return "provider ".concat(ih1.w.class.getName());
    }
}
