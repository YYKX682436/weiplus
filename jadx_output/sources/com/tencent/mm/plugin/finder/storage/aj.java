package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class aj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.aj f126438d = new com.tencent.mm.plugin.finder.storage.aj();

    public aj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "朋友赞显示首赞标签", null, null, 12, null);
        aVar.a("FINDER_MESSAGE_SHOW_FIRST_LIKE_TAG", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_msg_show_first_like_tab, false, 2, null);
        return aVar;
    }
}
