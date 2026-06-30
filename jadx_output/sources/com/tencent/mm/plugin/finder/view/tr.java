package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class tr {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f133148a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f133149b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f133150c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f133151d;

    public tr(java.lang.String id6, java.lang.String displayText, boolean z17, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        list = (i17 & 8) != 0 ? null : list;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(displayText, "displayText");
        this.f133148a = id6;
        this.f133149b = displayText;
        this.f133150c = z17;
        this.f133151d = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.tr)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.tr trVar = (com.tencent.mm.plugin.finder.view.tr) obj;
        return kotlin.jvm.internal.o.b(this.f133148a, trVar.f133148a) && kotlin.jvm.internal.o.b(this.f133149b, trVar.f133149b) && this.f133150c == trVar.f133150c && kotlin.jvm.internal.o.b(this.f133151d, trVar.f133151d);
    }

    public int hashCode() {
        int hashCode = ((((this.f133148a.hashCode() * 31) + this.f133149b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f133150c)) * 31;
        java.util.List list = this.f133151d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public java.lang.String toString() {
        return "OptionItem(id=" + this.f133148a + ", displayText=" + this.f133149b + ", isSelected=" + this.f133150c + ", payload=" + this.f133151d + ')';
    }
}
