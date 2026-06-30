package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ci0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ci0 f126590d = new com.tencent.mm.plugin.finder.storage.ci0();

    public ci0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "FinderSync是否复制红点用于cgi上报", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_sync_copy_reddot_ctrl_info, false, 2, null);
        aVar.a("FINDER_SYNC_COPY_REDDOT_CTRL_INFO", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
