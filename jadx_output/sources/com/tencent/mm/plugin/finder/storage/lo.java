package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lo f127148d = new com.tencent.mm.plugin.finder.storage.lo();

    public lo() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否开启全部tab", null, null, 12, null);
        aVar.a("FINDER_ALL_TAB_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar.c(e42.c0.clicfg_finder_profile_all_tab_switch_android, false);
        return aVar;
    }
}
