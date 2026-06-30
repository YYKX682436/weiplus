package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class pj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(java.util.List list, java.util.List list2, java.lang.String str) {
        super(0);
        this.f209514d = list;
        this.f209515e = list2;
        this.f209516f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appear_type", "4");
        hashMap.put("exist_group_list_num", java.lang.String.valueOf(this.f209514d.size()));
        hashMap.put("select_num", java.lang.String.valueOf(this.f209515e.size()));
        hashMap.put("create_group_sessionid", this.f209516f);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", null, hashMap, 35568);
        return jz5.f0.f302826a;
    }
}
