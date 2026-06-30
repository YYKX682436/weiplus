package com.tencent.mm.sticker.loader;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/sticker/loader/StickerLoadInfo;", "Landroid/os/Parcelable;", "plugin-sticker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class StickerLoadInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.sticker.loader.StickerLoadInfo> CREATOR = new u85.j();

    /* renamed from: d, reason: collision with root package name */
    public final int f193689d;

    /* renamed from: h, reason: collision with root package name */
    public int f193693h;

    /* renamed from: m, reason: collision with root package name */
    public int f193695m;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f193690e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f193691f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f193692g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f193694i = "";

    public StickerLoadInfo(int i17) {
        this.f193689d = i17;
    }

    public final java.lang.String a() {
        if (this.f193689d == 0) {
            return this.f193690e;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(this.f193694i);
        kotlin.jvm.internal.o.d(a17);
        return a17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f193689d);
        dest.writeString(this.f193690e);
        dest.writeString(this.f193691f);
        dest.writeString(this.f193692g);
        dest.writeInt(this.f193693h);
        dest.writeString(this.f193694i);
        dest.writeInt(this.f193695m);
    }
}
