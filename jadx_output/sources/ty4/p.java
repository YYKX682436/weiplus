package ty4;

/* loaded from: classes6.dex */
public enum p implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f423147d = null;

    p() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f423147d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f423147d;
                if (obj == null) {
                    obj = new ty4.n(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    this.f423147d = obj;
                }
            }
        }
        return (ty4.n) obj;
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
                return ty4.o.f423144a;
            case 2:
                return ty4.n.class;
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
        return "provider ".concat(ty4.n.class.getName());
    }
}
