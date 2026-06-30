package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lx f127157d = new com.tencent.mm.plugin.finder.storage.lx();

    public lx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "话题词引导发表-屏蔽拍摄场景", null, null, 12, null);
        aVar.a("FINDER_TOPIC_POST_FORBID_SHOOT_SWITCH", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        aVar.c(e42.c0.clicfg_finder_topic_post_forbid_shoot_switch, false);
        return aVar;
    }
}
