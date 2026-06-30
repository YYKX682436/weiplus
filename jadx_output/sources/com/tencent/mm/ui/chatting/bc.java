package com.tencent.mm.ui.chatting;

/* loaded from: classes16.dex */
public class bc implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ui.chatting.QQMailHistoryExporter$ImageSpanData qQMailHistoryExporter$ImageSpanData = new com.tencent.mm.ui.chatting.QQMailHistoryExporter$ImageSpanData();
        qQMailHistoryExporter$ImageSpanData.f198298d = parcel.readInt();
        qQMailHistoryExporter$ImageSpanData.f198299e = parcel.readInt();
        qQMailHistoryExporter$ImageSpanData.f198300f = parcel.readString();
        qQMailHistoryExporter$ImageSpanData.f198301g = parcel.readInt();
        return qQMailHistoryExporter$ImageSpanData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.chatting.QQMailHistoryExporter$ImageSpanData[i17];
    }
}
