package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class r9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.r9 f127474d = new com.tencent.mm.plugin.finder.storage.r9();

    public r9() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "D-创建帐号-默认使用微信昵称", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_create_wxname_switch, false, 2, null);
        aVar.a("FINDER_CREATE_WXNAME_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
