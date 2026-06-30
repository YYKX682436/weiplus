package com.tencent.mm.plugin.multitalk.data;

/* loaded from: classes14.dex */
public class MultiTalkGroupMemberData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData> CREATOR = new aj3.b();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modeltalkroom.MultiTalkGroupMember f149495d;

    public MultiTalkGroupMemberData(com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember) {
        this.f149495d = multiTalkGroupMember;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = this.f149495d;
        java.lang.String str = multiTalkGroupMember.f71612d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = multiTalkGroupMember.f71613e;
        parcel.writeString(str2 != null ? str2 : "");
        parcel.writeInt(multiTalkGroupMember.f71614f);
        parcel.writeInt(multiTalkGroupMember.f71615g);
        parcel.writeInt(multiTalkGroupMember.f71616h);
    }
}
