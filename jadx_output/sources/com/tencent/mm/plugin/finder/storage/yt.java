package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yt f128409d = new com.tencent.mm.plugin.finder.storage.yt();

    public yt() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "60s以上的视频 外显浅色进度条", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_show_progress_above_60_sec, false, 2, null);
        aVar.a("FINDER_SHOW_PROGRESS_ABOVE_60_SEC_VIDEO", kz5.c0.i(0, 3, 5), kz5.c0.i("默认", "3", "5"));
        return aVar;
    }
}
