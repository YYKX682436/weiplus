package com.tencent.mm.ui.transmit.recent;

/* loaded from: classes8.dex */
public final class e implements android.os.Parcelable.Creator {
    public e(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        java.lang.String readString4 = parcel.readString();
        return new com.tencent.mm.ui.transmit.recent.ForwardConversationInfo(readString, readString2, readString3, readString4 != null ? readString4 : "");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.transmit.recent.ForwardConversationInfo[i17];
    }
}
