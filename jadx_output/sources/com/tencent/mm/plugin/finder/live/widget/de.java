package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h84 f118100a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f118101b;

    public de(r45.h84 data, java.lang.String path) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(path, "path");
        this.f118100a = data;
        this.f118101b = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.de)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.de deVar = (com.tencent.mm.plugin.finder.live.widget.de) obj;
        return kotlin.jvm.internal.o.b(this.f118100a, deVar.f118100a) && kotlin.jvm.internal.o.b(this.f118101b, deVar.f118101b);
    }

    public int hashCode() {
        return (this.f118100a.hashCode() * 31) + this.f118101b.hashCode();
    }

    public java.lang.String toString() {
        return "LiveElementResourceWrap(data=" + this.f118100a + ", path=" + this.f118101b + ')';
    }
}
