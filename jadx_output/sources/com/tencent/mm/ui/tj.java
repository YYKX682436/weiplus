package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class tj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.hj f209955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(java.lang.String str, java.util.List list, java.util.List list2, com.tencent.mm.ui.hj hjVar) {
        super(0);
        this.f209952d = str;
        this.f209953e = list;
        this.f209954f = list2;
        this.f209955g = hjVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("create_group_sessionid", this.f209952d);
        hashMap.put("exist_group_list_num", java.lang.String.valueOf(this.f209953e.size()));
        java.util.List list = this.f209954f;
        hashMap.put("select_num", java.lang.String.valueOf(list.size()));
        hashMap.put("appear_type", "4");
        com.tencent.mm.ui.hj hjVar = this.f209955g;
        hashMap.put("group_index", java.lang.String.valueOf(hjVar.f208887e));
        hashMap.put("group_member_num", java.lang.String.valueOf(list.size()));
        hashMap.put("chat_username", hjVar.f208886d);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 35568);
        return jz5.f0.f302826a;
    }
}
