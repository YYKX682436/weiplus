package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class e40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.e40 f126689d = new com.tencent.mm.plugin.finder.storage.e40();

    public e40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "截屏上报", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_android_report_when_screen_shot, false, 2, null);
        aVar.a("FINDER_REPORT_WHEN_SCREEN_SHOT", new java.util.ArrayList(kz5.c0.i(1, 0)), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
