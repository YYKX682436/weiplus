package com.tencent.mm.plugin.mediabasic.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaSingleInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MediaSingleInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo> CREATOR = new og3.g();

    /* renamed from: d, reason: collision with root package name */
    public final og3.a f148609d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148610e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo f148611f;

    public MediaSingleInfo(og3.a type, java.lang.String path, com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo durationInfo) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(durationInfo, "durationInfo");
        this.f148609d = type;
        this.f148610e = path;
        this.f148611f = durationInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo)) {
            return false;
        }
        com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo = (com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) obj;
        return this.f148609d == mediaSingleInfo.f148609d && kotlin.jvm.internal.o.b(this.f148610e, mediaSingleInfo.f148610e) && kotlin.jvm.internal.o.b(this.f148611f, mediaSingleInfo.f148611f);
    }

    public int hashCode() {
        return (((this.f148609d.hashCode() * 31) + this.f148610e.hashCode()) * 31) + this.f148611f.hashCode();
    }

    public java.lang.String toString() {
        return "MediaSingleInfo(type=" + this.f148609d + ", path=" + this.f148610e + ", durationInfo=" + this.f148611f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f148609d.name());
        out.writeString(this.f148610e);
        this.f148611f.writeToParcel(out, i17);
    }

    public MediaSingleInfo(og3.a aVar, java.lang.String str, com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo mediaDurationInfo, int i17, kotlin.jvm.internal.i iVar) {
        this(aVar, str, (i17 & 4) != 0 ? new com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo(0L, 2147483647L) : mediaDurationInfo);
    }
}
