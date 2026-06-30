package com.tencent.mm.plugin.mediabasic.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaResultInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class MediaResultInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.mediabasic.data.MediaResultInfo> CREATOR = new og3.f();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f148606d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f148607e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Bundle f148608f;

    public MediaResultInfo(boolean z17, java.util.ArrayList mediaList, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        this.f148606d = z17;
        this.f148607e = mediaList;
        this.f148608f = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.mediabasic.data.MediaResultInfo)) {
            return false;
        }
        com.tencent.mm.plugin.mediabasic.data.MediaResultInfo mediaResultInfo = (com.tencent.mm.plugin.mediabasic.data.MediaResultInfo) obj;
        return this.f148606d == mediaResultInfo.f148606d && kotlin.jvm.internal.o.b(this.f148607e, mediaResultInfo.f148607e) && kotlin.jvm.internal.o.b(this.f148608f, mediaResultInfo.f148608f);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f148606d) * 31) + this.f148607e.hashCode()) * 31;
        android.os.Bundle bundle = this.f148608f;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public java.lang.String toString() {
        return "MediaResultInfo(result=" + this.f148606d + ", mediaList=" + this.f148607e + ", extra=" + this.f148608f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f148606d ? 1 : 0);
        java.util.ArrayList arrayList = this.f148607e;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) it.next()).writeToParcel(out, i17);
        }
        out.writeBundle(this.f148608f);
    }
}
