package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes4.dex */
public final class k implements android.os.Parcelable.Creator {
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
                arrayList2.add(com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData.CREATOR.createFromParcel(parcel));
            }
            arrayList = arrayList2;
        }
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData(arrayList, parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData[i17];
    }
}
