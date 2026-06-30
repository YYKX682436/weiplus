package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class g80 {

    /* renamed from: a, reason: collision with root package name */
    public final int f126815a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f126816b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f126817c;

    public g80(int i17, java.lang.String exptKey, java.lang.Object data) {
        kotlin.jvm.internal.o.g(exptKey, "exptKey");
        kotlin.jvm.internal.o.g(data, "data");
        this.f126815a = i17;
        this.f126816b = exptKey;
        this.f126817c = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.storage.g80)) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.g80 g80Var = (com.tencent.mm.plugin.finder.storage.g80) obj;
        return this.f126815a == g80Var.f126815a && kotlin.jvm.internal.o.b(this.f126816b, g80Var.f126816b) && kotlin.jvm.internal.o.b(this.f126817c, g80Var.f126817c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f126815a) * 31) + this.f126816b.hashCode()) * 31) + this.f126817c.hashCode();
    }

    public java.lang.String toString() {
        return "FinderInitExptBuff(cmdId=" + this.f126815a + ", exptKey=" + this.f126816b + ", data=" + this.f126817c + ')';
    }
}
