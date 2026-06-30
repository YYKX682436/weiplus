package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class b40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.b40 f126501d = new com.tencent.mm.plugin.finder.storage.b40();

    public b40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "不再接收私信入口", null, null, 12, null);
        aVar.b("FinderPrivateRefuseAllMsgSwitch");
        aVar.a("REFUSE_ALL_PRIVATE_MSG_SWITCH", new java.util.ArrayList(kz5.c0.i(0, 1, 0)), kz5.c0.i("默认(0)", "打开入口(1)", "关闭入口(0)"));
        return aVar;
    }
}
