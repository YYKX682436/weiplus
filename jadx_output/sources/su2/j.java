package su2;

/* loaded from: classes5.dex */
public enum j implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f412753d = null;

    j() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f412753d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f412753d;
                if (obj == null) {
                    obj = new su2.i();
                    this.f412753d = obj;
                }
            }
        }
        return (su2.i) obj;
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
        return "provider ".concat(su2.i.class.getName());
    }
}
