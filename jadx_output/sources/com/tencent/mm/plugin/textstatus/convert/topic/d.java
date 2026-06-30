package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class d extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final nj4.e f173264d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f173265e;

    /* renamed from: f, reason: collision with root package name */
    public final int f173266f;

    /* renamed from: g, reason: collision with root package name */
    public final mj4.h f173267g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f173268h;

    public d(nj4.e groupItem, java.lang.String userName, int i17, mj4.h hVar, java.util.List list, int i18, kotlin.jvm.internal.i iVar) {
        hVar = (i18 & 8) != 0 ? null : hVar;
        list = (i18 & 16) != 0 ? null : list;
        kotlin.jvm.internal.o.g(groupItem, "groupItem");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f173264d = groupItem;
        this.f173265e = userName;
        this.f173266f = i17;
        this.f173267g = hVar;
        this.f173268h = list;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.tencent.mm.plugin.textstatus.convert.topic.d other = (com.tencent.mm.plugin.textstatus.convert.topic.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        java.lang.String str = this.f173265e;
        java.lang.String str2 = other.f173265e;
        return kotlin.jvm.internal.o.b(str, str2) && kotlin.jvm.internal.o.b(str, str2) && this.f173266f == other.f173266f && nj4.f.a(this.f173267g, other.f173267g);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.textstatus.convert.topic.d other = (com.tencent.mm.plugin.textstatus.convert.topic.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f173265e.hashCode();
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f173265e;
    }
}
