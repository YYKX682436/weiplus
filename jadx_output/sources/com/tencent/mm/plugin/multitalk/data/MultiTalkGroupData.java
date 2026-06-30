package com.tencent.mm.plugin.multitalk.data;

/* loaded from: classes14.dex */
public class MultiTalkGroupData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.multitalk.data.MultiTalkGroupData> CREATOR = new aj3.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modeltalkroom.MultiTalkGroup f149494d;

    public MultiTalkGroupData(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        this.f149494d = multiTalkGroup;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = this.f149494d;
        java.lang.String str = multiTalkGroup.f71606d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = multiTalkGroup.f71607e;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = multiTalkGroup.f71608f;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        parcel.writeInt(multiTalkGroup.f71609g);
        java.lang.String str4 = multiTalkGroup.f71610h;
        parcel.writeString(str4 != null ? str4 : "");
        parcel.writeInt(multiTalkGroup.f71611i.size());
        for (int i18 = 0; i18 < multiTalkGroup.f71611i.size(); i18++) {
            parcel.writeParcelable(new com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) multiTalkGroup.f71611i.get(i18)), i17);
        }
    }
}
