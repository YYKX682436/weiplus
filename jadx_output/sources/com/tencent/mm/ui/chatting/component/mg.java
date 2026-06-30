package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public final class mg implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f199506d;

    /* renamed from: e, reason: collision with root package name */
    public final int f199507e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f199508f;

    public mg(int i17, int i18, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        z17 = (i19 & 4) != 0 ? false : z17;
        this.f199506d = i17;
        this.f199507e = i18;
        this.f199508f = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.component.mg)) {
            return false;
        }
        com.tencent.mm.ui.chatting.component.mg mgVar = (com.tencent.mm.ui.chatting.component.mg) obj;
        return this.f199506d == mgVar.f199506d && this.f199507e == mgVar.f199507e && this.f199508f == mgVar.f199508f;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f199506d;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f199506d) * 31) + java.lang.Integer.hashCode(this.f199507e)) * 31) + java.lang.Boolean.hashCode(this.f199508f);
    }

    public java.lang.String toString() {
        return "LangItemData(lanId=" + this.f199506d + ", lanStringRes=" + this.f199507e + ", isSelect=" + this.f199508f + ')';
    }
}
