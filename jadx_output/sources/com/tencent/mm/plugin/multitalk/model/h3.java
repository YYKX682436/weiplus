package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes8.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f149993a;

    /* renamed from: b, reason: collision with root package name */
    public int f149994b;

    /* renamed from: c, reason: collision with root package name */
    public int f149995c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f149996d;

    public h3(java.lang.String userName, int i17, int i18, android.graphics.Bitmap bitmap, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        bitmap = (i19 & 8) != 0 ? null : bitmap;
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f149993a = userName;
        this.f149994b = i17;
        this.f149995c = i18;
        this.f149996d = bitmap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.multitalk.model.h3)) {
            return false;
        }
        com.tencent.mm.plugin.multitalk.model.h3 h3Var = (com.tencent.mm.plugin.multitalk.model.h3) obj;
        return kotlin.jvm.internal.o.b(this.f149993a, h3Var.f149993a) && this.f149994b == h3Var.f149994b && this.f149995c == h3Var.f149995c && kotlin.jvm.internal.o.b(this.f149996d, h3Var.f149996d);
    }

    public int hashCode() {
        int hashCode = ((((this.f149993a.hashCode() * 31) + java.lang.Integer.hashCode(this.f149994b)) * 31) + java.lang.Integer.hashCode(this.f149995c)) * 31;
        android.graphics.Bitmap bitmap = this.f149996d;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public java.lang.String toString() {
        return "BitmapHolder(userName=" + this.f149993a + ", angle=" + this.f149994b + ", mirror=" + this.f149995c + ", dataBitmap=" + this.f149996d + ')';
    }
}
