package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cp f126599d = new com.tencent.mm.plugin.finder.storage.cp();

    public cp() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "Profile展示原创声明功能可点态", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_profile_show_original_declare_switch, false, 2, null);
        aVar.a("FINDER_PROFILE_SHOW_ORIGINAL_DECLARE_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
