package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class qj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f209571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209572f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(int i17, int i18, java.lang.String str) {
        super(0);
        this.f209570d = i17;
        this.f209571e = i18;
        this.f209572f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("exist_group_list_num", java.lang.String.valueOf(this.f209570d));
        hashMap.put("select_num", java.lang.String.valueOf(this.f209571e));
        java.lang.String str = this.f209572f;
        if (str == null) {
            str = "";
        }
        hashMap.put("create_group_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("the_same_add_new_group", null, hashMap, 35568);
        return jz5.f0.f302826a;
    }
}
