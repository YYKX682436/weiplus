package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mo f127206d = new com.tencent.mm.plugin.finder.storage.mo();

    public mo() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "全部tab兜底开关（勿手动设置）", null, null, 12, null);
        aVar.a("FINDER_PROFILE_ALL_UIC_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_profile_all_tab_uic_enable_android, false, 2, null);
        return aVar;
    }
}
