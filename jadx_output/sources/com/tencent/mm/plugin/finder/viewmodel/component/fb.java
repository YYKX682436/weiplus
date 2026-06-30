package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fb {

    /* renamed from: a, reason: collision with root package name */
    public final long f134386a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134387b;

    /* renamed from: c, reason: collision with root package name */
    public final long f134388c;

    public fb(long j17, int i17, long j18) {
        this.f134386a = j17;
        this.f134387b = i17;
        this.f134388c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.fb)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.fb fbVar = (com.tencent.mm.plugin.finder.viewmodel.component.fb) obj;
        return this.f134386a == fbVar.f134386a && this.f134387b == fbVar.f134387b && this.f134388c == fbVar.f134388c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f134386a) * 31) + java.lang.Integer.hashCode(this.f134387b)) * 31) + java.lang.Long.hashCode(this.f134388c);
    }

    public java.lang.String toString() {
        return "ActionRecord(feedId=" + this.f134386a + ", eventType=" + this.f134387b + ", timestampMs=" + this.f134388c + ')';
    }
}
