package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mw f127214d = new com.tencent.mm.plugin.finder.storage.mw();

    public mw() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "拇指爱心赞动画只在中心出现, 不跟随双击位置", "FINDER_THUMB_HEART_ANIM_ALWAYS_CENTER", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_thumb_heart_anim_always_center_android, false, 2, null);
        return aVar;
    }
}
