package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes9.dex */
public final class k extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final b11.e f204817d;

    public k(b11.e wrapper) {
        kotlin.jvm.internal.o.g(wrapper, "wrapper");
        this.f204817d = wrapper;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.k other = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.k) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(v(), other.v()) && this.f204817d.f17035b.getCreateTime() == other.f204817d.f17035b.getCreateTime();
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.k other = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.k) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return java.lang.Long.signum(this.f204817d.f17035b.getCreateTime() - other.f204817d.f17035b.getCreateTime());
    }

    @Override // xm3.d
    public java.lang.String v() {
        b11.e eVar = this.f204817d;
        java.lang.String j17 = eVar.f17035b.j();
        return j17 == null ? java.lang.String.valueOf(eVar.f17035b.hashCode()) : j17;
    }
}
