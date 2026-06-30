package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f144809a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f144810b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f144811c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f144812d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f144813e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f144814f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f144815g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo f144816h;

    public f0(boolean z17, boolean z18, java.lang.String label, java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable, java.lang.String str3) {
        kotlin.jvm.internal.o.g(label, "label");
        this.f144809a = z17;
        this.f144810b = z18;
        this.f144811c = label;
        this.f144812d = str;
        this.f144813e = str2;
        this.f144814f = drawable;
        this.f144815g = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.location.ui.impl.f0)) {
            return false;
        }
        com.tencent.mm.plugin.location.ui.impl.f0 f0Var = (com.tencent.mm.plugin.location.ui.impl.f0) obj;
        return this.f144809a == f0Var.f144809a && this.f144810b == f0Var.f144810b && kotlin.jvm.internal.o.b(this.f144811c, f0Var.f144811c) && kotlin.jvm.internal.o.b(this.f144812d, f0Var.f144812d) && kotlin.jvm.internal.o.b(this.f144813e, f0Var.f144813e) && kotlin.jvm.internal.o.b(this.f144814f, f0Var.f144814f) && kotlin.jvm.internal.o.b(this.f144815g, f0Var.f144815g);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Boolean.hashCode(this.f144809a) * 31) + java.lang.Boolean.hashCode(this.f144810b)) * 31) + this.f144811c.hashCode()) * 31;
        java.lang.String str = this.f144812d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f144813e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        android.graphics.drawable.Drawable drawable = this.f144814f;
        int hashCode4 = (hashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        java.lang.String str3 = this.f144815g;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PoiNavigateItem(isDevice=" + this.f144809a + ", isAd=" + this.f144810b + ", label=" + this.f144811c + ", desc=" + this.f144812d + ", packageName=" + this.f144813e + ", icon=" + this.f144814f + ", iconUrl=" + this.f144815g + ')';
    }
}
