package fh1;

/* loaded from: classes7.dex */
public final class m0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs(parcel.readString(), parcel.readString(), (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) parcel.readParcelable(com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs[i17];
    }
}
