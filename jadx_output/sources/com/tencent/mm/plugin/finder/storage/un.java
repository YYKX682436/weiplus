package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class un extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.un f128147d = new com.tencent.mm.plugin.finder.storage.un();

    public un() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表水印检测", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_post_watermark_check_enable, false, 2, null);
        aVar.a("FINDER_POST_WATERMARK_CHECK_ENABLE", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        return aVar;
    }
}
