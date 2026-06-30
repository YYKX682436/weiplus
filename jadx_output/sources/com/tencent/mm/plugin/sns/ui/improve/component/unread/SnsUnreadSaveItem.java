package com.tencent.mm.plugin.sns.ui.improve.component.unread;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/unread/SnsUnreadSaveItem;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class SnsUnreadSaveItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem> CREATOR = new oc4.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f169024d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f169025e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f169026f;

    public SnsUnreadSaveItem(java.lang.String feedId, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        this.f169024d = feedId;
        this.f169025e = z17;
        this.f169026f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem snsUnreadSaveItem = (com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem) obj;
        if (!kotlin.jvm.internal.o.b(this.f169024d, snsUnreadSaveItem.f169024d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return false;
        }
        if (this.f169025e != snsUnreadSaveItem.f169025e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return false;
        }
        boolean z17 = this.f169026f;
        boolean z18 = snsUnreadSaveItem.f169026f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return z17 == z18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        int hashCode = (((this.f169024d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f169025e)) * 31) + java.lang.Boolean.hashCode(this.f169026f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        java.lang.String str = "SnsUnreadSaveItem(feedId=" + this.f169024d + ", expose=" + this.f169025e + ", indicator=" + this.f169026f + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f169024d);
        out.writeInt(this.f169025e ? 1 : 0);
        out.writeInt(this.f169026f ? 1 : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
    }
}
