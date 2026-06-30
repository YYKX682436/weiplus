package gt;

/* loaded from: classes5.dex */
public enum c5 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f275194d = null;

    c5() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f275194d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f275194d;
                if (obj == null) {
                    obj = new gt.a5();
                    this.f275194d = obj;
                }
            }
        }
        return (gt.a5) obj;
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
                return gt.b5.f275185a;
            case 1:
                return java.lang.Void.class;
            case 2:
                return java.lang.Boolean.FALSE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, 20) || java.util.Objects.equals(obj, 1) || java.util.Objects.equals(obj, 17) || java.util.Objects.equals(obj, 19) || java.util.Objects.equals(obj, 40) || java.util.Objects.equals(obj, 7) || java.util.Objects.equals(obj, 33);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(gt.a5.class.getName());
    }
}
