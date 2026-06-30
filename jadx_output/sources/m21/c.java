package m21;

/* loaded from: classes4.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick();
        snsAdClick.f71466d = parcel.readInt();
        snsAdClick.f71467e = parcel.readInt();
        snsAdClick.f71468f = parcel.readLong();
        snsAdClick.f71469g = parcel.readInt();
        snsAdClick.f71470h = parcel.readInt();
        snsAdClick.f71472m = parcel.readInt();
        snsAdClick.f71473n = parcel.readInt();
        snsAdClick.f71471i = parcel.readLong();
        snsAdClick.f71475p = parcel.readLong();
        snsAdClick.f71477r = parcel.readLong();
        snsAdClick.f71478s = parcel.readLong();
        snsAdClick.f71479t = parcel.readInt();
        snsAdClick.f71480u = parcel.readString();
        return snsAdClick;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.modelsns.SnsAdClick[i17];
    }
}
