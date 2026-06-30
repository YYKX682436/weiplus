package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vq f128208d = new com.tencent.mm.plugin.finder.storage.vq();

    public vq() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "浮窗进入时复用用原场景context", "FINDER_REUSE_CONTEXTID_IN_FLOAT", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_reuse_contextid_in_float, false, 2, null);
        return aVar;
    }
}
