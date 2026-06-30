package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public final class sg implements android.os.Parcelable.Creator {
    public sg(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo = new com.tencent.mm.ui.PocketMoneyEntryInfo(null, null, null, null, null, null, null, null, null, null, 1023, null);
        pocketMoneyEntryInfo.f197037d = source.readString();
        pocketMoneyEntryInfo.f197038e = source.readString();
        pocketMoneyEntryInfo.f197039f = source.readString();
        pocketMoneyEntryInfo.f197040g = source.readString();
        pocketMoneyEntryInfo.f197041h = source.readString();
        pocketMoneyEntryInfo.f197042i = source.readString();
        pocketMoneyEntryInfo.f197043m = source.readString();
        pocketMoneyEntryInfo.f197044n = source.readString();
        pocketMoneyEntryInfo.f197045o = source.readString();
        pocketMoneyEntryInfo.f197046p = source.readString();
        return pocketMoneyEntryInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.PocketMoneyEntryInfo[i17];
    }
}
