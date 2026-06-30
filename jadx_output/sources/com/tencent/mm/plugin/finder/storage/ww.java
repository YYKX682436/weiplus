package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ww extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ww f128272d = new com.tencent.mm.plugin.finder.storage.ww();

    public ww() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(400, "feed长按出菜单时间(ms)", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_long_click_menu_time, false, 2, null);
        aVar.a("FINDER_TIMELINE_LONG_PRESS_TIMEOUT", kz5.c0.i(400, 450, 500, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.contact.n0.CTRL_INDEX), 600, java.lang.Integer.valueOf(me1.c.CTRL_INDEX), 700, 750, 800), kz5.c0.i("400(默认)", "450", "500", "550", "600", "650", "700", "750", "800"));
        return aVar;
    }
}
