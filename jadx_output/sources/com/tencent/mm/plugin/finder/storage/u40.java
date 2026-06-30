package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class u40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.u40 f128116d = new com.tencent.mm.plugin.finder.storage.u40();

    public u40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "支持匿名赞", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_self_private_like_enable, false, 2, null);
        aVar.a("USERINFO_SELF_PRIVATE_LIKE_INT_SYNC", new java.util.ArrayList(kz5.c0.i(0, 1, 0)), kz5.c0.i("默认", "支持", "不支持"));
        return aVar;
    }
}
