package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.z f128416d = new com.tencent.mm.plugin.finder.storage.z();

    public z() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "打开切换身份评论", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_can_switch_scene, false, 2, null);
        aVar.a("CAN_SWITCH_SCENE", kz5.b0.c(1), kz5.b0.c("打开"));
        return aVar;
    }
}
