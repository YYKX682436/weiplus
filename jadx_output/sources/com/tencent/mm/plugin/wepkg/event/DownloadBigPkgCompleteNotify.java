package com.tencent.mm.plugin.wepkg.event;

/* loaded from: classes8.dex */
public class DownloadBigPkgCompleteNotify implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify> CREATOR = new com.tencent.mm.plugin.wepkg.event.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f188325d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f188326e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f188327f;

    public DownloadBigPkgCompleteNotify(java.lang.String str, boolean z17, boolean z18) {
        this.f188325d = str;
        this.f188326e = z17;
        this.f188327f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f188325d);
        parcel.writeInt(this.f188326e ? 1 : 0);
        parcel.writeInt(this.f188327f ? 1 : 0);
    }

    public DownloadBigPkgCompleteNotify(android.os.Parcel parcel, com.tencent.mm.plugin.wepkg.event.a aVar) {
        this.f188325d = parcel.readString();
        this.f188326e = parcel.readInt() == 1;
        this.f188327f = parcel.readInt() == 1;
    }
}
