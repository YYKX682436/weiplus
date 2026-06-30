package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long f117982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f117983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f117984c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f117985d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f117986e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f117987f;

    public ca(java.lang.Long l17, int i17, int i18, boolean z17, yz5.p pVar, yz5.a onClick) {
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f117982a = l17;
        this.f117983b = i17;
        this.f117984c = i18;
        this.f117986e = z17;
        this.f117987f = pVar;
        this.f117985d = onClick;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.ca)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.ca caVar = (com.tencent.mm.plugin.finder.live.widget.ca) obj;
        return kotlin.jvm.internal.o.b(this.f117982a, caVar.f117982a) && this.f117983b == caVar.f117983b && this.f117984c == caVar.f117984c && this.f117986e == caVar.f117986e && kotlin.jvm.internal.o.b(this.f117987f, caVar.f117987f) && kotlin.jvm.internal.o.b(this.f117985d, caVar.f117985d);
    }

    public int hashCode() {
        java.lang.Long l17 = this.f117982a;
        int hashCode = (((((((l17 == null ? 0 : l17.hashCode()) * 31) + java.lang.Integer.hashCode(this.f117983b)) * 31) + java.lang.Integer.hashCode(this.f117984c)) * 31) + java.lang.Boolean.hashCode(this.f117986e)) * 31;
        yz5.p pVar = this.f117987f;
        return ((hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31) + this.f117985d.hashCode();
    }

    public java.lang.String toString() {
        return "InviteeMoreItem(permFlag=" + this.f117982a + ", titleResId=" + this.f117983b + ", iconResId=" + this.f117984c + ", checkOptionEnabled=" + this.f117986e + ", optionFactory=" + this.f117987f + ", onClick=" + this.f117985d + ')';
    }

    public /* synthetic */ ca(java.lang.Long l17, int i17, int i18, boolean z17, yz5.p pVar, yz5.a aVar, int i19, kotlin.jvm.internal.i iVar) {
        this(l17, i17, i18, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? null : pVar, aVar);
    }
}
