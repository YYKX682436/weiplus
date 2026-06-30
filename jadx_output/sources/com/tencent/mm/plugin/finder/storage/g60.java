package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class g60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.g60 f126811d = new com.tencent.mm.plugin.finder.storage.g60();

    public g60() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "微信身份红点控制开关", null, null, 12, null);
        aVar.b("FinderEnableShowWXMentionSwitchEntry");
        aVar.a("WX_MSG_RED_DOT_SETTING_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("不展示", "展示"));
        return aVar;
    }
}
