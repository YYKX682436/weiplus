package com.tencent.mm.plugin.finder.live.util;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/finder/live/util/IntentBufferSameProcess$BufferShell", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/finder/live/util/p1", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class IntentBufferSameProcess$BufferShell implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.finder.live.util.p1 CREATOR = new com.tencent.mm.plugin.finder.live.util.p1(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f115432d;

    public IntentBufferSameProcess$BufferShell(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f115432d = id6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.live.util.IntentBufferSameProcess$BufferShell) && kotlin.jvm.internal.o.b(this.f115432d, ((com.tencent.mm.plugin.finder.live.util.IntentBufferSameProcess$BufferShell) obj).f115432d);
    }

    public int hashCode() {
        return this.f115432d.hashCode();
    }

    public java.lang.String toString() {
        return "BufferShell(id=" + this.f115432d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f115432d);
    }
}
