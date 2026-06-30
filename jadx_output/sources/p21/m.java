package p21;

/* loaded from: classes14.dex */
public class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.modeltalkroom.VideoGroupMember videoGroupMember = new com.tencent.mm.modeltalkroom.VideoGroupMember();
        videoGroupMember.f71618d = parcel.readInt();
        videoGroupMember.f71619e = parcel.readString();
        videoGroupMember.f71620f = parcel.readInt();
        videoGroupMember.f71621g = parcel.readInt();
        videoGroupMember.f71622h = parcel.readInt();
        videoGroupMember.f71623i = parcel.readInt();
        return videoGroupMember;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.modeltalkroom.VideoGroupMember[i17];
    }
}
