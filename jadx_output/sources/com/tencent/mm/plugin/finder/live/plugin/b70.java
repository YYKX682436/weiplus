package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b70 {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f111982a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f111983b;

    public b70(android.graphics.Bitmap bitmap, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        bitmap = (i17 & 1) != 0 ? null : bitmap;
        str = (i17 & 2) != 0 ? null : str;
        this.f111982a = bitmap;
        this.f111983b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.b70)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.b70 b70Var = (com.tencent.mm.plugin.finder.live.plugin.b70) obj;
        return kotlin.jvm.internal.o.b(this.f111982a, b70Var.f111982a) && kotlin.jvm.internal.o.b(this.f111983b, b70Var.f111983b);
    }

    public int hashCode() {
        android.graphics.Bitmap bitmap = this.f111982a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        java.lang.String str = this.f111983b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ItemData(bitmap=" + this.f111982a + ", url=" + this.f111983b + ')';
    }
}
