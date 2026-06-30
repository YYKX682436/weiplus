package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class w10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.w10 f128222d = new com.tencent.mm.plugin.finder.storage.w10();

    public w10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否打开帐号详情入口", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_show_account_detail, false, 2, null);
        aVar.a("IF_SHOW_ACCOUTN_DETAIL", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
