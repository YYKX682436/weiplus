package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class i00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.i00 f126919d = new com.tencent.mm.plugin.finder.storage.i00();

    public i00() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号会员动态", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_member_dynamic, false, 2, null);
        aVar.a("FinderMemberDynamic", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
