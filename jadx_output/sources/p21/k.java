package p21;

/* loaded from: classes4.dex */
public class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.modeltalkroom.SubscribeVideoMember subscribeVideoMember = new com.tencent.mm.modeltalkroom.SubscribeVideoMember();
        subscribeVideoMember.f71617d = parcel.readInt();
        return subscribeVideoMember;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.modeltalkroom.SubscribeVideoMember[i17];
    }
}
