package nt2;

/* loaded from: classes15.dex */
public final class b implements android.os.Parcelable.Creator {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable a(r45.lu2 lu2Var, int i17, java.util.List list) {
        com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable searchHotWordParcelable = new com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable();
        searchHotWordParcelable.f125663d = lu2Var;
        com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable searchHotWordListParcelable = new com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable();
        searchHotWordListParcelable.f125660e = searchHotWordParcelable;
        searchHotWordListParcelable.f125661f = i17;
        searchHotWordListParcelable.f125662g = b(list);
        return searchHotWordListParcelable;
    }

    public final java.util.LinkedList b(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.lu2 lu2Var = (r45.lu2) it.next();
                com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable searchHotWordParcelable = new com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable();
                searchHotWordParcelable.f125663d = lu2Var;
                linkedList.add(searchHotWordParcelable);
            }
        }
        return linkedList;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable searchHotWordListParcelable = new com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable();
        searchHotWordListParcelable.f125660e = (com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable) parcel.readParcelable(com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable.class.getClassLoader());
        searchHotWordListParcelable.f125661f = parcel.readInt();
        parcel.readTypedList(searchHotWordListParcelable.f125662g, com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable.CREATOR);
        return searchHotWordListParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable[i17];
    }
}
