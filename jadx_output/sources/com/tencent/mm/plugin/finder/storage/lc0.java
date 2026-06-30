package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lc0 f127129d = new com.tencent.mm.plugin.finder.storage.lc0();

    public lc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "发表显示团购分享计划弹窗最多显示次数", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_post_show_store_promote_dialog_limit, false, 2, null);
        aVar.a("FINDER_POST_SHOW_STORE_PROMOTE_DIALOG_LIMIT", kz5.c0.i(1, 100), kz5.c0.i("1次", "100次"));
        return aVar;
    }
}
