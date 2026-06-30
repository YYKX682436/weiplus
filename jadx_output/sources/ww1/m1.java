package ww1;

/* loaded from: classes6.dex */
public enum m1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f450246d = null;

    m1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f450246d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f450246d;
                if (obj == null) {
                    obj = new ww1.l1();
                    this.f450246d = obj;
                }
            }
        }
        return (ww1.l1) obj;
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
                return java.lang.Void.class;
            case 2:
                return java.lang.Boolean.FALSE;
            default:
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        return java.util.Objects.equals(obj, com.tencent.mm.autogen.events.CollectRcvVoiceEvent.class) || java.util.Objects.equals(obj, java.lang.Integer.valueOf(tb1.n0.CTRL_INDEX)) || java.util.Objects.equals(obj, 1317);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(ww1.l1.class.getName());
    }
}
