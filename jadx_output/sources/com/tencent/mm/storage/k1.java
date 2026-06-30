package com.tencent.mm.storage;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.storage.k1 f195065d = new com.tencent.mm.storage.k1();

    public k1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("__biz_cardRecycleSlot_slot_mmkv_key__");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return new com.tencent.mm.sdk.platformtools.v3(M, 31536000L);
    }
}
