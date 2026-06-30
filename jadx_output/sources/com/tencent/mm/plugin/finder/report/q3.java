package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f125265a;

    /* renamed from: b, reason: collision with root package name */
    public long f125266b;

    /* renamed from: c, reason: collision with root package name */
    public long f125267c;

    public q3(java.lang.String feedId, long j17, long j18) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        this.f125265a = feedId;
        this.f125266b = j17;
        this.f125267c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.report.q3)) {
            return false;
        }
        com.tencent.mm.plugin.finder.report.q3 q3Var = (com.tencent.mm.plugin.finder.report.q3) obj;
        return kotlin.jvm.internal.o.b(this.f125265a, q3Var.f125265a) && this.f125266b == q3Var.f125266b && this.f125267c == q3Var.f125267c;
    }

    public int hashCode() {
        return (((this.f125265a.hashCode() * 31) + java.lang.Long.hashCode(this.f125266b)) * 31) + java.lang.Long.hashCode(this.f125267c);
    }

    public java.lang.String toString() {
        return "FinderSearchFeedInfo(feedId=" + this.f125265a + ", stayTimeInMs=" + this.f125266b + ", startPlayTime=" + this.f125267c + ')';
    }
}
