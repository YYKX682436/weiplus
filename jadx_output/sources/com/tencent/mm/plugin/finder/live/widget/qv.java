package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qv {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h84 f119555a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f119556b;

    public qv(r45.h84 data, java.lang.String path) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(path, "path");
        this.f119555a = data;
        this.f119556b = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.qv)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.qv qvVar = (com.tencent.mm.plugin.finder.live.widget.qv) obj;
        return kotlin.jvm.internal.o.b(this.f119555a, qvVar.f119555a) && kotlin.jvm.internal.o.b(this.f119556b, qvVar.f119556b);
    }

    public int hashCode() {
        return (this.f119555a.hashCode() * 31) + this.f119556b.hashCode();
    }

    public java.lang.String toString() {
        return "LiveScreenEffectResourceWrap(data=" + this.f119555a + ", path=" + this.f119556b + ')';
    }
}
