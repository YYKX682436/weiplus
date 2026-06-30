package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cf0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cf0 f126584d = new com.tencent.mm.plugin.finder.storage.cf0();

    public cf0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发现页左侧数字红点本地不构造（私信红点除外）", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_mention_entrance_new_show_strategy, false, 2, null);
        aVar.a("FINDER_MENTION_ENTRANCE_NEW_SHOW_STRATEGY", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("否", "是"));
        return aVar;
    }
}
