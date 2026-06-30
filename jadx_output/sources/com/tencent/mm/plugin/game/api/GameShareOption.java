package com.tencent.mm.plugin.game.api;

/* loaded from: classes8.dex */
public class GameShareOption implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.api.GameShareOption> CREATOR = new m33.z0();

    /* renamed from: d, reason: collision with root package name */
    public final int f138694d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f138695e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f138696f;

    public GameShareOption(int i17, java.lang.String str, boolean z17) {
        this.f138696f = false;
        this.f138694d = i17;
        this.f138695e = str;
        this.f138696f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f138694d);
        parcel.writeString(this.f138695e);
        parcel.writeInt(this.f138696f ? 1 : 0);
    }

    public GameShareOption(android.os.Parcel parcel) {
        this.f138696f = false;
        this.f138694d = parcel.readInt();
        this.f138695e = parcel.readString();
        this.f138696f = parcel.readInt() == 1;
    }
}
