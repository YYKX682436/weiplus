package com.tencent.mm.plugin.mediabasic.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaErrorInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final /* data */ class MediaErrorInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo> CREATOR = new og3.c();

    /* renamed from: d, reason: collision with root package name */
    public final og3.h f148602d;

    /* renamed from: e, reason: collision with root package name */
    public final int f148603e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f148604f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Bundle f148605g;

    public MediaErrorInfo(og3.h status, int i17, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        this.f148602d = status;
        this.f148603e = i17;
        this.f148604f = str;
        this.f148605g = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo)) {
            return false;
        }
        com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo mediaErrorInfo = (com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo) obj;
        return this.f148602d == mediaErrorInfo.f148602d && this.f148603e == mediaErrorInfo.f148603e && kotlin.jvm.internal.o.b(this.f148604f, mediaErrorInfo.f148604f) && kotlin.jvm.internal.o.b(this.f148605g, mediaErrorInfo.f148605g);
    }

    public int hashCode() {
        int hashCode = ((this.f148602d.hashCode() * 31) + java.lang.Integer.hashCode(this.f148603e)) * 31;
        java.lang.String str = this.f148604f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        android.os.Bundle bundle = this.f148605g;
        return hashCode2 + (bundle != null ? bundle.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MediaErrorInfo(status=" + this.f148602d + ", errorCode=" + this.f148603e + ", errorMsg=" + this.f148604f + ", extra=" + this.f148605g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f148602d.name());
        out.writeInt(this.f148603e);
        out.writeString(this.f148604f);
        out.writeBundle(this.f148605g);
    }

    public /* synthetic */ MediaErrorInfo(og3.h hVar, int i17, java.lang.String str, android.os.Bundle bundle, int i18, kotlin.jvm.internal.i iVar) {
        this(hVar, i17, (i18 & 4) != 0 ? null : str, (i18 & 8) != 0 ? null : bundle);
    }
}
