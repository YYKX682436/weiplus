package p21;

/* loaded from: classes14.dex */
public class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = new com.tencent.mm.modeltalkroom.MultiTalkGroupMember();
        multiTalkGroupMember.f71612d = parcel.readString();
        multiTalkGroupMember.f71613e = parcel.readString();
        multiTalkGroupMember.f71614f = parcel.readInt();
        multiTalkGroupMember.f71615g = parcel.readInt();
        multiTalkGroupMember.f71616h = parcel.readInt();
        return multiTalkGroupMember;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.modeltalkroom.MultiTalkGroupMember[i17];
    }
}
