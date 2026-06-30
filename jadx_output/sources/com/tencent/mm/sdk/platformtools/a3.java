package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public final class a3 extends com.tencent.mm.sdk.platformtools.o {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f192452f;

    public a3() {
        super(60L, 0, 2, null);
        this.f192452f = jz5.h.a(jz5.i.f302829d, com.tencent.mm.sdk.platformtools.z2.f193129d);
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public void b(long j17, java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.y2 slot = (com.tencent.mm.sdk.platformtools.y2) obj;
        kotlin.jvm.internal.o.g(slot, "slot");
        slot.f193096b.clear();
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public boolean c(java.lang.Object obj, java.lang.String key) {
        com.tencent.mm.sdk.platformtools.y2 slot = (com.tencent.mm.sdk.platformtools.y2) obj;
        kotlin.jvm.internal.o.g(slot, "slot");
        kotlin.jvm.internal.o.g(key, "key");
        return slot.f193096b.contains(key);
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public java.lang.Object g(java.lang.String slotKey, long j17) {
        com.tencent.mm.sdk.platformtools.y2 y2Var;
        synchronized (this) {
            kotlin.jvm.internal.o.g(slotKey, "slotKey");
            y2Var = (com.tencent.mm.sdk.platformtools.y2) ((java.util.concurrent.ConcurrentHashMap) this.f192452f.getValue()).get(slotKey);
            if (y2Var == null) {
                y2Var = new com.tencent.mm.sdk.platformtools.y2();
                ((java.util.concurrent.ConcurrentHashMap) this.f192452f.getValue()).put(slotKey, y2Var);
            }
        }
        return y2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public void j(java.lang.String slotKey, long j17) {
        kotlin.jvm.internal.o.g(slotKey, "slotKey");
        com.tencent.mm.sdk.platformtools.y2 y2Var = (com.tencent.mm.sdk.platformtools.y2) ((java.util.concurrent.ConcurrentHashMap) this.f192452f.getValue()).get(slotKey);
        if (y2Var == null) {
            return;
        }
        y2Var.f193095a = j17;
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public boolean l(java.lang.String slotKey, long j17) {
        kotlin.jvm.internal.o.g(slotKey, "slotKey");
        com.tencent.mm.sdk.platformtools.y2 y2Var = (com.tencent.mm.sdk.platformtools.y2) ((java.util.concurrent.ConcurrentHashMap) this.f192452f.getValue()).get(slotKey);
        return y2Var != null && y2Var.f193095a == j17;
    }

    public final void m(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        ((com.tencent.mm.sdk.platformtools.y2) i()).f193096b.add(key);
    }

    public final boolean n(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return d(key) != null;
    }
}
