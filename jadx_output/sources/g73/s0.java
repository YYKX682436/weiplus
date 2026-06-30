package g73;

/* loaded from: classes7.dex */
public enum s0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f269330d = null;

    s0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f269330d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f269330d;
                if (obj == null) {
                    obj = g73.o0.f269311d;
                    this.f269330d = obj;
                }
            }
        }
        return (g73.o0) obj;
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
                return g73.q0.f269325a;
            case 1:
                return g73.r0.f269326a;
            case 2:
                return g73.p0.class;
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
        return "provider ".concat(g73.o0.class.getName());
    }
}
