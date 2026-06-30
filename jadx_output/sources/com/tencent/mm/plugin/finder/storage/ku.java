package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ku extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ku f127089d = new com.tencent.mm.plugin.finder.storage.ku();

    public ku() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "朋友圈直播一键清除", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_sns_clear_btn_ui, false, 2, null);
        aVar.a("FINDER_SNS_CLEAR_BTN", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
