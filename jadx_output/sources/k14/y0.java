package k14;

/* loaded from: classes8.dex */
public class y0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.setting.model.UserAuthItemParcelable userAuthItemParcelable = new com.tencent.mm.plugin.setting.model.UserAuthItemParcelable();
        userAuthItemParcelable.f160054d = parcel.readString();
        userAuthItemParcelable.f160055e = parcel.readString();
        userAuthItemParcelable.f160056f = parcel.readInt();
        userAuthItemParcelable.f160057g = parcel.readInt();
        return userAuthItemParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.setting.model.UserAuthItemParcelable[i17];
    }
}
