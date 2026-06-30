package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f111774a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f111775b;

    public a(boolean z17, java.util.ArrayList data, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        data = (i17 & 2) != 0 ? new java.util.ArrayList() : data;
        kotlin.jvm.internal.o.g(data, "data");
        this.f111774a = z17;
        this.f111775b = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.a)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.a aVar = (com.tencent.mm.plugin.finder.live.plugin.a) obj;
        return this.f111774a == aVar.f111774a && kotlin.jvm.internal.o.b(this.f111775b, aVar.f111775b);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f111774a) * 31) + this.f111775b.hashCode();
    }

    public java.lang.String toString() {
        return "AudioStateData(isReady=" + this.f111774a + ", data=" + this.f111775b + ')';
    }
}
