package yv1;

/* loaded from: classes12.dex */
public final class o0 implements android.os.Parcelable.Creator {
    public o0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems = new com.tencent.mm.plugin.clean.CleanService$SelectedItems();
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            java.lang.String readString = parcel.readString();
            kotlin.jvm.internal.o.d(readString);
            yv1.p0 p0Var = new yv1.p0();
            cleanService$SelectedItems.f95641d.put(readString, p0Var);
            p0Var.f466133a = parcel.readLong();
            int readInt2 = parcel.readInt();
            java.util.HashSet hashSet = new java.util.HashSet(readInt2);
            p0Var.f466134b = hashSet;
            for (int i18 = 0; i18 < readInt2; i18++) {
                hashSet.add(java.lang.Long.valueOf(parcel.readLong()));
            }
        }
        return cleanService$SelectedItems;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.clean.CleanService$SelectedItems[i17];
    }
}
