package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.m2 f127164d = new com.tencent.mm.plugin.finder.storage.m2();

    public m2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号finderStream上报未读占位符feed", null, null, 12, null);
        aVar.a("FFINDER_STREAM_ENABLE_REPORT_UNREAD_PLACEHOLD_FEED", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_stream_report_unread_placehold_feed, false, 2, null);
        return aVar;
    }
}
