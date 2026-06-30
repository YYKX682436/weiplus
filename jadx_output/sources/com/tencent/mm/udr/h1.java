package com.tencent.mm.udr;

/* loaded from: classes6.dex */
public enum h1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f196495d = null;

    h1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f196495d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f196495d;
                if (obj == null) {
                    obj = new com.tencent.mm.udr.g1();
                    this.f196495d = obj;
                }
            }
        }
        return (com.tencent.mm.udr.g1) obj;
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
        return "provider ".concat(com.tencent.mm.udr.g1.class.getName());
    }
}
