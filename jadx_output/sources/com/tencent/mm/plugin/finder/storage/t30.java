package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class t30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.t30 f127581d = new com.tencent.mm.plugin.finder.storage.t30();

    public t30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "原创发表announce确认弹窗状态清理", null, null, 12, null);
        aVar.a("POST_ORIGIN_CONFIRM_ANNOUNCE_FLAG", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("默认(0)", "清理存储"));
        aVar.f317743n = com.tencent.mm.plugin.finder.storage.s30.f127521d;
        return aVar;
    }
}
