package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class m80 {

    /* renamed from: a, reason: collision with root package name */
    public final e42.b0 f127177a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f127178b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f127179c;

    public m80(e42.b0 xLabKey, java.lang.Object data, boolean z17) {
        kotlin.jvm.internal.o.g(xLabKey, "xLabKey");
        kotlin.jvm.internal.o.g(data, "data");
        this.f127177a = xLabKey;
        this.f127178b = data;
        this.f127179c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.storage.m80)) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.m80 m80Var = (com.tencent.mm.plugin.finder.storage.m80) obj;
        return kotlin.jvm.internal.o.b(this.f127177a, m80Var.f127177a) && kotlin.jvm.internal.o.b(this.f127178b, m80Var.f127178b) && this.f127179c == m80Var.f127179c;
    }

    public int hashCode() {
        return (((this.f127177a.hashCode() * 31) + this.f127178b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f127179c);
    }

    public java.lang.String toString() {
        return "XLabData(xLabKey=" + this.f127177a + ", data=" + this.f127178b + ", isReadWithHit=" + this.f127179c + ')';
    }
}
