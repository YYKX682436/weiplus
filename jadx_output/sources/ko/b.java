package ko;

/* loaded from: classes6.dex */
public enum b implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f309814d = null;

    b() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f309814d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f309814d;
                if (obj == null) {
                    obj = new ko.a();
                    this.f309814d = obj;
                }
            }
        }
        return (ko.a) obj;
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
        return "provider ".concat(ko.a.class.getName());
    }
}
