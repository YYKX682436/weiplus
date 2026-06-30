package qo1;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f365450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.c1 f365451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.h1 f365452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(kotlin.jvm.internal.f0 f0Var, qo1.c1 c1Var, com.tencent.wechat.aff.affroam.h1 h1Var) {
        super(0);
        this.f365450d = f0Var;
        this.f365451e = c1Var;
        this.f365452f = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        java.util.ArrayList<jz5.l> arrayList;
        int i17 = this.f365450d.f310116d;
        if (i17 != 0) {
            return java.lang.Integer.valueOf(i17);
        }
        qo1.c1 c1Var = this.f365451e;
        java.lang.Object obj = c1Var.f365492r;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.wechat.aff.affroam.AffRoamBackedUpConversationsInfo");
        com.tencent.wechat.aff.affroam.f fVar = (com.tencent.wechat.aff.affroam.f) obj;
        java.util.List<java.lang.String> list = c1Var.f365457w;
        boolean isEmpty = list.isEmpty();
        java.util.LinkedList linkedList = fVar.f215824d;
        java.util.LinkedList linkedList2 = fVar.f215825e;
        if (isEmpty) {
            arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.o.f(linkedList, "getConversationId(...)");
            j17 = 0;
            int i18 = 0;
            for (java.lang.Object obj2 : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.Long l17 = (java.lang.Long) linkedList2.get(i18);
                kotlin.jvm.internal.o.d(l17);
                j17 += l17.longValue();
                arrayList.add(new jz5.l((java.lang.String) obj2, l17));
                i18 = i19;
            }
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            kotlin.jvm.internal.o.f(linkedList, "getConversationId(...)");
            int i27 = 0;
            for (java.lang.Object obj3 : linkedList) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str = (java.lang.String) obj3;
                kotlin.jvm.internal.o.d(str);
                java.lang.Object obj4 = linkedList2.get(i27);
                kotlin.jvm.internal.o.f(obj4, "get(...)");
                hashMap.put(str, obj4);
                i27 = i28;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            j17 = 0;
            for (java.lang.String str2 : list) {
                java.lang.Long l18 = (java.lang.Long) hashMap.get(str2);
                if (l18 == null) {
                    l18 = 1024L;
                }
                kotlin.jvm.internal.o.d(l18);
                long longValue = l18.longValue();
                j17 += longValue;
                arrayList2.add(new jz5.l(str2, java.lang.Long.valueOf(longValue)));
            }
            arrayList = arrayList2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restore list.size=");
        sb6.append(arrayList.size());
        sb6.append(", sumSize=");
        sb6.append(j17);
        sb6.append(", pkgId=");
        long j18 = c1Var.f365483i;
        sb6.append(j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamRestoreTask", sb6.toString());
        if (arrayList.isEmpty()) {
            return 1;
        }
        com.tencent.wechat.aff.affroam.j0 j0Var = new com.tencent.wechat.aff.affroam.j0();
        j0Var.f215875e = j17;
        for (jz5.l lVar : arrayList) {
            java.lang.String str3 = (java.lang.String) lVar.f302833d;
            long longValue2 = ((java.lang.Number) lVar.f302834e).longValue();
            com.tencent.wechat.aff.affroam.s sVar = new com.tencent.wechat.aff.affroam.s();
            sVar.f215974d = str3;
            sVar.f215975e = 0L;
            sVar.f215976f = java.lang.System.currentTimeMillis();
            sVar.f215977g = longValue2;
            j0Var.f215874d.add(sVar);
        }
        com.tencent.wechat.aff.affroam.m0 g17 = this.f365452f.g(j0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamRestoreTask", "[+] New Restore task, pkgId = " + j18 + ", taskInfo = " + g17.f215902d);
        c1Var.f365492r = g17;
        c1Var.f365491q = new qo1.z0(c1Var);
        return 0;
    }
}
