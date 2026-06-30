package e21;

/* loaded from: classes6.dex */
public enum c1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f246500d = null;

    c1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f246500d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f246500d;
                if (obj == null) {
                    obj = e21.k0.f246539a;
                    this.f246500d = obj;
                }
            }
        }
        return (e21.l0) obj;
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
                return e21.b1.f246491a;
            case 1:
                return e21.l0.class;
            case 2:
                return java.lang.Boolean.TRUE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX)) || java.util.Objects.equals(obj, 806) || java.util.Objects.equals(obj, 12607);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(e21.l0.class.getName());
    }
}
