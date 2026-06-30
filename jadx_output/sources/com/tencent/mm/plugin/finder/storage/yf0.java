package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yf0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yf0 f128386d = new com.tencent.mm.plugin.finder.storage.yf0();

    public yf0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "发现页红点取之前是否先判断开关是否打开", "FINDER_RED_DOT_CHECK_SWITCH_BEFORE_GET", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_reddot_check_before_get, false, 2, null);
        return aVar;
    }
}
