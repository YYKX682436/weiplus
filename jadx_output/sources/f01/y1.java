package f01;

/* loaded from: classes6.dex */
public enum y1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f258412d = null;

    y1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f258412d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f258412d;
                if (obj == null) {
                    obj = f01.w1.INSTANCE;
                    this.f258412d = obj;
                }
            }
        }
        return (f01.w1) obj;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1063801905:
                if (str.equals("accountAware")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return f01.x1.f258407a;
            case 1:
                return f01.w1.class;
            case 2:
                return java.lang.Boolean.TRUE;
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
        return "provider ".concat(f01.w1.class.getName());
    }
}
