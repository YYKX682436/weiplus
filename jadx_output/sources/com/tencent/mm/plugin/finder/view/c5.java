package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f131749a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f131750b;

    public c5(int i17, java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f131749a = i17;
        this.f131750b = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.c5)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.c5 c5Var = (com.tencent.mm.plugin.finder.view.c5) obj;
        return this.f131749a == c5Var.f131749a && kotlin.jvm.internal.o.b(this.f131750b, c5Var.f131750b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f131749a) * 31) + this.f131750b.hashCode();
    }

    public java.lang.String toString() {
        return "DrawerResultData(commentCount=" + this.f131749a + ", data=" + this.f131750b + ')';
    }
}
