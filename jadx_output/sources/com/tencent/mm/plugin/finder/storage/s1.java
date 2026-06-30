package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.s1 f127516d = new com.tencent.mm.plugin.finder.storage.s1();

    public s1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否打开私信入口", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_msg_entrance_enable, false, 2, null);
        aVar.a("ENABLE_FINDER_MESSAGE", kz5.c0.i(0, 1, 0), kz5.c0.i("默认", "打开", "关闭"));
        return aVar;
    }
}
