package nk;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.HashSet hashSet = new java.util.HashSet(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            hashSet.add(com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator.CREATOR.createFromParcel(parcel));
        }
        return new com.tencent.mm.analyse.DownloadAnalyse$AnalyseData(hashSet);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.analyse.DownloadAnalyse$AnalyseData[i17];
    }
}
