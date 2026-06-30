package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class m10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.m10 f127163d = new com.tencent.mm.plugin.finder.storage.m10();

    public m10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "作者感谢互动作者侧开关", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_thank_msg_author_switch_android, false);
        aVar.a("FinderThankMsgAuthorSwitch", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
