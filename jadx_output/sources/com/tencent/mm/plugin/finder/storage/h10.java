package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class h10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.h10 f126864d = new com.tencent.mm.plugin.finder.storage.h10();

    public h10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "作者可设置关注7天才可评论弹幕私信", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_set_interation_limit, false, 2, null);
        aVar.a("FinderSetInterationLimit", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
