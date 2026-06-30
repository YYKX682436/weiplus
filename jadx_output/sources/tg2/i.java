package tg2;

/* loaded from: classes3.dex */
public final class i implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419175d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f419176e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f419177f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f419178g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f419179h;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        this.f419175d = str;
        this.f419176e = str2;
        this.f419177f = str3;
        this.f419178g = z17;
        this.f419179h = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg2.i)) {
            return false;
        }
        tg2.i iVar = (tg2.i) obj;
        return kotlin.jvm.internal.o.b(this.f419175d, iVar.f419175d) && kotlin.jvm.internal.o.b(this.f419176e, iVar.f419176e) && kotlin.jvm.internal.o.b(this.f419177f, iVar.f419177f) && this.f419178g == iVar.f419178g && this.f419179h == iVar.f419179h;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public int hashCode() {
        java.lang.String str = this.f419175d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f419176e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f419177f;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f419178g)) * 31) + java.lang.Boolean.hashCode(this.f419179h);
    }

    public java.lang.String toString() {
        return "SendGiftTargetConvertData(userName=" + this.f419175d + ", nickName=" + this.f419176e + ", avatarUrl=" + this.f419177f + ", isAnchor=" + this.f419178g + ", isChecked=" + this.f419179h + ')';
    }
}
