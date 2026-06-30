package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qc f127423d = new com.tencent.mm.plugin.finder.storage.qc();

    public qc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "分享到朋友圈文字同步到视频号评论", null, null, 12, null);
        aVar.a("FINDER_FEED_SHARE_SNS_DESC_TO_COMMENT", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_feed_share_sns_desc_to_comment, false, 2, null);
        return aVar;
    }
}
