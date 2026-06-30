package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public enum c3 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f172949d = null;

    c3() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f172949d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f172949d;
                if (obj == null) {
                    obj = new com.tencent.mm.plugin.teenmode.ui.a3();
                    this.f172949d = obj;
                }
            }
        }
        return (com.tencent.mm.plugin.teenmode.ui.a3) obj;
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
                return com.tencent.mm.plugin.teenmode.ui.b3.f172934a;
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
        return java.util.Objects.equals(obj, 7);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.tencent.mm.plugin.teenmode.ui.a3.class.getName());
    }
}
