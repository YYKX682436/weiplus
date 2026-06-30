package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.l4 f127107d = new com.tencent.mm.plugin.finder.storage.l4();

    public l4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频全局续播头部阈值s", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_auto_seek_head_threshold, false, 2, null);
        aVar.a("FINDER_AUTO_SEEK_HEAD_THRESHOLD", kz5.c0.i(0, 10, 15), kz5.c0.i("0s", "10s", "15s"));
        return aVar;
    }
}
