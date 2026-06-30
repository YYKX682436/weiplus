package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class op extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.op f127326d = new com.tencent.mm.plugin.finder.storage.op();

    public op() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "用户实名状态开关", null, null, 12, null);
        aVar.a("FINDER_REAL_NAME_STATUS", kz5.c0.i(0, 1, 2), kz5.c0.i("真实判断", "hardcode已实名", "hardcode未实名"));
        return aVar;
    }
}
