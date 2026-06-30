package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v80 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f136223a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.u80 f136224b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f136225c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f136226d;

    public v80(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, com.tencent.mm.plugin.finder.viewmodel.component.u80 showState, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        showState = (i17 & 2) != 0 ? com.tencent.mm.plugin.finder.viewmodel.component.u80.f136108d : showState;
        z17 = (i17 & 4) != 0 ? false : z17;
        z18 = (i17 & 8) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(showState, "showState");
        this.f136223a = item;
        this.f136224b = showState;
        this.f136225c = z17;
        this.f136226d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.v80)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.v80 v80Var = (com.tencent.mm.plugin.finder.viewmodel.component.v80) obj;
        return kotlin.jvm.internal.o.b(this.f136223a, v80Var.f136223a) && this.f136224b == v80Var.f136224b && this.f136225c == v80Var.f136225c && this.f136226d == v80Var.f136226d;
    }

    public int hashCode() {
        return (((((this.f136223a.hashCode() * 31) + this.f136224b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f136225c)) * 31) + java.lang.Boolean.hashCode(this.f136226d);
    }

    public java.lang.String toString() {
        return "TingEntryShowInfo(item=" + this.f136223a + ", showState=" + this.f136224b + ", isOpeningTing=" + this.f136225c + ", hasReportedRestSlideUp=" + this.f136226d + ')';
    }
}
