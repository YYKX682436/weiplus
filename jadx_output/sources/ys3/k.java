package ys3;

/* loaded from: classes6.dex */
public enum k implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f465215d = null;

    k() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f465215d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f465215d;
                if (obj == null) {
                    obj = new ys3.i();
                    this.f465215d = obj;
                }
            }
        }
        return (ys3.i) obj;
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
                return ys3.j.f465212a;
            case 2:
                return java.lang.Void.class;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, j95.a.ASYNC);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(ys3.i.class.getName());
    }
}
