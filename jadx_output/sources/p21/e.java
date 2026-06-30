package p21;

/* loaded from: classes14.dex */
public class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = new com.tencent.mm.modeltalkroom.MultiTalkGroup();
        multiTalkGroup.f71606d = parcel.readString();
        multiTalkGroup.f71607e = parcel.readString();
        multiTalkGroup.f71608f = parcel.readString();
        multiTalkGroup.f71609g = parcel.readInt();
        multiTalkGroup.f71610h = parcel.readString();
        int readInt = parcel.readInt();
        multiTalkGroup.f71611i = new java.util.ArrayList();
        for (int i17 = 0; i17 < readInt; i17++) {
            com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = (com.tencent.mm.modeltalkroom.MultiTalkGroupMember) parcel.readParcelable(com.tencent.mm.modeltalkroom.MultiTalkGroupMember.class.getClassLoader());
            if (multiTalkGroupMember != null) {
                multiTalkGroup.f71611i.add(multiTalkGroupMember);
            }
        }
        return multiTalkGroup;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.modeltalkroom.MultiTalkGroup[i17];
    }
}
