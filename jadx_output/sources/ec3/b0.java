package ec3;

/* loaded from: classes9.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f250986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f250987e;

    public b0(com.tencent.mm.modelbase.f fVar, ec3.g1 g1Var) {
        this.f250986d = fVar;
        this.f250987e = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList;
        com.tencent.mm.modelbase.f fVar = this.f250986d;
        int i17 = fVar.f70615a;
        ec3.g1 g1Var = this.f250987e;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            com.tencent.mm.plugin.luckymoney.model.m0 m0Var = (com.tencent.mm.plugin.luckymoney.model.m0) fVar2;
            if ((m0Var != null ? m0Var.f145439d : null) != null) {
                com.tencent.mm.plugin.luckymoney.model.m0 m0Var2 = (com.tencent.mm.plugin.luckymoney.model.m0) fVar2;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(m0Var2 != null ? m0Var2.f145442g : null)) {
                    com.tencent.mm.plugin.luckymoney.model.m0 m0Var3 = (com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d;
                    int size = (m0Var3 == null || (linkedList = m0Var3.f145439d) == null) ? 0 : linkedList.size();
                    com.tencent.mm.plugin.luckymoney.model.m0 m0Var4 = (com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d;
                    java.lang.String str = m0Var4 != null ? m0Var4.f145442g : null;
                    g1Var.D = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp success, title：" + str + ", dataSize：" + size);
                    if (g1Var.f251014h) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] hasReceiveRecommendInfo: true, ignore");
                        return;
                    }
                    if (!(1 <= size && size < 4)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp : dataSize illegal, reset");
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        java.lang.Object[] objArr = new java.lang.Object[12];
                        objArr[0] = 14;
                        objArr[1] = 0;
                        objArr[2] = g1Var.f251026w;
                        androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
                        objArr[3] = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.s7() : null;
                        objArr[4] = "";
                        objArr[5] = "";
                        objArr[6] = "";
                        objArr[7] = 0;
                        objArr[8] = "";
                        objArr[9] = 0;
                        objArr[10] = pm0.v.u(((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145441f);
                        objArr[11] = 1;
                        g0Var.d(18890, objArr);
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp：new_request_id：" + pm0.v.u(((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145441f) + "、old_request_id：" + g1Var.f251025v + "、reportSkinList：" + g1Var.f251027x);
                    ec3.g1.d7(g1Var, false, 1, null);
                    g1Var.C = 1;
                    java.util.LinkedList recommended_cover_list = ((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145439d;
                    kotlin.jvm.internal.o.f(recommended_cover_list, "recommended_cover_list");
                    g1Var.f251028y = kz5.n0.g0(recommended_cover_list, "&", null, null, 0, null, ec3.a0.f250983d, 30, null);
                    g1Var.f251025v = pm0.v.u(((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145441f);
                    java.util.LinkedList recommended_cover_list2 = ((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145439d;
                    kotlin.jvm.internal.o.f(recommended_cover_list2, "recommended_cover_list");
                    g1Var.f251027x = kz5.n0.g0(recommended_cover_list2, "&", null, null, 0, null, ec3.z.f251105d, 30, null);
                    java.util.ArrayList arrayList = g1Var.f251011e;
                    java.util.LinkedList recommended_cover_list3 = ((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145439d;
                    kotlin.jvm.internal.o.f(recommended_cover_list3, "recommended_cover_list");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(recommended_cover_list3, 10));
                    java.util.Iterator it = recommended_cover_list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new ec3.k1((com.tencent.mm.plugin.luckymoney.model.p6) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                    g1Var.T6(str);
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr2 = new java.lang.Object[12];
                    objArr2[0] = 14;
                    objArr2[1] = 0;
                    objArr2[2] = g1Var.f251026w;
                    androidx.appcompat.app.AppCompatActivity activity2 = g1Var.getActivity();
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
                    objArr2[3] = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.s7() : null;
                    objArr2[4] = "";
                    objArr2[5] = "";
                    objArr2[6] = "";
                    objArr2[7] = java.lang.Integer.valueOf(g1Var.f251011e.size());
                    objArr2[8] = g1Var.f251027x;
                    objArr2[9] = 0;
                    objArr2[10] = g1Var.f251025v;
                    objArr2[11] = 1;
                    g0Var2.d(18890, objArr2);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp failed");
        com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr3 = new java.lang.Object[12];
        objArr3[0] = 14;
        objArr3[1] = 0;
        objArr3[2] = g1Var.f251026w;
        androidx.appcompat.app.AppCompatActivity activity3 = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI3 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity3 : null;
        objArr3[3] = luckyMoneyNewPrepareUI3 != null ? luckyMoneyNewPrepareUI3.s7() : null;
        objArr3[4] = "";
        objArr3[5] = "";
        objArr3[6] = "";
        objArr3[7] = 0;
        objArr3[8] = "";
        objArr3[9] = 0;
        com.tencent.mm.plugin.luckymoney.model.m0 m0Var5 = (com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d;
        objArr3[10] = pm0.v.u(m0Var5 != null ? m0Var5.f145441f : 0L);
        objArr3[11] = 1;
        g0Var3.d(18890, objArr3);
    }
}
