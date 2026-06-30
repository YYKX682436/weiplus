package com.tencent.mm.plugin.sns.ui.widget.multi_image.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/multi_image/data/SnsDraftMultiPicItems;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class SnsDraftMultiPicItems implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems> CREATOR = new fe4.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f171205d;

    public SnsDraftMultiPicItems(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f171205d = items;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f171205d, ((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems) obj).f171205d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        int hashCode = this.f171205d.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        java.lang.String str = "SnsDraftMultiPicItems(items=" + this.f171205d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f171205d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems");
    }
}
