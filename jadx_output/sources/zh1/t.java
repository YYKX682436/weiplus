package zh1;

/* loaded from: classes5.dex */
public enum t implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f472944d = null;

    t() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f472944d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f472944d;
                if (obj == null) {
                    obj = zh1.p.f472931d;
                    this.f472944d = obj;
                }
            }
        }
        return (zh1.p) obj;
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
                return zh1.r.f472934a;
            case 1:
                return zh1.s.f472939a;
            case 2:
                return zh1.q.class;
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
        return "provider ".concat(zh1.p.class.getName());
    }
}
