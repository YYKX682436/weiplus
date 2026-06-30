package vw;

/* loaded from: classes6.dex */
public enum w2 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f440752d = null;

    w2() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f440752d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f440752d;
                if (obj == null) {
                    obj = new vw.t2();
                    this.f440752d = obj;
                }
            }
        }
        return (vw.t2) obj;
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
                return vw.u2.f440738a;
            case 1:
                return vw.v2.f440740a;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, j95.a.ON_SPLASH);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(vw.t2.class.getName());
    }
}
