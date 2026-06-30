package com.tencent.mm.plugin.finder.search.data;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/data/SearchHotWordListParcelable;", "Landroid/os/Parcelable;", "CREATOR", "nt2/b", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class SearchHotWordListParcelable implements android.os.Parcelable {
    public static final nt2.b CREATOR = new nt2.b(null);

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable f125660e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f125659d = "Finder.SearchHotWordList";

    /* renamed from: f, reason: collision with root package name */
    public int f125661f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f125662g = new java.util.LinkedList();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return this.f125660e + " pos:" + this.f125661f + " list:" + this.f125662g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeParcelable(this.f125660e, i17);
        parcel.writeInt(this.f125661f);
        parcel.writeTypedList(this.f125662g);
    }
}
