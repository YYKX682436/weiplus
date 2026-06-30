package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class c00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.c00 f126554d = new com.tencent.mm.plugin.finder.storage.c00();

    public c00() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "赞行为触发轮播 是否只触发热评类型", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_carousel_trigger_only_hot_comment_android, false, 2, null);
        aVar.a("FinderLikeToPlayOnlyHotComment", kz5.c0.i(0, 1), kz5.c0.i("0-可触发任何类型", "1-只触发热评类型"));
        return aVar;
    }
}
