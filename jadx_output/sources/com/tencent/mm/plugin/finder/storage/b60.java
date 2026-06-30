package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class b60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.b60 f126505d = new com.tencent.mm.plugin.finder.storage.b60();

    public b60() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "无spec时，视频码率默认选择", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_video_without_spec_default_bitrate, false, 2, null);
        aVar.a("WITHOUT_SPEC_DEFAULT_BIT_RATE", kz5.c0.i(0, 1), kz5.c0.i("xVO", "xV2/xV1"));
        return aVar;
    }
}
