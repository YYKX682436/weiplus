package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class id {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f118667a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f118668b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f118669c;

    public id(boolean z17, java.lang.String desc, java.lang.String descExtend) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(descExtend, "descExtend");
        this.f118667a = z17;
        this.f118668b = desc;
        this.f118669c = descExtend;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.id)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.id idVar = (com.tencent.mm.plugin.finder.live.widget.id) obj;
        return this.f118667a == idVar.f118667a && kotlin.jvm.internal.o.b(this.f118668b, idVar.f118668b) && kotlin.jvm.internal.o.b(this.f118669c, idVar.f118669c);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f118667a) * 31) + this.f118668b.hashCode()) * 31) + this.f118669c.hashCode();
    }

    public java.lang.String toString() {
        return "EditResult(isNewWay=" + this.f118667a + ", desc=" + this.f118668b + ", descExtend=" + this.f118669c + ')';
    }
}
