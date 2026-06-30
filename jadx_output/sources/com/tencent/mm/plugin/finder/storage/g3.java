package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.g3 f126804d = new com.tencent.mm.plugin.finder.storage.g3();

    public g3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1801, "发表相册选择视频最大时长-中高端", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_album_select_max_duration, false, 2, null);
        aVar.a("FINDER_ALBUM_VIDEO_MAX_DURATION", kz5.c0.i(1801, 2701, 3601), kz5.c0.i("30分钟", "45分钟", "60分钟"));
        return aVar;
    }
}
