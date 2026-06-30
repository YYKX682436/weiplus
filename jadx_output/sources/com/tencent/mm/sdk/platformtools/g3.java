package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public final class g3 extends com.tencent.mm.sdk.platformtools.o {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f192714f;

    /* renamed from: g, reason: collision with root package name */
    public final long f192715g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f192716h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(java.lang.String name, long j17) {
        super(j17, 0, 2, null);
        kotlin.jvm.internal.o.g(name, "name");
        this.f192714f = "MMFileSlotManager";
        this.f192715g = 1000L;
        this.f192716h = name + '/' + j17 + '/';
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public void b(long j17, java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap;
        com.tencent.mm.vfs.r6 slot = (com.tencent.mm.vfs.r6) obj;
        kotlin.jvm.internal.o.g(slot, "slot");
        try {
            java.lang.String[] E = slot.E(new com.tencent.mm.sdk.platformtools.d3(j17));
            if (E != null) {
                arrayList = new java.util.ArrayList(E.length);
                for (java.lang.String str : E) {
                    arrayList.add(slot.u() + '/' + str);
                }
            } else {
                arrayList = null;
            }
            long j18 = this.f192715g;
            java.lang.String str2 = java.util.List.class.getCanonicalName() + "_batch";
            synchronized (com.tencent.mm.sdk.platformtools.ca.f192506a) {
                hashMap = com.tencent.mm.sdk.platformtools.ca.f192507b;
                kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) hashMap.get(str2);
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                java.util.HashMap hashMap2 = com.tencent.mm.sdk.platformtools.ca.f192508c;
                if (!hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, new java.util.LinkedList());
                }
                java.lang.Object obj2 = hashMap2.get(str2);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda$1$lambda$0>");
                ((java.util.LinkedList) obj2).add(arrayList);
            }
            hashMap.put(str2, kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.sdk.platformtools.f3(j18, str2, null, this), 2, null));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f192714f, e17, "clearSlot", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public boolean c(java.lang.Object obj, java.lang.String key) {
        com.tencent.mm.vfs.r6 slot = (com.tencent.mm.vfs.r6) obj;
        kotlin.jvm.internal.o.g(slot, "slot");
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(slot.u() + '/' + key);
        return r6Var.m() && r6Var.C() > 0;
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public java.lang.String f() {
        return this.f192716h;
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public java.lang.Object g(java.lang.String slotKey, long j17) {
        kotlin.jvm.internal.o.g(slotKey, "slotKey");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(m(slotKey, j17));
        r6Var.u();
        if (!r6Var.m()) {
            r6Var.J();
            r6Var.toString();
        }
        return r6Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public void j(java.lang.String slotKey, long j17) {
        kotlin.jvm.internal.o.g(slotKey, "slotKey");
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public boolean l(java.lang.String slotKey, long j17) {
        kotlin.jvm.internal.o.g(slotKey, "slotKey");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(m(slotKey, j17));
        return r6Var.m() && r6Var.C() > 0;
    }

    public final java.lang.String m(java.lang.String str, long j17) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.e());
        sb6.append("mmslot/");
        sb6.append(str);
        sb6.append('/');
        if (j17 > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(j17);
            sb7.append('/');
            str2 = sb7.toString();
        } else {
            str2 = "";
        }
        sb6.append(str2);
        return sb6.toString();
    }
}
