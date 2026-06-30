package nt2;

/* loaded from: classes15.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable searchHotWordParcelable = new com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        r45.lu2 lu2Var = new r45.lu2();
        lu2Var.parseFrom(bArr);
        searchHotWordParcelable.f125663d = lu2Var;
        return searchHotWordParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable[i17];
    }
}
