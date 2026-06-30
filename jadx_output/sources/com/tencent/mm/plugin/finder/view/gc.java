package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class gc {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Point f132152a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.hc f132153b;

    public gc(android.graphics.Point popupWindowPos, com.tencent.mm.plugin.finder.view.hc direction) {
        kotlin.jvm.internal.o.g(popupWindowPos, "popupWindowPos");
        kotlin.jvm.internal.o.g(direction, "direction");
        this.f132152a = popupWindowPos;
        this.f132153b = direction;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.gc)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.gc gcVar = (com.tencent.mm.plugin.finder.view.gc) obj;
        return kotlin.jvm.internal.o.b(this.f132152a, gcVar.f132152a) && this.f132153b == gcVar.f132153b;
    }

    public int hashCode() {
        return (this.f132152a.hashCode() * 31) + this.f132153b.hashCode();
    }

    public java.lang.String toString() {
        return "PopupMenuUIParams(popupWindowPos=" + this.f132152a + ", direction=" + this.f132153b + ')';
    }
}
