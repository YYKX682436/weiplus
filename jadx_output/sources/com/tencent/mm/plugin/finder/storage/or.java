package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class or extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.or f127328d = new com.tencent.mm.plugin.finder.storage.or();

    public or() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(60, "视频号进度条精细化调节 支持时长", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_seek_bar_fine_adjust_support_duration_android, false, 2, null);
        aVar.a("FINDER_SEEK_BAR_FINE_ADJUST_SUPPORT_DURATION", kz5.c0.i(30, 60, 120), kz5.c0.i("30s", "60s", "120s"));
        return aVar;
    }
}
