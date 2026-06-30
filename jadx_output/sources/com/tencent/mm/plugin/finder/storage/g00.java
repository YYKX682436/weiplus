package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class g00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.g00 f126799d = new com.tencent.mm.plugin.finder.storage.g00();

    public g00() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号会员兜底蒙层", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_member_cover_fallback, false, 2, null);
        aVar.a("FinderMemberCoverFallbackTest", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
