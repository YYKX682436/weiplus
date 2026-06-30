package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class on extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.on f127324d = new com.tencent.mm.plugin.finder.storage.on();

    public on() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "发表安全预检测", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_post_pre_check_enable, false, 2, null);
        aVar.a("FINDER_POST_PRE_CHECK_ENABLE", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        return aVar;
    }
}
