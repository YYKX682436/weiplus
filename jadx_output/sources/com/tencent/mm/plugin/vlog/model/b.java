package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175544a;

    /* renamed from: b, reason: collision with root package name */
    public final long f175545b;

    /* renamed from: c, reason: collision with root package name */
    public final long f175546c;

    public b(java.lang.String path, long j17, long j18) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f175544a = path;
        this.f175545b = j17;
        this.f175546c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.vlog.model.b)) {
            return false;
        }
        com.tencent.mm.plugin.vlog.model.b bVar = (com.tencent.mm.plugin.vlog.model.b) obj;
        return kotlin.jvm.internal.o.b(this.f175544a, bVar.f175544a) && this.f175545b == bVar.f175545b && this.f175546c == bVar.f175546c;
    }

    public int hashCode() {
        return (((this.f175544a.hashCode() * 31) + java.lang.Long.hashCode(this.f175545b)) * 31) + java.lang.Long.hashCode(this.f175546c);
    }

    public java.lang.String toString() {
        return "ABAVideoInfo(path=" + this.f175544a + ", videoStart=" + this.f175545b + ", videoEnd=" + this.f175546c + ')';
    }
}
