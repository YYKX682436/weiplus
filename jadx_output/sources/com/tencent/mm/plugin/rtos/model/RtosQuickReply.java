package com.tencent.mm.plugin.rtos.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosQuickReply;", "Landroid/os/Parcelable;", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class RtosQuickReply implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.rtos.model.RtosQuickReply> CREATOR = new jy3.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f158582d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f158583e;

    public RtosQuickReply(int i17, java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f158582d = i17;
        this.f158583e = msg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.rtos.model.RtosQuickReply)) {
            return false;
        }
        com.tencent.mm.plugin.rtos.model.RtosQuickReply rtosQuickReply = (com.tencent.mm.plugin.rtos.model.RtosQuickReply) obj;
        return this.f158582d == rtosQuickReply.f158582d && kotlin.jvm.internal.o.b(this.f158583e, rtosQuickReply.f158583e);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f158582d) * 31) + this.f158583e.hashCode();
    }

    public java.lang.String toString() {
        return "RtosQuickReply(index=" + this.f158582d + ", msg=" + this.f158583e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f158582d);
        out.writeString(this.f158583e);
    }
}
