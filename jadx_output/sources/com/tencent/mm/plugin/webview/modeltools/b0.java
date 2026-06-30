package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes.dex */
public enum b0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f183243d = null;

    b0() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f183243d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f183243d;
                if (obj == null) {
                    obj = new com.tencent.mm.plugin.webview.modeltools.z();
                    this.f183243d = obj;
                }
            }
        }
        return (com.tencent.mm.plugin.webview.modeltools.z) obj;
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
                return com.tencent.mm.plugin.webview.modeltools.a0.f183239a;
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
        return "provider ".concat(com.tencent.mm.plugin.webview.modeltools.z.class.getName());
    }
}
