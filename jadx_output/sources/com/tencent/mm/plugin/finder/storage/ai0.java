package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ai0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ai0 f126437d = new com.tencent.mm.plugin.finder.storage.ai0();

    public ai0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "3tab流内下滑n个视频后撤回tab红点", null, null, 12, null);
        aVar.a("FINDER_STREAM_TRY_REVOKE_REDDOT_WHEN_SCROLL_STATE_IDLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_stream_try_revoke_reddot_when_scroll_state_idle, false, 2, null);
        return aVar;
    }
}
