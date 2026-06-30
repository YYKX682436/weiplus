package qo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class q0 extends kotlin.jvm.internal.m implements yz5.a {
    public q0(java.lang.Object obj) {
        super(0, obj, qo1.v0.class, "buildRoamTaskInfo", "buildRoamTaskInfo()I", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        qo1.v0 v0Var = (qo1.v0) this.receiver;
        int i18 = qo1.v0.f365555y;
        java.lang.Object obj = v0Var.f365492r;
        java.util.HashMap hashMap = obj instanceof java.util.HashMap ? (java.util.HashMap) obj : null;
        if (hashMap == null) {
            i17 = 256;
        } else {
            java.util.Collection values = hashMap.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 += ((go1.a) it.next()).f273921d;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildRoamTaskInfo, sumSize = ");
            sb6.append(j17);
            sb6.append(", taskType = ");
            com.tencent.wechat.aff.affroam.o0 o0Var = v0Var.f365476b;
            sb6.append(o0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", sb6.toString());
            com.tencent.wechat.aff.affroam.o oVar = new com.tencent.wechat.aff.affroam.o();
            oVar.f215930e = o0Var == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
            oVar.f215931f = j17;
            boolean z17 = com.tencent.mm.sdk.platformtools.o4.L().getBoolean("modifyTimeOrderMode", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", "modifyTimeOrder = " + z17);
            java.util.Set entrySet = hashMap.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            java.util.Set<java.util.Map.Entry> set = entrySet;
            if (!z17) {
                java.util.List U0 = kz5.n0.U0(entrySet);
                java.util.Collections.shuffle(U0);
                set = U0;
            }
            for (java.util.Map.Entry entry : set) {
                kotlin.jvm.internal.o.d(entry);
                java.lang.String str = (java.lang.String) entry.getKey();
                go1.a aVar = (go1.a) entry.getValue();
                oo1.o oVar2 = oo1.o.f347151a;
                kotlin.jvm.internal.o.d(str);
                long p17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) oo1.o.f347153c).getValue()).p(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", "recoverTime=" + p17 + ", convInfo=" + aVar);
                com.tencent.wechat.aff.affroam.s sVar = new com.tencent.wechat.aff.affroam.s();
                sVar.f215974d = str;
                sVar.f215975e = aVar.f273919b;
                sVar.f215976f = aVar.f273920c;
                sVar.f215977g = aVar.f273921d;
                long j18 = aVar.f273922e;
                sVar.f215978h = j18 > 0;
                sVar.f215979i = j18;
                sVar.f215980m = p17;
                oVar.f215929d.add(sVar);
            }
            com.tencent.mm.plugin.backup.roambackup.u uVar = com.tencent.mm.plugin.backup.roambackup.u.f92737a;
            long j19 = v0Var.f365483i;
            com.tencent.wechat.aff.affroam.h1 b17 = uVar.b(j19);
            if (b17 == null) {
                i17 = 257;
            } else {
                com.tencent.wechat.aff.affroam.m0 f17 = b17.f(oVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", "[+] New backup task, packageId = " + j19 + ", taskInfo = " + f17.f215902d);
                v0Var.f365492r = f17;
                v0Var.f365491q = new qo1.l0(v0Var);
                i17 = 0;
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
