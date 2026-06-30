package com.tencent.mm.plugin.wallet.wecoin.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/model/WecoinEncashKVData;", "Landroid/os/Parcelable;", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WecoinEncashKVData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData> CREATOR = new ms4.p0();

    /* renamed from: d, reason: collision with root package name */
    public final int f179136d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f179137e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f179138f;

    public WecoinEncashKVData(int i17, java.lang.String str, java.lang.String str2) {
        this.f179136d = i17;
        this.f179137e = str;
        this.f179138f = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f179136d);
        dest.writeString(this.f179137e);
        dest.writeString(this.f179138f);
    }
}
