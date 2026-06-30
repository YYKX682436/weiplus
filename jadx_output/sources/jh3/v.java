package jh3;

/* loaded from: classes6.dex */
public enum v implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f299842d = null;

    v() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f299842d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f299842d;
                if (obj == null) {
                    obj = new jh3.t();
                    this.f299842d = obj;
                }
            }
        }
        return (jh3.t) obj;
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
                return jh3.u.f299839a;
            case 1:
                return java.lang.Void.class;
            case 2:
                return java.lang.Boolean.TRUE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, "tmpl_type_profilewithrevoke");
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(jh3.t.class.getName());
    }
}
