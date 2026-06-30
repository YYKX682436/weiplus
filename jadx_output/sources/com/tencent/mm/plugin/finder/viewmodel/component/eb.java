package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public final long f134245a;

    /* renamed from: b, reason: collision with root package name */
    public long f134246b;

    /* renamed from: c, reason: collision with root package name */
    public int f134247c;

    public eb(long j17, long j18, int i17) {
        this.f134245a = j17;
        this.f134246b = j18;
        this.f134247c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.eb)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.eb ebVar = (com.tencent.mm.plugin.finder.viewmodel.component.eb) obj;
        return this.f134245a == ebVar.f134245a && this.f134246b == ebVar.f134246b && this.f134247c == ebVar.f134247c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f134245a) * 31) + java.lang.Long.hashCode(this.f134246b)) * 31) + java.lang.Integer.hashCode(this.f134247c);
    }

    public java.lang.String toString() {
        return "FeedRecord(feedId=" + this.f134245a + ", offset=" + this.f134246b + ", replayCount=" + this.f134247c + ')';
    }
}
