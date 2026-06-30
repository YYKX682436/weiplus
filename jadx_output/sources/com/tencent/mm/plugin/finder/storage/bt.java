package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class bt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.bt f126545d = new com.tencent.mm.plugin.finder.storage.bt();

    public bt() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "分享完播下拉引导展示时长", com.tencent.mm.plugin.finder.storage.at.f126483d);
        aVar.a("FINDER_SHARE_POPUP_PULL_TIPS_DURATION", kz5.c0.i(3000L, java.lang.Long.valueOf(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT)), kz5.c0.i("3秒", "10秒"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_share_popup_pull_tips_duration, false, 2, null);
        return aVar;
    }
}
