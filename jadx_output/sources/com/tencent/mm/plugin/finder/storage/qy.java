package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qy f127452d = new com.tencent.mm.plugin.finder.storage.qy();

    public qy() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "微信或视频号身份通知显示关注按钮", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_wechat_mention_show_follow_android, false);
        aVar.a("FINDER_WX_OR_FINDER_MENTION_SHOW_FOLLOW", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
