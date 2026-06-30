package com.tencent.mm.ui.mmfb.sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public abstract class LoginMethodHandler implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f209188d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.LoginClient f209189e;

    public LoginMethodHandler(com.tencent.mm.ui.mmfb.sdk.LoginClient loginClient) {
        this.f209189e = loginClient;
    }

    public static void a(android.os.Parcel parcel, java.util.Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            parcel.writeString((java.lang.String) entry.getKey());
            parcel.writeString((java.lang.String) entry.getValue());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        a(parcel, this.f209188d);
    }

    public LoginMethodHandler(android.os.Parcel parcel) {
        java.util.HashMap hashMap;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (int i17 = 0; i17 < readInt; i17++) {
                hashMap2.put(parcel.readString(), parcel.readString());
            }
            hashMap = hashMap2;
        }
        this.f209188d = hashMap;
    }
}
