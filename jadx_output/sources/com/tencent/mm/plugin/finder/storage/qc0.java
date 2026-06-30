package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qc0 f127424d = new com.tencent.mm.plugin.finder.storage.qc0();

    public qc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "发表大卡->胶囊切换间隔", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_post_tips_card_to_capsule_duration, false);
        aVar.a("FINDER_POST_TIPS_CARD_TO_CAPSULE_DURATION", kz5.c0.i(5, 10, 30), kz5.c0.i("5秒(默认)", "10秒", "30秒"));
        return aVar;
    }
}
