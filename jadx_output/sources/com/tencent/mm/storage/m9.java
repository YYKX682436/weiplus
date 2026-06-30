package com.tencent.mm.storage;

/* loaded from: classes3.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f195127a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f195128b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f195129c;

    public m9(int i17, java.lang.String typeName, yz5.a getUnreadCount) {
        kotlin.jvm.internal.o.g(typeName, "typeName");
        kotlin.jvm.internal.o.g(getUnreadCount, "getUnreadCount");
        this.f195127a = i17;
        this.f195128b = typeName;
        this.f195129c = getUnreadCount;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.storage.m9)) {
            return false;
        }
        com.tencent.mm.storage.m9 m9Var = (com.tencent.mm.storage.m9) obj;
        return this.f195127a == m9Var.f195127a && kotlin.jvm.internal.o.b(this.f195128b, m9Var.f195128b) && kotlin.jvm.internal.o.b(this.f195129c, m9Var.f195129c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f195127a) * 31) + this.f195128b.hashCode()) * 31) + this.f195129c.hashCode();
    }

    public java.lang.String toString() {
        return "TabConfig(type=" + this.f195127a + ", typeName=" + this.f195128b + ", getUnreadCount=" + this.f195129c + ')';
    }
}
