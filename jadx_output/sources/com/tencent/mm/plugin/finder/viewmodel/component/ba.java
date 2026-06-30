package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    public final int f133859a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f133860b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f133861c;

    public ba(int i17, java.lang.String name, yz5.a onShow) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(onShow, "onShow");
        this.f133859a = i17;
        this.f133860b = name;
        this.f133861c = onShow;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.ba)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ba baVar = (com.tencent.mm.plugin.finder.viewmodel.component.ba) obj;
        return this.f133859a == baVar.f133859a && kotlin.jvm.internal.o.b(this.f133860b, baVar.f133860b) && kotlin.jvm.internal.o.b(this.f133861c, baVar.f133861c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f133859a) * 31) + this.f133860b.hashCode()) * 31) + this.f133861c.hashCode();
    }

    public java.lang.String toString() {
        return "DialogRequest(priority=" + this.f133859a + ", name=" + this.f133860b + ", onShow=" + this.f133861c + ')';
    }
}
