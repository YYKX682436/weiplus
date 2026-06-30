package com.tencent.wechat.aff.star;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZIDL_xmiCPWJ3K {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_BX(java.lang.Object obj, boolean z17) {
        lk3.b U6;
        lk3.b U62;
        ik3.k kVar = (ik3.k) ((com.tencent.wechat.aff.star.c) obj);
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAffFsc", "insertByIdAsync result: " + z17);
        if (z17) {
            boolean z18 = kVar.f291899a;
            ik3.q qVar = kVar.f291902d;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = kVar.f291901c;
            if (z18 && kVar.f291900b) {
                if (multiTaskInfo == null || (U62 = qVar.U6()) == null) {
                    return;
                }
                lk3.c cVar = lk3.c.f319013g;
                java.lang.String field_id = multiTaskInfo.field_id;
                kotlin.jvm.internal.o.f(field_id, "field_id");
                o75.c cVar2 = new o75.c(cVar, field_id, "MicroMsg.MultiTask.MultiTaskLiveStorage");
                cVar2.f343590d = multiTaskInfo;
                U62.P6().notify(cVar2);
                return;
            }
            if (multiTaskInfo == null || (U6 = qVar.U6()) == null) {
                return;
            }
            o75.b bVar = o75.b.f343582c;
            java.lang.String field_id2 = multiTaskInfo.field_id;
            kotlin.jvm.internal.o.f(field_id2, "field_id");
            o75.c cVar3 = new o75.c(bVar, field_id2, "MicroMsg.MultiTask.MultiTaskLiveStorage");
            cVar3.f343590d = multiTaskInfo;
            U6.P6().notify(cVar3);
        }
    }

    private void ZIDL_CX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_DX(java.lang.Object obj, boolean z17) {
        ((com.tencent.wechat.aff.star.a) obj).complete(z17);
    }

    private void ZIDL_FX(java.lang.Object obj, byte[][] bArr) {
        java.util.ArrayList mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.a40.f25007h, bArr);
        ik3.j jVar = (ik3.j) ((com.tencent.wechat.aff.star.b) obj);
        jVar.getClass();
        ik3.q qVar = jVar.f291897a;
        lk3.b U6 = qVar.U6();
        java.util.ArrayList arrayList = new java.util.ArrayList(U6 != null ? kz5.n0.S0(U6.Z6(null)) : kz5.p0.f313996d);
        kotlin.jvm.internal.o.d(mmpbListUnSerializeFromBasic);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(mmpbListUnSerializeFromBasic, 10));
        int i17 = 0;
        for (java.lang.Object obj2 : mmpbListUnSerializeFromBasic) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.a40 a40Var = (bw5.a40) obj2;
            kotlin.jvm.internal.o.d(a40Var);
            arrayList2.add(qVar.W6(i17, a40Var));
            i17 = i18;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.n0.S0(arrayList2));
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAffFsc", "getAllStarData, allAffStarData size: " + mmpbListUnSerializeFromBasic.size() + ", localMultiTaskInfos size: " + arrayList.size());
        arrayList.addAll(arrayList3);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) next;
            if (hashSet.add(multiTaskInfo.field_id + '_' + multiTaskInfo.field_type + '}')) {
                arrayList4.add(next);
            }
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new ik3.i());
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("multitask_data_config");
        if (!M.getBoolean("multitask_key_web", false)) {
            M.putBoolean("multitask_key_web", true);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) it6.next();
                if (multiTaskInfo2.field_type == 2) {
                    r45.k97 k97Var = new r45.k97();
                    try {
                        k97Var.parseFrom(multiTaskInfo2.field_data);
                    } catch (java.lang.Exception unused) {
                    }
                    if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(k97Var.getString(1))) {
                        multiTaskInfo2.field_type = 26;
                        lk3.b U62 = qVar.U6();
                        if (U62 != null) {
                            U62.X6(multiTaskInfo2);
                        }
                    }
                }
            }
        }
        kk3.b bVar = jVar.f291898b;
        if (bVar != null) {
            bVar.a(arrayList);
        }
    }

    public native boolean ZIDL_A(long j17, byte[] bArr);

    public native void ZIDL_BV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_CV(long j17, java.lang.Object obj, long j18);

    public native void ZIDL_DV(long j17, java.lang.Object obj, byte[] bArr, int i17);

    public native byte[] ZIDL_E(long j17, byte[] bArr, int i17);

    public native void ZIDL_FV(long j17, java.lang.Object obj, long j18);

    public native boolean ZIDL_G(long j17);

    public native void ZIDL_xmiCPWJ3C(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
