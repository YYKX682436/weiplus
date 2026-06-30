package o45;

/* loaded from: classes8.dex */
public class lg implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.protocal.JsapiPermissionWrapper(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.protocal.JsapiPermissionWrapper[i17];
    }
}
