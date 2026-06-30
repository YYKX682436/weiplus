package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class CreTypeRuleInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo> CREATOR = new at4.r();

    /* renamed from: d, reason: collision with root package name */
    public int f179627d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.CreExtInfo f179628e;

    public CreTypeRuleInfo(android.os.Parcel parcel) {
        this.f179627d = parcel.readInt();
        this.f179628e = (com.tencent.mm.plugin.wallet_core.model.CreExtInfo) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.model.CreExtInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f179627d);
        parcel.writeParcelable(this.f179628e, i17);
    }
}
