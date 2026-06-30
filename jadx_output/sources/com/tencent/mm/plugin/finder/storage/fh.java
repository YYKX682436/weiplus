package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fh f126776d = new com.tencent.mm.plugin.finder.storage.fh();

    public fh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "视频号同城tab使用worker进行预加载", "FINDER_LBS_SAME_CITY_ENABLE_PRE_LOAD", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_lbs_same_city_enable_preload, false, 2, null);
        return aVar;
    }
}
