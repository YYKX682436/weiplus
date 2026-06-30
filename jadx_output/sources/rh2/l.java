package rh2;

/* loaded from: classes5.dex */
public enum l implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f395658d = null;

    l() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f395658d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f395658d;
                if (obj == null) {
                    obj = new rh2.k();
                    this.f395658d = obj;
                }
            }
        }
        return (rh2.k) obj;
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
        return "provider ".concat(rh2.k.class.getName());
    }
}
