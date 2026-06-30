package k91;

/* loaded from: classes.dex */
public enum k3 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f305662d = null;

    k3() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f305662d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f305662d;
                if (obj == null) {
                    obj = new k91.j3();
                    this.f305662d = obj;
                }
            }
        }
        return (k91.j3) obj;
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
        return "provider ".concat(k91.j3.class.getName());
    }
}
