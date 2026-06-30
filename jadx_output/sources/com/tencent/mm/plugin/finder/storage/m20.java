package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class m20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.m20 f127165d = new com.tencent.mm.plugin.finder.storage.m20();

    public m20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "MARK_READ_OPEN", null, null, 12, null);
        aVar.b("FinderMarkReadOpenControl");
        aVar.a("FinderMarkReadOpenControl", new java.util.ArrayList(kz5.c0.i(0, 1, 0)), kz5.c0.i("默认(1)", "打开入口(1)", "关闭入口(0)"));
        return aVar;
    }
}
