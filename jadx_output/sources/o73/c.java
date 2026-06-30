package o73;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o73.j f343540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n75.b f343541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o73.j jVar, n75.b bVar) {
        super(0);
        this.f343540d = jVar;
        this.f343541e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "init start");
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LAST_SYNC_COMM_USERNAMEMAP_V1_LONG_SYNC;
        long t17 = c17.t(u3Var, 0L);
        if (java.lang.System.currentTimeMillis() - t17 < 604800000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HashInfo.HashUserNameMapStorage", "lastSyncTime: " + t17 + ", not need to sync now~");
        } else {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            o73.j jVar = this.f343540d;
            java.lang.String a76 = jVar.a7();
            if (a76 == null || a76.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HashInfo.HashUserNameMapStorage", "salt is empty");
            } else {
                java.util.LinkedHashSet<o73.b> linkedHashSet = new java.util.LinkedHashSet();
                android.database.Cursor K = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().K();
                if (K != null) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                    while (K.moveToNext()) {
                        z3Var.convertFrom(K);
                        o73.b bVar = new o73.b();
                        bVar.field_UserName = z3Var.d1();
                        linkedHashSet.add(bVar);
                    }
                    K.close();
                }
                o73.b bVar2 = new o73.b();
                bVar2.field_UserName = en1.a.a();
                linkedHashSet.add(bVar2);
                com.tencent.mars.xlog.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "get contact done");
                for (o73.b bVar3 : linkedHashSet) {
                    bVar3.field_HashUserName = jVar.X6(bVar3.field_UserName, jVar.a7());
                    bVar3.field_CommHashUserName = jVar.X6(bVar3.field_UserName, jVar.Z6());
                    bVar3.field_HardCodeHashUserName = jVar.X6(bVar3.field_UserName, jVar.b7());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "compute salt done");
                l75.k0 Q4 = this.f343541e.Q4();
                if (Q4 != null) {
                    o73.j jVar2 = this.f343540d;
                    long F = Q4.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                    java.util.Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.sdk.storage.mvvm.MvvmStorage.V6(jVar2, (o73.b) it.next(), false, false, 6, null);
                    }
                    Q4.w(java.lang.Long.valueOf(F));
                    com.tencent.mars.xlog.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "init end size:" + linkedHashSet.size());
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "init end db is null size:" + linkedHashSet.size());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
