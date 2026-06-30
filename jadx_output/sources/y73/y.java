package y73;

/* loaded from: classes5.dex */
public enum y implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f459769d = null;

    y() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f459769d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f459769d;
                if (obj == null) {
                    obj = (y73.q) y73.q.f459745f.b();
                    this.f459769d = obj;
                }
            }
        }
        return (y73.q) obj;
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
                return y73.x.f459766a;
            case 1:
                return y73.q.class;
            case 2:
                return java.lang.Boolean.FALSE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, com.tencent.mm.autogen.events.HotPatchApplyEvent.class);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(y73.q.class.getName());
    }
}
