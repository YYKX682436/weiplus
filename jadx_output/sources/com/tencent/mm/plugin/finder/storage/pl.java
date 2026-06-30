package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pl f127382d = new com.tencent.mm.plugin.finder.storage.pl();

    public pl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否开启手势切Tab", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_gesture_view_pager_home_ui, false, 2, null);
        aVar.a("FINDER_OPEN_GESTURE_HOME_UI", kz5.c0.i(0, 1), kz5.c0.i("关闭(0)", "打开(1)"));
        return aVar;
    }
}
