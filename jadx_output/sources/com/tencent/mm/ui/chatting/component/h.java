package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.component.h f199133d = new com.tencent.mm.ui.chatting.component.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_wxgame_dynamic_card_scroll_frequency_millseconds", "");
        kotlin.jvm.internal.o.f(aj6, "getExpt(...)");
        java.lang.Long j17 = r26.h0.j(aj6);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "sendScrollTime value is " + j17);
        return java.lang.Long.valueOf(j17 != null ? j17.longValue() : 66L);
    }
}
