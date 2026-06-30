package com.tencent.mm.wexnet;

/* loaded from: classes.dex */
public enum d0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f214360d = null;

    d0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f214360d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f214360d;
                if (obj == null) {
                    obj = new com.tencent.mm.wexnet.b0();
                    this.f214360d = obj;
                }
            }
        }
        return (com.tencent.mm.wexnet.b0) obj;
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
                return com.tencent.mm.wexnet.c0.f214357a;
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
        return java.util.Objects.equals(obj, com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent.class);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.tencent.mm.wexnet.b0.class.getName());
    }
}
