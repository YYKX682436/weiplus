package e04;

/* loaded from: classes6.dex */
public enum y2 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f246164d = null;

    y2() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f246164d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f246164d;
                if (obj == null) {
                    obj = new e04.x2();
                    this.f246164d = obj;
                }
            }
        }
        return (e04.x2) obj;
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
        return "provider ".concat(e04.x2.class.getName());
    }
}
