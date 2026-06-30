package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public enum i5 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f195025d = null;

    i5() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f195025d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f195025d;
                if (obj == null) {
                    obj = com.tencent.mm.storage.h5.f195006d;
                    this.f195025d = obj;
                }
            }
        }
        return (com.tencent.mm.storage.h5) obj;
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
                return java.util.Collections.EMPTY_LIST;
            case 2:
                return com.tencent.mm.storage.j5.class;
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
        return "provider ".concat(com.tencent.mm.storage.h5.class.getName());
    }
}
