package gt;

/* loaded from: classes6.dex */
public enum t4 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f275321d = null;

    t4() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f275321d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f275321d;
                if (obj == null) {
                    obj = new gt.r4();
                    this.f275321d = obj;
                }
            }
        }
        return (gt.r4) obj;
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
                return gt.s4.f275309a;
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
        return java.util.Objects.equals(obj, com.tencent.mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key.class);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(gt.r4.class.getName());
    }
}
