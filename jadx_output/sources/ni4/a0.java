package ni4;

/* loaded from: classes6.dex */
public enum a0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f337764d = null;

    a0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f337764d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f337764d;
                if (obj == null) {
                    obj = ni4.x.f337776d;
                    this.f337764d = obj;
                }
            }
        }
        return (ni4.x) obj;
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
                return java.util.Collections.EMPTY_LIST;
            case 1:
                return ni4.y.class;
            case 2:
                return java.lang.Boolean.FALSE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, "modtextstatus") || java.util.Objects.equals(obj, "textstatuslike") || java.util.Objects.equals(obj, "textstatusreference") || java.util.Objects.equals(obj, "textstatusiconconfigrefresh") || java.util.Objects.equals(obj, "textstatuscomment") || java.util.Objects.equals(obj, 6284) || java.util.Objects.equals(obj, 5215) || java.util.Objects.equals(obj, 6253) || java.util.Objects.equals(obj, 4099);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(ni4.x.class.getName());
    }
}
