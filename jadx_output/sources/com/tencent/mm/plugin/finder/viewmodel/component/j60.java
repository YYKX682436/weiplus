package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j60 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.k60 f134817a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f134818b;

    /* renamed from: c, reason: collision with root package name */
    public final float f134819c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f134820d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f134821e;

    public j60(com.tencent.mm.plugin.finder.viewmodel.component.k60 layout, java.util.List viewsToHide, float f17, yz5.l lVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(viewsToHide, "viewsToHide");
        this.f134817a = layout;
        this.f134818b = viewsToHide;
        this.f134819c = f17;
        this.f134820d = lVar;
        this.f134821e = aVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.j60)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.j60 j60Var = (com.tencent.mm.plugin.finder.viewmodel.component.j60) obj;
        return this.f134817a == j60Var.f134817a && kotlin.jvm.internal.o.b(this.f134818b, j60Var.f134818b) && java.lang.Float.compare(this.f134819c, j60Var.f134819c) == 0 && kotlin.jvm.internal.o.b(this.f134820d, j60Var.f134820d) && kotlin.jvm.internal.o.b(this.f134821e, j60Var.f134821e);
    }

    public int hashCode() {
        int hashCode = ((((this.f134817a.hashCode() * 31) + this.f134818b.hashCode()) * 31) + java.lang.Float.hashCode(this.f134819c)) * 31;
        yz5.l lVar = this.f134820d;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        yz5.a aVar = this.f134821e;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PanelConfig(layout=" + this.f134817a + ", viewsToHide=" + this.f134818b + ", currentSpeed=" + this.f134819c + ", onSpeedSelected=" + this.f134820d + ", onPanelDismiss=" + this.f134821e + ')';
    }
}
