package com.tencent.mm.plugin.finder.search.data;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/data/SearchHotWordParcelable;", "Landroid/os/Parcelable;", "CREATOR", "nt2/c", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class SearchHotWordParcelable implements android.os.Parcelable {
    public static final nt2.c CREATOR = new nt2.c(null);

    /* renamed from: d, reason: collision with root package name */
    public r45.lu2 f125663d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        r45.lu2 lu2Var = this.f125663d;
        java.lang.String string = lu2Var != null ? lu2Var.getString(0) : null;
        return string == null ? "null" : string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        r45.lu2 lu2Var = this.f125663d;
        if (lu2Var != null) {
            byte[] byteArray = lu2Var.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        }
    }
}
