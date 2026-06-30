package com.tencent.mm.plugin.rtos.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosQuickReplyList;", "Landroid/os/Parcelable;", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class RtosQuickReplyList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.rtos.model.RtosQuickReplyList> CREATOR = new jy3.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f158584d;

    public RtosQuickReplyList(java.util.ArrayList list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f158584d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.rtos.model.RtosQuickReplyList) && kotlin.jvm.internal.o.b(this.f158584d, ((com.tencent.mm.plugin.rtos.model.RtosQuickReplyList) obj).f158584d);
    }

    public int hashCode() {
        return this.f158584d.hashCode();
    }

    public java.lang.String toString() {
        return "RtosQuickReplyList(list=" + this.f158584d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.ArrayList arrayList = this.f158584d;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.rtos.model.RtosQuickReply) it.next()).writeToParcel(out, i17);
        }
    }
}
