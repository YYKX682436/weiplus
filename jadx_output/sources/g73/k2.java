package g73;

/* loaded from: classes6.dex */
public enum k2 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f269285d = null;

    k2() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f269285d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f269285d;
                if (obj == null) {
                    obj = g73.g2.f269270d;
                    this.f269285d = obj;
                }
            }
        }
        return (g73.g2) obj;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 503774505:
                if (str.equals("dependencies")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return g73.i2.f269277a;
            case 1:
                return g73.j2.f269280a;
            case 2:
                return g73.h2.class;
            default:
                return null;
        }
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
        return "provider ".concat(g73.g2.class.getName());
    }
}
