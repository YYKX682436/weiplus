package k36;

/* loaded from: classes13.dex */
public class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new oicq.wlogin_sdk.tools.ErrMsg(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new oicq.wlogin_sdk.tools.ErrMsg[i17];
    }
}
