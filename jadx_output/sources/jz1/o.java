package jz1;

/* loaded from: classes5.dex */
public enum o implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f302706d = null;

    o() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f302706d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f302706d;
                if (obj == null) {
                    obj = jz1.e.Di();
                    this.f302706d = obj;
                }
            }
        }
        return (jz1.e) obj;
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
                return jz1.n.f302703a;
            case 2:
                return jz1.e.class;
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
        return "provider ".concat(jz1.e.class.getName());
    }
}
