package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f201320a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f201321b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f201322c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f201323d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f201324e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f201325f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelmulti.SourceImgInfo f201326g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f201327h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f201328i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f201329j;

    /* renamed from: k, reason: collision with root package name */
    public final int f201330k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f201331l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f201332m;

    public r3(int i17, java.lang.String str, boolean z17, boolean z18, boolean z19, java.lang.String str2, com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo, boolean z27, java.lang.Integer num, boolean z28, int i18, com.tencent.mm.storage.f9 f9Var, boolean z29) {
        this.f201320a = i17;
        this.f201321b = str;
        this.f201322c = z17;
        this.f201323d = z18;
        this.f201324e = z19;
        this.f201325f = str2;
        this.f201326g = sourceImgInfo;
        this.f201327h = z27;
        this.f201328i = num;
        this.f201329j = z28;
        this.f201330k = i18;
        this.f201331l = f9Var;
        this.f201332m = z29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.gallery.r3)) {
            return false;
        }
        com.tencent.mm.ui.chatting.gallery.r3 r3Var = (com.tencent.mm.ui.chatting.gallery.r3) obj;
        return this.f201320a == r3Var.f201320a && kotlin.jvm.internal.o.b(this.f201321b, r3Var.f201321b) && this.f201322c == r3Var.f201322c && this.f201323d == r3Var.f201323d && this.f201324e == r3Var.f201324e && kotlin.jvm.internal.o.b(this.f201325f, r3Var.f201325f) && kotlin.jvm.internal.o.b(this.f201326g, r3Var.f201326g) && this.f201327h == r3Var.f201327h && kotlin.jvm.internal.o.b(this.f201328i, r3Var.f201328i) && this.f201329j == r3Var.f201329j && this.f201330k == r3Var.f201330k && kotlin.jvm.internal.o.b(this.f201331l, r3Var.f201331l) && this.f201332m == r3Var.f201332m;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f201320a) * 31;
        java.lang.String str = this.f201321b;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f201322c)) * 31) + java.lang.Boolean.hashCode(this.f201323d)) * 31) + java.lang.Boolean.hashCode(this.f201324e)) * 31;
        java.lang.String str2 = this.f201325f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo = this.f201326g;
        int hashCode4 = (((hashCode3 + (sourceImgInfo == null ? 0 : sourceImgInfo.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f201327h)) * 31;
        java.lang.Integer num = this.f201328i;
        int hashCode5 = (((((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f201329j)) * 31) + java.lang.Integer.hashCode(this.f201330k)) * 31;
        com.tencent.mm.storage.f9 f9Var = this.f201331l;
        return ((hashCode5 + (f9Var != null ? f9Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f201332m);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ImageGalleryOPLayerViewConfig(position=");
        sb6.append(this.f201320a);
        sb6.append(", hdLeghtStr=");
        sb6.append(this.f201321b);
        sb6.append(", isVideo=");
        sb6.append(this.f201322c);
        sb6.append(", showJumpMiniProgram=");
        sb6.append(this.f201323d);
        sb6.append(", showReadOrigin=");
        sb6.append(this.f201324e);
        sb6.append(", launchAppBrandBtnDesc=");
        sb6.append(this.f201325f);
        sb6.append(", showImageLink=");
        sb6.append(this.f201326g != null);
        sb6.append(", originMediaShow=");
        sb6.append(this.f201327h);
        sb6.append(", originMediaProgress=");
        sb6.append(this.f201328i);
        sb6.append(", disabledOpLayer=");
        sb6.append(this.f201329j);
        sb6.append(')');
        return sb6.toString();
    }
}
