package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jp f127024d = new com.tencent.mm.plugin.finder.storage.jp();

    public jp() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "finderUserpage对于feed头像点击场景加上sessionBuffer", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_profile_userpage_add_session_buffer_switch, false, 2, null);
        aVar.a("FinderProfileUserpageAddSessionBuffer", kz5.c0.i(0, 1), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
