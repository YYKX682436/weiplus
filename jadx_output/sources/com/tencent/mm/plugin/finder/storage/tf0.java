package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class tf0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.tf0 f128083d = new com.tencent.mm.plugin.finder.storage.tf0();

    public tf0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "个人中心页曝光时，把tl小人头和发现页的数字红点清空", null, com.tencent.mm.plugin.finder.storage.sf0.f127547d, 4, null);
        aVar.g(3565, "finder_reddot_personal_expose_clear_switch");
        aVar.a("FINDER_REDDOT_PERSONAL_EXPOSE_CLEAR_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
