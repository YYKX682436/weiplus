package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class va extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.va f128182d = new com.tencent.mm.plugin.finder.storage.va();

    public va() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "动态调整缓冲区一键开关", "FINDER_DYNAMIC_BUFFER_SIZE_CTRL", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_dynamic_buffer_size_ctrl, false, 2, null);
        return aVar;
    }
}
