package com.tencent.mm.plugin.sns.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/data/SnsBgmInfo;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class SnsBgmInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.data.SnsBgmInfo> CREATOR = new ca4.o0();

    /* renamed from: d, reason: collision with root package name */
    public final int f164016d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164017e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f164018f;

    public SnsBgmInfo(int i17, java.lang.String listenId, boolean z17) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        this.f164016d = i17;
        this.f164017e = listenId;
        this.f164018f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.data.SnsBgmInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.data.SnsBgmInfo snsBgmInfo = (com.tencent.mm.plugin.sns.data.SnsBgmInfo) obj;
        if (this.f164016d != snsBgmInfo.f164016d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f164017e, snsBgmInfo.f164017e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
            return false;
        }
        boolean z17 = this.f164018f;
        boolean z18 = snsBgmInfo.f164018f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        return z17 == z18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        int hashCode = (((java.lang.Integer.hashCode(this.f164016d) * 31) + this.f164017e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f164018f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        java.lang.String str = "SnsBgmInfo(bgmType=" + this.f164016d + ", listenId=" + this.f164017e + ", isMajorOwned=" + this.f164018f + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f164016d);
        out.writeString(this.f164017e);
        out.writeInt(this.f164018f ? 1 : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
    }
}
