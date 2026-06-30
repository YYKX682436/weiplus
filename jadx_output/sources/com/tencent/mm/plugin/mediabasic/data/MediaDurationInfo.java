package com.tencent.mm.plugin.mediabasic.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaDurationInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MediaDurationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo> CREATOR = new og3.b();

    /* renamed from: d, reason: collision with root package name */
    public final long f148600d;

    /* renamed from: e, reason: collision with root package name */
    public final long f148601e;

    public MediaDurationInfo(long j17, long j18) {
        this.f148600d = j17;
        this.f148601e = j18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo)) {
            return false;
        }
        com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo mediaDurationInfo = (com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo) obj;
        return this.f148600d == mediaDurationInfo.f148600d && this.f148601e == mediaDurationInfo.f148601e;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f148600d) * 31) + java.lang.Long.hashCode(this.f148601e);
    }

    public java.lang.String toString() {
        return "MediaDurationInfo(startMs=" + this.f148600d + ", endMs=" + this.f148601e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f148600d);
        out.writeLong(this.f148601e);
    }
}
