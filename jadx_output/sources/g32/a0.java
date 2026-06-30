package g32;

/* loaded from: classes8.dex */
public class a0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo[i17];
    }
}
