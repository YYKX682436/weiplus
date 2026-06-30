package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w70 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vw4 f120158a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f120159b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f120160c;

    public w70(r45.vw4 type, java.lang.String title, java.lang.String desc) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f120158a = type;
        this.f120159b = title;
        this.f120160c = desc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.w70)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.w70 w70Var = (com.tencent.mm.plugin.finder.live.widget.w70) obj;
        return this.f120158a == w70Var.f120158a && kotlin.jvm.internal.o.b(this.f120159b, w70Var.f120159b) && kotlin.jvm.internal.o.b(this.f120160c, w70Var.f120160c);
    }

    public int hashCode() {
        return (((this.f120158a.hashCode() * 31) + this.f120159b.hashCode()) * 31) + this.f120160c.hashCode();
    }

    public java.lang.String toString() {
        return "Type(type=" + this.f120158a + ", title=" + this.f120159b + ", desc=" + this.f120160c + ')';
    }
}
