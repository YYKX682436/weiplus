package com.tencent.mm.plugin.magicbrush.texture;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/texture/IPCExternalTextureEventData;", "Landroid/os/Parcelable;", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class IPCExternalTextureEventData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData> CREATOR = new ve3.t();

    /* renamed from: d, reason: collision with root package name */
    public final int f148156d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148157e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f148158f;

    public IPCExternalTextureEventData(int i17, java.lang.String eventType, java.lang.String str) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        this.f148156d = i17;
        this.f148157e = eventType;
        this.f148158f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData iPCExternalTextureEventData = (com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData) obj;
        return this.f148156d == iPCExternalTextureEventData.f148156d && kotlin.jvm.internal.o.b(this.f148157e, iPCExternalTextureEventData.f148157e) && kotlin.jvm.internal.o.b(this.f148158f, iPCExternalTextureEventData.f148158f);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f148156d) * 31) + this.f148157e.hashCode()) * 31;
        java.lang.String str = this.f148158f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "IPCExternalTextureEventData(id=" + this.f148156d + ", eventType=" + this.f148157e + ", extraDataJsonString=" + this.f148158f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f148156d);
        out.writeString(this.f148157e);
        out.writeString(this.f148158f);
    }
}
