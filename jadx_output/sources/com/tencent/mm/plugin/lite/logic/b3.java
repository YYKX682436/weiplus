package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class b3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData = new com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData();
        mMLiteAppScheduleData.f143881d = parcel.readInt();
        mMLiteAppScheduleData.f143882e = parcel.readInt();
        mMLiteAppScheduleData.f143883f = parcel.readString();
        mMLiteAppScheduleData.f143884g = parcel.readString();
        mMLiteAppScheduleData.f143885h = parcel.readByte() == 1;
        mMLiteAppScheduleData.f143886i = parcel.readInt();
        mMLiteAppScheduleData.f143887m = parcel.readLong();
        mMLiteAppScheduleData.f143888n = parcel.readLong();
        return mMLiteAppScheduleData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData[i17];
    }
}
