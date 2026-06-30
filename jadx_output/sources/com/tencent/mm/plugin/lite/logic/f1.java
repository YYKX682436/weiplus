package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes6.dex */
public enum f1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f143936d = null;

    f1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f143936d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f143936d;
                if (obj == null) {
                    obj = new com.tencent.mm.plugin.lite.logic.e1();
                    this.f143936d = obj;
                }
            }
        }
        return (com.tencent.mm.plugin.lite.logic.e1) obj;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        str.getClass();
        if (str.equals("creator")) {
            return java.lang.Void.class;
        }
        return null;
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
        return "provider ".concat(com.tencent.mm.plugin.lite.logic.e1.class.getName());
    }
}
