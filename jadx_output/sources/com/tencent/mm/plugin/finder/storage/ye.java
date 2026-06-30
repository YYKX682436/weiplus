package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ye extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ye f128383d = new com.tencent.mm.plugin.finder.storage.ye();

    public ye() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3000, "❤️引导tips轮播时间(秒)", null, null, 12, null);
        aVar.a("THUMB_HEART_LIKE_EDU_ANIMATION_DURATION_MS", kz5.c0.i(2000, 4000, 5000), kz5.c0.i("2", "4", "5"));
        lb2.j.d(aVar, e42.c0.clicfg_heart_like_edu_tips_duration, false, 2, null);
        return aVar;
    }
}
