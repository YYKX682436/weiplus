package jv1;

/* loaded from: classes8.dex */
public class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState cDNTaskState = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState();
        cDNTaskState.f95511d = parcel.readInt();
        cDNTaskState.f95512e = parcel.readLong();
        cDNTaskState.f95513f = parcel.readLong();
        return cDNTaskState;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState[i17];
    }
}
