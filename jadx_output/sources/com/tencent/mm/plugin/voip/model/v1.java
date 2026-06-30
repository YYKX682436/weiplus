package com.tencent.mm.plugin.voip.model;

/* loaded from: classes.dex */
public enum v1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f176812d = null;

    v1() {
    }

    @Override // fs.q
    public java.lang.Object get() {
        java.lang.Object obj = this.f176812d;
        if (obj == null) {
            synchronized (this) {
                obj = this.f176812d;
                if (obj == null) {
                    obj = new com.tencent.mm.plugin.voip.model.u1();
                    this.f176812d = obj;
                }
            }
        }
        return (com.tencent.mm.plugin.voip.model.u1) obj;
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
        return "provider ".concat(com.tencent.mm.plugin.voip.model.u1.class.getName());
    }
}
