package com.tencent.mm.ui.chatting;

/* loaded from: classes16.dex */
public class QQMailHistoryExporter$ImageSpanData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ui.chatting.QQMailHistoryExporter$ImageSpanData> CREATOR = new com.tencent.mm.ui.chatting.bc();

    /* renamed from: d, reason: collision with root package name */
    public int f198298d;

    /* renamed from: e, reason: collision with root package name */
    public int f198299e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198300f;

    /* renamed from: g, reason: collision with root package name */
    public int f198301g = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f198298d);
        parcel.writeInt(this.f198299e);
        parcel.writeString(this.f198300f);
        parcel.writeInt(this.f198301g);
    }
}
