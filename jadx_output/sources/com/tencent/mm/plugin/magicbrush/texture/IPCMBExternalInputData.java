package com.tencent.mm.plugin.magicbrush.texture;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/texture/IPCMBExternalInputData;", "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class IPCMBExternalInputData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData> CREATOR = new ve3.w();

    /* renamed from: d, reason: collision with root package name */
    public final ve3.u f148162d;

    /* renamed from: e, reason: collision with root package name */
    public final int f148163e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f148164f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f148165g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Parcelable f148166h;

    public IPCMBExternalInputData(ve3.u action, int i17, java.lang.String str, java.lang.String str2, android.os.Parcelable parcelable) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f148162d = action;
        this.f148163e = i17;
        this.f148164f = str;
        this.f148165g = str2;
        this.f148166h = parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData iPCMBExternalInputData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData) obj;
        return this.f148162d == iPCMBExternalInputData.f148162d && this.f148163e == iPCMBExternalInputData.f148163e && kotlin.jvm.internal.o.b(this.f148164f, iPCMBExternalInputData.f148164f) && kotlin.jvm.internal.o.b(this.f148165g, iPCMBExternalInputData.f148165g) && kotlin.jvm.internal.o.b(this.f148166h, iPCMBExternalInputData.f148166h);
    }

    public int hashCode() {
        int hashCode = ((this.f148162d.hashCode() * 31) + java.lang.Integer.hashCode(this.f148163e)) * 31;
        java.lang.String str = this.f148164f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f148165g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        android.os.Parcelable parcelable = this.f148166h;
        return hashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "IPCMBExternalInputData(action=" + this.f148162d + ", id=" + this.f148163e + ", type=" + this.f148164f + ", extraData=" + this.f148165g + ", payload=" + this.f148166h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f148162d.name());
        out.writeInt(this.f148163e);
        out.writeString(this.f148164f);
        out.writeString(this.f148165g);
        out.writeParcelable(this.f148166h, i17);
    }

    public /* synthetic */ IPCMBExternalInputData(ve3.u uVar, int i17, java.lang.String str, java.lang.String str2, android.os.Parcelable parcelable, int i18, kotlin.jvm.internal.i iVar) {
        this(uVar, i17, str, (i18 & 8) != 0 ? null : str2, (i18 & 16) != 0 ? null : parcelable);
    }
}
