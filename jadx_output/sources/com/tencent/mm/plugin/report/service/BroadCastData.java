package com.tencent.mm.plugin.report.service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class BroadCastData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.report.service.BroadCastData> CREATOR = new com.tencent.mm.plugin.report.service.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f158117d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f158118e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f158119f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f158120g;

    public BroadCastData() {
        this.f158117d = new java.util.ArrayList();
        this.f158118e = new java.util.ArrayList();
        this.f158119f = new java.util.ArrayList();
        long[] jArr = new long[1];
        this.f158120g = jArr;
        synchronized (jArr) {
            jArr[0] = 12;
        }
    }

    public final void a(int i17) {
        synchronized (this.f158120g) {
            long[] jArr = this.f158120g;
            jArr[0] = jArr[0] + i17;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f158117d);
        parcel.writeTypedList(this.f158118e);
        parcel.writeTypedList(this.f158119f);
    }

    public BroadCastData(com.tencent.mm.plugin.report.service.BroadCastData broadCastData) {
        long j17;
        this.f158117d = new java.util.ArrayList();
        this.f158118e = new java.util.ArrayList();
        this.f158119f = new java.util.ArrayList();
        long[] jArr = new long[1];
        this.f158120g = jArr;
        if (broadCastData == null) {
            return;
        }
        this.f158117d = new java.util.ArrayList(broadCastData.f158117d);
        this.f158118e = new java.util.ArrayList(broadCastData.f158118e);
        this.f158119f = new java.util.ArrayList(broadCastData.f158119f);
        synchronized (broadCastData.f158120g) {
            j17 = broadCastData.f158120g[0];
        }
        jArr[0] = j17;
    }

    public BroadCastData(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f158117d = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f158118e = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.f158119f = arrayList3;
        this.f158120g = new long[1];
        parcel.readTypedList(arrayList, com.tencent.mm.plugin.report.service.KVReportDataInfo.CREATOR);
        parcel.readTypedList(arrayList2, com.tencent.mm.plugin.report.service.StIDKeyDataInfo.CREATOR);
        parcel.readTypedList(arrayList3, com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo.CREATOR);
    }
}
