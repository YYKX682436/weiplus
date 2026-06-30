package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f117211a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f117212b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f117213c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f117214d;

    public l2(int i17, java.lang.String title, java.lang.String desc, boolean z17) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f117211a = i17;
        this.f117212b = title;
        this.f117213c = desc;
        this.f117214d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.viewmodel.l2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.l2 l2Var = (com.tencent.mm.plugin.finder.live.viewmodel.l2) obj;
        return this.f117211a == l2Var.f117211a && kotlin.jvm.internal.o.b(this.f117212b, l2Var.f117212b) && kotlin.jvm.internal.o.b(this.f117213c, l2Var.f117213c) && this.f117214d == l2Var.f117214d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f117211a) * 31) + this.f117212b.hashCode()) * 31) + this.f117213c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f117214d);
    }

    public java.lang.String toString() {
        return "SubVisibleInfo(subType=" + this.f117211a + ", title=" + this.f117212b + ", desc=" + this.f117213c + ", isOpen=" + this.f117214d + ')';
    }
}
