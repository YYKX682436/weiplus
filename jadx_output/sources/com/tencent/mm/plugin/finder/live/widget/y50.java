package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y50 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f120415a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f120416b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f120417c;

    public y50(java.lang.String id6, java.lang.String title, java.util.List options) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(options, "options");
        this.f120415a = id6;
        this.f120416b = title;
        this.f120417c = options;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.y50)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.y50 y50Var = (com.tencent.mm.plugin.finder.live.widget.y50) obj;
        return kotlin.jvm.internal.o.b(this.f120415a, y50Var.f120415a) && kotlin.jvm.internal.o.b(this.f120416b, y50Var.f120416b) && kotlin.jvm.internal.o.b(this.f120417c, y50Var.f120417c);
    }

    public int hashCode() {
        return (((this.f120415a.hashCode() * 31) + this.f120416b.hashCode()) * 31) + this.f120417c.hashCode();
    }

    public java.lang.String toString() {
        return "TabItem(id=" + this.f120415a + ", title=" + this.f120416b + ", options=" + this.f120417c + ')';
    }
}
