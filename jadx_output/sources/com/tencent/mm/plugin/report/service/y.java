package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public class y implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.report.service.KVReportDataInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.report.service.KVReportDataInfo[i17];
    }
}
