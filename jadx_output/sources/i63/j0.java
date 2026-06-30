package i63;

/* loaded from: classes6.dex */
public enum j0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f289011d = null;

    j0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f289011d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f289011d;
                if (obj == null) {
                    obj = new i63.g0();
                    this.f289011d = obj;
                }
            }
        }
        return (i63.g0) obj;
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
                return i63.h0.f289006a;
            case 1:
                return i63.i0.f289007a;
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
        return "provider ".concat(i63.g0.class.getName());
    }
}
