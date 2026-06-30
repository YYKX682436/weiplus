package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f149008a;

    /* renamed from: b, reason: collision with root package name */
    public final long f149009b;

    /* renamed from: c, reason: collision with root package name */
    public final int f149010c;

    public e0(int i17, long j17, int i18) {
        this.f149008a = i17;
        this.f149009b = j17;
        this.f149010c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.mmsight.segment.e0)) {
            return false;
        }
        com.tencent.mm.plugin.mmsight.segment.e0 e0Var = (com.tencent.mm.plugin.mmsight.segment.e0) obj;
        return this.f149008a == e0Var.f149008a && this.f149009b == e0Var.f149009b && this.f149010c == e0Var.f149010c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f149008a) * 31) + java.lang.Long.hashCode(this.f149009b)) * 31) + java.lang.Integer.hashCode(this.f149010c);
    }

    public java.lang.String toString() {
        return "Item(time=" + this.f149008a + ", durationMs=" + this.f149009b + ", type=" + this.f149010c + ')';
    }
}
