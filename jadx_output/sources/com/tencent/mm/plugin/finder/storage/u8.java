package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class u8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.u8 f128122d = new com.tencent.mm.plugin.finder.storage.u8();

    public u8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(2, "评论进行删除、拉黑、投诉总共达到N次以上，弹提示。", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_level_1_set_privacy_hint_limit, false, 2, null);
        aVar.a("FINDER_COMMENT_LEVEL_1_SHOW_PRIVACY_HINT_LIMIT", kz5.c0.i(1, 2, 4), kz5.c0.i("1次", "2次（默认）", "4次"));
        return aVar;
    }
}
