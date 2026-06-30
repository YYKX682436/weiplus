package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x50 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f120294a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f120295b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f120296c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f120297d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f120298e;

    public x50(java.lang.String id6, java.lang.String title, java.lang.Integer num, yz5.a aVar, yz5.a aVar2) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        this.f120294a = id6;
        this.f120295b = title;
        this.f120296c = num;
        this.f120297d = aVar;
        this.f120298e = aVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.x50)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.x50 x50Var = (com.tencent.mm.plugin.finder.live.widget.x50) obj;
        return kotlin.jvm.internal.o.b(this.f120294a, x50Var.f120294a) && kotlin.jvm.internal.o.b(this.f120295b, x50Var.f120295b) && kotlin.jvm.internal.o.b(this.f120296c, x50Var.f120296c) && kotlin.jvm.internal.o.b(this.f120297d, x50Var.f120297d) && kotlin.jvm.internal.o.b(this.f120298e, x50Var.f120298e);
    }

    public int hashCode() {
        int hashCode = ((this.f120294a.hashCode() * 31) + this.f120295b.hashCode()) * 31;
        java.lang.Integer num = this.f120296c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        yz5.a aVar = this.f120297d;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        yz5.a aVar2 = this.f120298e;
        return hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OptionItem(id=" + this.f120294a + ", title=" + this.f120295b + ", iconRes=" + this.f120296c + ", showCondition=" + this.f120297d + ", disableCondition=" + this.f120298e + ')';
    }

    public /* synthetic */ x50(java.lang.String str, java.lang.String str2, java.lang.Integer num, yz5.a aVar, yz5.a aVar2, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, (i17 & 4) != 0 ? null : num, (i17 & 8) != 0 ? null : aVar, (i17 & 16) != 0 ? null : aVar2);
    }
}
