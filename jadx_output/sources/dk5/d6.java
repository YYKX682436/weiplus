package dk5;

/* loaded from: classes.dex */
public enum d6 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f234596d = null;

    d6() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f234596d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f234596d;
                if (obj == null) {
                    obj = new dk5.s5();
                    this.f234596d = obj;
                }
            }
        }
        return (dk5.s5) obj;
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
                return java.util.Collections.EMPTY_LIST;
            case 1:
                return dk5.c6.f234570a;
            case 2:
                return java.lang.Void.class;
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
        return "provider ".concat(dk5.s5.class.getName());
    }
}
