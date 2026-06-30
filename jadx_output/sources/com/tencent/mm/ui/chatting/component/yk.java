package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public enum yk implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f200330d = null;

    yk() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f200330d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f200330d;
                if (obj == null) {
                    obj = new com.tencent.mm.ui.chatting.component.xk();
                    this.f200330d = obj;
                }
            }
        }
        return (com.tencent.mm.ui.chatting.component.xk) obj;
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
        return java.util.Objects.equals(obj, com.tencent.mm.autogen.events.RepairerActionEvent.class);
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "provider ".concat(com.tencent.mm.ui.chatting.component.xk.class.getName());
    }
}
