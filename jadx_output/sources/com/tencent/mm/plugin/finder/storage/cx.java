package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes3.dex */
public final class cx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cx f126607d = new com.tencent.mm.plugin.finder.storage.cx();

    public cx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(Integer.MAX_VALUE, "3tab流支持横滑横滑的门槛值", com.tencent.mm.plugin.finder.storage.bx.f126549d, null, 8, null);
        aVar.a("FINDER_TIMELINE_TAB_LAYOUT_ENABLE_SCROALL_THRESHOLD", kz5.c0.i(3, 4, Integer.MAX_VALUE), kz5.c0.i("3个tab", "4个tab", "不滑动"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_timeline_tab_layout_enable_scroll_threshold, false, 2, null);
        aVar.f317745p = "常用";
        return aVar;
    }
}
