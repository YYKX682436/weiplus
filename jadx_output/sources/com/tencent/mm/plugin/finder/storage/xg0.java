package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xg0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xg0 f128310d = new com.tencent.mm.plugin.finder.storage.xg0();

    public xg0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "红点Manager是否使用新版本", "FINDER_RED_DOT_MANAGE_V1_SWITCH_ON", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_reddot_manager_v1_switch_on, false, 2, null);
        return aVar;
    }
}
