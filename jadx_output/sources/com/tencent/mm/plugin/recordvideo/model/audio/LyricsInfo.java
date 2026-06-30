package com.tencent.mm.plugin.recordvideo.model.audio;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/model/audio/LyricsInfo;", "Landroid/os/Parcelable;", "CREATOR", "wt3/l0", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LyricsInfo implements android.os.Parcelable {
    public static final wt3.l0 CREATOR = new wt3.l0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f155730d;

    public LyricsInfo(java.util.List lyricDatas) {
        kotlin.jvm.internal.o.g(lyricDatas, "lyricDatas");
        this.f155730d = new java.util.ArrayList();
        java.util.Iterator it = lyricDatas.iterator();
        while (it.hasNext()) {
            this.f155730d.add(((r45.ge4) it.next()).toByteArray());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.util.ArrayList<byte[]> arrayList = this.f155730d;
        parcel.writeInt(arrayList.size());
        for (byte[] bArr : arrayList) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }
}
