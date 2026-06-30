package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class nc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.nc0 f127245d = new com.tencent.mm.plugin.finder.storage.nc0();

    public nc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表封面逻辑优化开关", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_post_thumb_opt, false, 2, null);
        aVar.a("FINDER_POST_THUMB_OPT", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
