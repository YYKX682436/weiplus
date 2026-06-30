package com.tencent.mm.plugin.recordvideo.background;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/recordvideo/background/VideoMixer$MixConfig", "Landroid/os/Parcelable;", "CREATOR", "lt3/w", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VideoMixer$MixConfig implements android.os.Parcelable {
    public static final lt3.w CREATOR = new lt3.w(null);

    /* renamed from: d, reason: collision with root package name */
    public int f155641d;

    /* renamed from: e, reason: collision with root package name */
    public int f155642e;

    /* renamed from: f, reason: collision with root package name */
    public int f155643f;

    /* renamed from: g, reason: collision with root package name */
    public int f155644g;

    /* renamed from: h, reason: collision with root package name */
    public int f155645h;

    /* renamed from: i, reason: collision with root package name */
    public int f155646i;

    /* renamed from: m, reason: collision with root package name */
    public int f155647m;

    /* renamed from: n, reason: collision with root package name */
    public int f155648n;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "[MixConfig]videoWidth=" + this.f155641d + ", videoHeight=" + this.f155642e + ", videoBitrate=" + this.f155643f + ", audioBitrate=" + this.f155644g + ", audioSampleRate=" + this.f155645h + ", audioChannelCount=" + this.f155646i + ", videoFrameRate=" + this.f155647m + ", videoRotate=" + this.f155648n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f155641d);
        parcel.writeInt(this.f155642e);
        parcel.writeInt(this.f155643f);
        parcel.writeInt(this.f155644g);
        parcel.writeInt(this.f155645h);
        parcel.writeInt(this.f155646i);
        parcel.writeInt(this.f155647m);
        parcel.writeInt(this.f155648n);
    }
}
