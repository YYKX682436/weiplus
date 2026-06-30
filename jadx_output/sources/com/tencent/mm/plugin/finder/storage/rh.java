package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class rh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.rh f127490d = new com.tencent.mm.plugin.finder.storage.rh();

    public rh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "LivePhoto预渲染开关", "FINDER_LIVE_PHOTO_PRE_RENDER_ENABLE", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_photo_pre_render_enable, false, 2, null);
        return aVar;
    }
}
