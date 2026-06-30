package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f161406a;

    /* renamed from: b, reason: collision with root package name */
    public final int f161407b;

    /* renamed from: c, reason: collision with root package name */
    public final int f161408c;

    /* renamed from: d, reason: collision with root package name */
    public final int f161409d;

    /* renamed from: e, reason: collision with root package name */
    public int f161410e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f161411f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f161412g;

    /* renamed from: h, reason: collision with root package name */
    public final int f161413h;

    /* renamed from: i, reason: collision with root package name */
    public final int f161414i;

    public p(int i17, int i18, int i19, int i27, int i28, java.util.List list, java.lang.String qrUrl, int i29, int i37, int i38, kotlin.jvm.internal.i iVar) {
        i27 = (i38 & 8) != 0 ? 0 : i27;
        i28 = (i38 & 16) != 0 ? 0 : i28;
        list = (i38 & 32) != 0 ? null : list;
        qrUrl = (i38 & 64) != 0 ? "" : qrUrl;
        i29 = (i38 & 128) != 0 ? 0 : i29;
        i37 = (i38 & 256) != 0 ? 0 : i37;
        kotlin.jvm.internal.o.g(qrUrl, "qrUrl");
        this.f161406a = i17;
        this.f161407b = i18;
        this.f161408c = i19;
        this.f161409d = i27;
        this.f161410e = i28;
        this.f161411f = list;
        this.f161412g = qrUrl;
        this.f161413h = i29;
        this.f161414i = i37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.setting.ui.setting.p)) {
            return false;
        }
        com.tencent.mm.plugin.setting.ui.setting.p pVar = (com.tencent.mm.plugin.setting.ui.setting.p) obj;
        return this.f161406a == pVar.f161406a && this.f161407b == pVar.f161407b && this.f161408c == pVar.f161408c && this.f161409d == pVar.f161409d && this.f161410e == pVar.f161410e && kotlin.jvm.internal.o.b(this.f161411f, pVar.f161411f) && kotlin.jvm.internal.o.b(this.f161412g, pVar.f161412g) && this.f161413h == pVar.f161413h && this.f161414i == pVar.f161414i;
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f161406a) * 31) + java.lang.Integer.hashCode(this.f161407b)) * 31) + java.lang.Integer.hashCode(this.f161408c)) * 31) + java.lang.Integer.hashCode(this.f161409d)) * 31) + java.lang.Integer.hashCode(this.f161410e)) * 31;
        java.util.List list = this.f161411f;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f161412g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f161413h)) * 31) + java.lang.Integer.hashCode(this.f161414i);
    }

    public java.lang.String toString() {
        return "QRInfo(sortIndex=" + this.f161406a + ", qrcodeStyle=" + this.f161407b + ", bgType=" + this.f161408c + ", bgResource=" + this.f161409d + ", bgDominatorColorSize=" + this.f161410e + ", bgDominators=" + this.f161411f + ", qrUrl=" + this.f161412g + ", gradientCodeColor1=" + this.f161413h + ", gradientCodeColor2=" + this.f161414i + ')';
    }
}
