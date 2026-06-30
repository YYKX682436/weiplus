package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/FinderFeedInfoForVideoPlugin;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/a", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderFeedInfoForVideoPlugin implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.a CREATOR = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.a(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f186976d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f186977e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f186978f;

    /* renamed from: g, reason: collision with root package name */
    public int f186979g;

    /* renamed from: h, reason: collision with root package name */
    public int f186980h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("FinderFeedInfoForVideoPlugin{id: " + this.f186976d + ", isLike: " + this.f186977e + ", isFav: " + this.f186978f + ", likeCount: " + this.f186979g + ", favCount: " + this.f186980h + '}', java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f186976d);
        parcel.writeByte(this.f186977e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f186978f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f186979g);
        parcel.writeInt(this.f186980h);
    }
}
