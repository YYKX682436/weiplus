package com.tencent.mm.plugin.msg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/msg/MsgIdTalker;", "Landroid/os/Parcelable;", "oi3/b", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class MsgIdTalker implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final long f149480d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f149481e;

    /* renamed from: f, reason: collision with root package name */
    public static final oi3.b f149478f = new oi3.b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.msg.MsgIdTalker f149479g = new com.tencent.mm.plugin.msg.MsgIdTalker(0, null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.msg.MsgIdTalker> CREATOR = new oi3.a();

    public MsgIdTalker(long j17, java.lang.String str) {
        this.f149480d = j17;
        this.f149481e = str;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f149481e;
        return str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.plugin.msg.MsgIdTalker)) {
            return false;
        }
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) obj;
        return this.f149480d == msgIdTalker.f149480d && kotlin.jvm.internal.o.b(a(), msgIdTalker.a());
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.f149480d), a());
    }

    public java.lang.String toString() {
        return this.f149480d + ", " + this.f149481e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeLong(this.f149480d);
        parcel.writeString(this.f149481e);
    }
}
