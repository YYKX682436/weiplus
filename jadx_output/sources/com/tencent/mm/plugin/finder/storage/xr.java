package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xr f128324d = new com.tencent.mm.plugin.finder.storage.xr();

    public xr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "个人中心合并开关", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_self_history_like_merge_switch, false, 2, null);
        aVar.a("FINDER_SELF_HISTORY_LIKE_MERGE_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
