package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f116931a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f116932b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f116933c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f116934d;

    public b6(java.lang.String url, java.lang.String thumbUrl, java.lang.String choosePath, java.lang.String str) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        kotlin.jvm.internal.o.g(choosePath, "choosePath");
        this.f116931a = url;
        this.f116932b = thumbUrl;
        this.f116933c = choosePath;
        this.f116934d = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.viewmodel.b6)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.b6 b6Var = (com.tencent.mm.plugin.finder.live.viewmodel.b6) obj;
        return kotlin.jvm.internal.o.b(this.f116931a, b6Var.f116931a) && kotlin.jvm.internal.o.b(this.f116932b, b6Var.f116932b) && kotlin.jvm.internal.o.b(this.f116933c, b6Var.f116933c) && kotlin.jvm.internal.o.b(this.f116934d, b6Var.f116934d);
    }

    public int hashCode() {
        int hashCode = ((((this.f116931a.hashCode() * 31) + this.f116932b.hashCode()) * 31) + this.f116933c.hashCode()) * 31;
        java.lang.String str = this.f116934d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "CoverUrlDataItem(url=" + this.f116931a + ", thumbUrl=" + this.f116932b + ", choosePath=" + this.f116933c + ", fileMd5=" + this.f116934d + ')';
    }
}
