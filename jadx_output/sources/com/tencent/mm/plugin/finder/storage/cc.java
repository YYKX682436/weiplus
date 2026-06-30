package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cc f126577d = new com.tencent.mm.plugin.finder.storage.cc();

    public cc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "关注互动消息+粉丝列表是否展示logo", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_fans_show_logo, false, 2, null);
        aVar.a("FINDER_FANS_LOGO_SHOW", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
