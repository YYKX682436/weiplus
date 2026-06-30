package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jm f127021d = new com.tencent.mm.plugin.finder.storage.jm();

    public jm() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "打招呼限制提醒", null, null, 12, null);
        aVar.b("FinderPersonalMsgMaxGreetCount");
        aVar.a("FINDER_PERSONAL_MSG_MAX_GREET_COUNT", new java.util.ArrayList(kz5.c0.i(0, 1, 0)), kz5.c0.i("默认(0)", "打开提示(1)", "关闭提示(0)"));
        return aVar;
    }
}
