package com.tencent.mm.plugin.webwx.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webwx/model/AutoDownloadAddTaskData;", "Landroid/os/Parcelable;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AutoDownloadAddTaskData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webwx.model.AutoDownloadAddTaskData> CREATOR = new iy4.h();

    /* renamed from: d, reason: collision with root package name */
    public final long f187958d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f187959e;

    public AutoDownloadAddTaskData(long j17, java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f187958d = j17;
        this.f187959e = talker;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webwx.model.AutoDownloadAddTaskData)) {
            return false;
        }
        com.tencent.mm.plugin.webwx.model.AutoDownloadAddTaskData autoDownloadAddTaskData = (com.tencent.mm.plugin.webwx.model.AutoDownloadAddTaskData) obj;
        return this.f187958d == autoDownloadAddTaskData.f187958d && kotlin.jvm.internal.o.b(this.f187959e, autoDownloadAddTaskData.f187959e);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f187958d) * 31) + this.f187959e.hashCode();
    }

    public java.lang.String toString() {
        return "AutoDownloadAddTaskData(msgId=" + this.f187958d + ", talker=" + this.f187959e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f187958d);
        out.writeString(this.f187959e);
    }
}
