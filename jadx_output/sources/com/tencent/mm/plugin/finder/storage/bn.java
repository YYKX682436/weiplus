package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class bn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.bn f126539d = new com.tencent.mm.plugin.finder.storage.bn();

    public bn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.7777778f, "发表封面预览订阅号大卡片比例");
        lb2.j.d(dVar, e42.c0.clicfg_finder_post_chat_cover_ratio, false, 2, null);
        dVar.a("FINDER_POST_CHAR_COVER_RATIO", kz5.c0.i(java.lang.Float.valueOf(1.3333334f), java.lang.Float.valueOf(1.7777778f), java.lang.Float.valueOf(1.0f)), kz5.c0.i("4 : 3", "16 : 9", "1 : 1"));
        return dVar;
    }
}
