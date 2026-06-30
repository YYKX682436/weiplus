package wk0;

/* loaded from: classes7.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper[i17];
    }
}
