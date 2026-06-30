package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public long f175778a;

    /* renamed from: b, reason: collision with root package name */
    public long f175779b;

    public w0(long j17, long j18) {
        this.f175778a = j17;
        this.f175779b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.vlog.model.w0)) {
            return false;
        }
        com.tencent.mm.plugin.vlog.model.w0 w0Var = (com.tencent.mm.plugin.vlog.model.w0) obj;
        return this.f175778a == w0Var.f175778a && this.f175779b == w0Var.f175779b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f175778a) * 31) + java.lang.Long.hashCode(this.f175779b);
    }

    public java.lang.String toString() {
        return "PlayRange(start=" + this.f175778a + ", end=" + this.f175779b + ')';
    }
}
