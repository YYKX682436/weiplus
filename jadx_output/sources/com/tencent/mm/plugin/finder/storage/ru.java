package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ru extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ru f127507d = new com.tencent.mm.plugin.finder.storage.ru();

    public ru() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "朋友圈发表后同时发表视频号", null, null, 12, null);
        aVar.a("FINDER_SNS_POST_ENTRANCE_SWITCH", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_sns_post_entrance_switch, false, 2, null);
        return aVar;
    }
}
