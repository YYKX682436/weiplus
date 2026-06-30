package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f122258a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122259b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f122260c;

    public b(com.tencent.mm.protobuf.g gVar, boolean z17, boolean z18) {
        this.f122258a = gVar;
        this.f122259b = z17;
        this.f122260c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.playlist.b)) {
            return false;
        }
        com.tencent.mm.plugin.finder.playlist.b bVar = (com.tencent.mm.plugin.finder.playlist.b) obj;
        return kotlin.jvm.internal.o.b(this.f122258a, bVar.f122258a) && this.f122259b == bVar.f122259b && this.f122260c == bVar.f122260c;
    }

    public int hashCode() {
        com.tencent.mm.protobuf.g gVar = this.f122258a;
        return ((((gVar == null ? 0 : gVar.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f122259b)) * 31) + java.lang.Boolean.hashCode(this.f122260c);
    }

    public java.lang.String toString() {
        return "Extra(lastBuffer=" + this.f122258a + ", upContinue=" + this.f122259b + ", downContinue=" + this.f122260c + ')';
    }
}
