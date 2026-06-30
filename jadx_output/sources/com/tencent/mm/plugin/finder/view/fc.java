package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class fc {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f132093a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.gc f132094b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.xn1 f132095c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f132096d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f132097e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f132098f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f132099g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f132100h;

    /* renamed from: i, reason: collision with root package name */
    public final int f132101i;

    public fc(android.view.View anchorView, com.tencent.mm.plugin.finder.view.gc uiParams, r45.xn1 xn1Var, boolean z17, boolean z18, boolean z19, java.lang.String boxId, java.lang.String likeComment, int i17, int i18, kotlin.jvm.internal.i iVar) {
        uiParams = (i18 & 2) != 0 ? new com.tencent.mm.plugin.finder.view.gc((android.graphics.Point) ((jz5.n) com.tencent.mm.plugin.finder.view.oc.f132784d).getValue(), com.tencent.mm.plugin.finder.view.hc.f132230d) : uiParams;
        z18 = (i18 & 16) != 0 ? false : z18;
        z19 = (i18 & 32) != 0 ? false : z19;
        boxId = (i18 & 64) != 0 ? "" : boxId;
        likeComment = (i18 & 128) != 0 ? "" : likeComment;
        i17 = (i18 & 256) != 0 ? 1 : i17;
        kotlin.jvm.internal.o.g(anchorView, "anchorView");
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(boxId, "boxId");
        kotlin.jvm.internal.o.g(likeComment, "likeComment");
        this.f132093a = anchorView;
        this.f132094b = uiParams;
        this.f132095c = xn1Var;
        this.f132096d = z17;
        this.f132097e = z18;
        this.f132098f = z19;
        this.f132099g = boxId;
        this.f132100h = likeComment;
        this.f132101i = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.fc)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.fc fcVar = (com.tencent.mm.plugin.finder.view.fc) obj;
        return kotlin.jvm.internal.o.b(this.f132093a, fcVar.f132093a) && kotlin.jvm.internal.o.b(this.f132094b, fcVar.f132094b) && kotlin.jvm.internal.o.b(this.f132095c, fcVar.f132095c) && this.f132096d == fcVar.f132096d && this.f132097e == fcVar.f132097e && this.f132098f == fcVar.f132098f && kotlin.jvm.internal.o.b(this.f132099g, fcVar.f132099g) && kotlin.jvm.internal.o.b(this.f132100h, fcVar.f132100h) && this.f132101i == fcVar.f132101i;
    }

    public int hashCode() {
        int hashCode = ((this.f132093a.hashCode() * 31) + this.f132094b.hashCode()) * 31;
        r45.xn1 xn1Var = this.f132095c;
        return ((((((((((((hashCode + (xn1Var == null ? 0 : xn1Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f132096d)) * 31) + java.lang.Boolean.hashCode(this.f132097e)) * 31) + java.lang.Boolean.hashCode(this.f132098f)) * 31) + this.f132099g.hashCode()) * 31) + this.f132100h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f132101i);
    }

    public java.lang.String toString() {
        return "PopupMenuConfig(anchorView=" + this.f132093a + ", uiParams=" + this.f132094b + ", contact=" + this.f132095c + ", isAssistant=" + this.f132096d + ", enableCustomMenuColor=" + this.f132097e + ", isBox=" + this.f132098f + ", boxId=" + this.f132099g + ", likeComment=" + this.f132100h + ", source=" + this.f132101i + ')';
    }
}
