package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class k3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.pluginsdk.model.app.IPCInstallApp.IPCInstallAppParam(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.pluginsdk.model.app.IPCInstallApp.IPCInstallAppParam[i17];
    }
}
