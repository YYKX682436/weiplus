package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes2.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f116969a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.no0 f116970b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f116971c;

    public c4(int i17, com.tencent.mm.plugin.finder.live.plugin.no0 plugin, android.graphics.Bitmap bitmap, int i18, kotlin.jvm.internal.i iVar) {
        bitmap = (i18 & 4) != 0 ? null : bitmap;
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f116969a = i17;
        this.f116970b = plugin;
        this.f116971c = bitmap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.viewmodel.c4)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.c4 c4Var = (com.tencent.mm.plugin.finder.live.viewmodel.c4) obj;
        return this.f116969a == c4Var.f116969a && kotlin.jvm.internal.o.b(this.f116970b, c4Var.f116970b) && kotlin.jvm.internal.o.b(this.f116971c, c4Var.f116971c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f116969a) * 31) + this.f116970b.hashCode()) * 31;
        android.graphics.Bitmap bitmap = this.f116971c;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public java.lang.String toString() {
        return "FinderLiveEndPageData(pageType=" + this.f116969a + ", plugin=" + this.f116970b + ", phBitmap=" + this.f116971c + ')';
    }
}
