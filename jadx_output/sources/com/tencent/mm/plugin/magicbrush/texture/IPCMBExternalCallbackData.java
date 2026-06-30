package com.tencent.mm.plugin.magicbrush.texture;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/texture/IPCMBExternalCallbackData;", "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class IPCMBExternalCallbackData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData> CREATOR = new ve3.v();

    /* renamed from: d, reason: collision with root package name */
    public final int f148159d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148160e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f148161f;

    public IPCMBExternalCallbackData(int i17, java.lang.String str, java.lang.String str2) {
        this.f148159d = i17;
        this.f148160e = str;
        this.f148161f = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData iPCMBExternalCallbackData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData) obj;
        return this.f148159d == iPCMBExternalCallbackData.f148159d && kotlin.jvm.internal.o.b(this.f148160e, iPCMBExternalCallbackData.f148160e) && kotlin.jvm.internal.o.b(this.f148161f, iPCMBExternalCallbackData.f148161f);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f148159d) * 31;
        java.lang.String str = this.f148160e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f148161f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "IPCMBExternalCallbackData(errCode=" + this.f148159d + ", errMsg=" + this.f148160e + ", extraData=" + this.f148161f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f148159d);
        out.writeString(this.f148160e);
        out.writeString(this.f148161f);
    }

    public /* synthetic */ IPCMBExternalCallbackData(int i17, java.lang.String str, java.lang.String str2, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? null : str2);
    }
}
