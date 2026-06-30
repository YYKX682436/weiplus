package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n10 f127221d = new com.tencent.mm.plugin.finder.storage.n10();

    public n10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "视频号感谢消息强制使用指定类型的谢谢按钮", null, null, 12, null);
        aVar.a("FinderThankRedPackForce", kz5.c0.i(-1, 0, 1, 2, 3), kz5.c0.i("关闭", "小花", "爆竹", "红包", "彩带"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_thanks_button_force_show_icon_type, false, 2, null);
        return aVar;
    }
}
