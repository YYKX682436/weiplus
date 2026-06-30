package og3;

/* loaded from: classes4.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        boolean z17 = parcel.readInt() != 0;
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo.CREATOR.createFromParcel(parcel));
        }
        return new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo(z17, arrayList, parcel.readBundle(com.tencent.mm.plugin.mediabasic.data.MediaResultInfo.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo[i17];
    }
}
