package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fo f126786d = new com.tencent.mm.plugin.finder.storage.fo();

    public fo() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号私信红点通知文本外显", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_private_msg_red_dot_expose_notification, false);
        aVar.a("FINDER_PRIVATE_MSG_RED_DOT_EXPOSE_NOTIFICATION", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
