package j63;

/* loaded from: classes7.dex */
public final class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(readInt);
            for (int i17 = 0; i17 != readInt; i17++) {
                arrayList2.add(com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload.CREATOR.createFromParcel(parcel));
            }
            arrayList = arrayList2;
        }
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload[i17];
    }
}
