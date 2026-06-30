package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class CustomTabLoginMethodHandler extends com.tencent.mm.ui.mmfb.sdk.WebLoginMethodHandler {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler> CREATOR = new com.tencent.mm.ui.mmfb.sdk.e();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f209164f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f209165g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f209166h;

    public CustomTabLoginMethodHandler(com.tencent.mm.ui.mmfb.sdk.LoginClient loginClient) {
        super(loginClient);
        this.f209166h = "";
        this.f209165g = new java.math.BigInteger(100, new java.util.Random()).toString(32);
        this.f209166h = "fb290293790992170://authorize";
    }

    public static java.util.Map b(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < readInt; i17++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f209165g);
    }

    public CustomTabLoginMethodHandler(android.os.Parcel parcel) {
        super(parcel);
        this.f209166h = "";
        this.f209165g = parcel.readString();
    }
}
