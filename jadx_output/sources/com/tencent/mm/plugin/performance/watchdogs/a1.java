package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f153004a;

    /* renamed from: b, reason: collision with root package name */
    public long f153005b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f153006c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f153007d;

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.tencent.mm.plugin.performance.watchdogs.a1) && this.f153005b == ((com.tencent.mm.plugin.performance.watchdogs.a1) obj).f153005b;
    }

    public int hashCode() {
        return (int) this.f153005b;
    }

    public java.lang.String toString() {
        return java.lang.String.format("name=%s tid=%s state=%s isHandlerThread=%s", this.f153004a, java.lang.Long.valueOf(this.f153005b), this.f153007d, java.lang.Boolean.valueOf(this.f153006c));
    }
}
