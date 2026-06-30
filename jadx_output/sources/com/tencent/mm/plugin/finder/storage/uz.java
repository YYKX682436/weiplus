package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class uz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.uz f128159d = new com.tencent.mm.plugin.finder.storage.uz();

    public uz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "半屏profile关注后推荐更多帐号", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_half_profile_follow_more_switch, false, 2, null);
        aVar.a("FinderHalfProfileFollowMore", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
