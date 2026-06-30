package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mc f127187d = new com.tencent.mm.plugin.finder.storage.mc();

    public mc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "feed图片曝光上报开关", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_feed_photo_exp_report, false);
        aVar.a("FINDER_FEED_PHOTO_EXP_REPORT", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
