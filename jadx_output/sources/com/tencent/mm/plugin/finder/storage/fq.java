package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fq f126788d = new com.tencent.mm.plugin.finder.storage.fq();

    public fq() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "3tab流刷新保留当前及往上的历史feed", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_refresh_leave_upper_history_feed, false, 2, null);
        aVar.a("FINDER_REFRESH_LEAVE_UPPER_HISTORY_FEED", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
