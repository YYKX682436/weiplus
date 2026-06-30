package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class oe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.oe f127309d = new com.tencent.mm.plugin.finder.storage.oe();

    public oe() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "全局卡顿次数调整缓冲区", "FINDER_GLOBAL_BFU_CNT_CTRL", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_global_buf_cnt_ctrl, false, 2, null);
        return aVar;
    }
}
