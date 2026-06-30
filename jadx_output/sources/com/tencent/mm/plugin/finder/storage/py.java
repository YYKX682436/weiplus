package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class py extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.py f127395d = new com.tencent.mm.plugin.finder.storage.py();

    public py() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "兜底无视频号帐号微信身份红点清理", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.finder_wx_msg_red_dot_fallback_clear_enable, false, 2, null);
        aVar.a("FINDER_WX_MSG_RED_DOT_FALLBACK_CLEAR_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
