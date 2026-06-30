package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class li0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.li0 f127141d = new com.tencent.mm.plugin.finder.storage.li0();

    public li0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "用户没有切换离开发现页tab时是否不可替换视频号红点", "FIND_TAB_LOCK_REDDOT_RECEIVE_STATE_SWITCH", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_find_page_lock_reddot_receive_state_switch, false, 2, null);
        return aVar;
    }
}
