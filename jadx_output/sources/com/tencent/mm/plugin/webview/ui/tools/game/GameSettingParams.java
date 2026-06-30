package com.tencent.mm.plugin.webview.ui.tools.game;

/* loaded from: classes8.dex */
public class GameSettingParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams> CREATOR = new sx4.w();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f184762d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f184763e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f184764f;

    public GameSettingParams(android.os.Parcel parcel, sx4.w wVar) {
        this.f184762d = parcel.readString();
        this.f184763e = parcel.readString();
        this.f184764f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f184762d);
        parcel.writeString(this.f184763e);
        parcel.writeString(this.f184764f);
    }
}
