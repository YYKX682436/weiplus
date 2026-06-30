package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mx f127215d = new com.tencent.mm.plugin.finder.storage.mx();

    public mx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号-播放器-消息线程-复用", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_tp_work_thread_resuse_switch, false, 2, null);
        aVar.a("FINDER_TP_THREAD_REUSE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
