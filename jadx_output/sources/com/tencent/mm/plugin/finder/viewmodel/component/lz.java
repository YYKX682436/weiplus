package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lz {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f135097a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f135098b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135099c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f135100d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Long f135101e;

    public lz(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.Long l17) {
        this.f135097a = str;
        this.f135098b = str2;
        this.f135099c = z17;
        this.f135100d = str3;
        this.f135101e = l17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.lz)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar = (com.tencent.mm.plugin.finder.viewmodel.component.lz) obj;
        return kotlin.jvm.internal.o.b(this.f135097a, lzVar.f135097a) && kotlin.jvm.internal.o.b(this.f135098b, lzVar.f135098b) && this.f135099c == lzVar.f135099c && kotlin.jvm.internal.o.b(this.f135100d, lzVar.f135100d) && kotlin.jvm.internal.o.b(this.f135101e, lzVar.f135101e);
    }

    public int hashCode() {
        java.lang.String str = this.f135097a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f135098b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f135099c)) * 31;
        java.lang.String str3 = this.f135100d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Long l17 = this.f135101e;
        return hashCode3 + (l17 != null ? l17.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AuthorItem(nickname=");
        sb6.append(this.f135097a);
        sb6.append(", username.length=");
        java.lang.String str = this.f135100d;
        sb6.append(str != null ? java.lang.Integer.valueOf(str.length()) : null);
        sb6.append(", showDot=");
        sb6.append(this.f135099c);
        sb6.append(", avatarUrl.length=");
        java.lang.String str2 = this.f135098b;
        sb6.append(str2 != null ? java.lang.Integer.valueOf(str2.length()) : null);
        sb6.append(", unreadObjectId=");
        sb6.append(this.f135101e);
        sb6.append(')');
        return sb6.toString();
    }
}
