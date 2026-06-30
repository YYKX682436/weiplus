package ec3;

/* loaded from: classes9.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f251098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251100f;

    public x(com.tencent.mm.modelbase.f fVar, ec3.g1 g1Var, java.lang.String str) {
        this.f251098d = fVar;
        this.f251099e = g1Var;
        this.f251100f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c17;
        java.lang.String str;
        char c18;
        java.lang.String str2;
        java.util.LinkedList linkedList;
        com.tencent.mm.modelbase.f fVar = this.f251098d;
        int i17 = fVar.f70615a;
        java.lang.String str3 = this.f251100f;
        ec3.g1 g1Var = this.f251099e;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            com.tencent.mm.plugin.luckymoney.model.m0 m0Var = (com.tencent.mm.plugin.luckymoney.model.m0) fVar2;
            if ((m0Var != null ? m0Var.f145439d : null) != null) {
                com.tencent.mm.plugin.luckymoney.model.m0 m0Var2 = (com.tencent.mm.plugin.luckymoney.model.m0) fVar2;
                int size = (m0Var2 == null || (linkedList = m0Var2.f145439d) == null) ? 0 : linkedList.size();
                java.lang.String a76 = g1Var.a7();
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp success, requestContent: " + str3 + ",nowEditText: " + a76 + ", dataSize：" + size);
                if (!kotlin.jvm.internal.o.b(str3, a76)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp：inputContent != nowEditText, ignore");
                    java.lang.String u17 = pm0.v.u(((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145441f);
                    java.util.LinkedList recommended_cover_list = ((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145439d;
                    kotlin.jvm.internal.o.f(recommended_cover_list, "recommended_cover_list");
                    java.lang.String g07 = kz5.n0.g0(recommended_cover_list, "&", null, null, 0, null, ec3.v.f251094d, 30, null);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[12];
                    objArr[0] = 14;
                    objArr[1] = 0;
                    objArr[2] = g1Var.f251026w;
                    androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
                    if (luckyMoneyNewPrepareUI != null) {
                        str = luckyMoneyNewPrepareUI.s7();
                        c17 = 3;
                    } else {
                        c17 = 3;
                        str = null;
                    }
                    objArr[c17] = str;
                    objArr[4] = "";
                    objArr[5] = "";
                    objArr[6] = str3;
                    objArr[7] = java.lang.Integer.valueOf(size);
                    objArr[8] = g07;
                    objArr[9] = 0;
                    objArr[10] = u17;
                    objArr[11] = 0;
                    g0Var.d(18890, objArr);
                    return;
                }
                g1Var.f251014h = true;
                g1Var.C = 0;
                if (!(1 <= size && size < 4)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp : dataSize illegal, reset");
                    ec3.g1.d7(g1Var, false, 1, null);
                    g1Var.S6();
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr2 = new java.lang.Object[12];
                    objArr2[0] = 14;
                    objArr2[1] = 0;
                    objArr2[2] = g1Var.f251026w;
                    androidx.appcompat.app.AppCompatActivity activity2 = g1Var.getActivity();
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
                    if (luckyMoneyNewPrepareUI2 != null) {
                        str2 = luckyMoneyNewPrepareUI2.s7();
                        c18 = 3;
                    } else {
                        c18 = 3;
                        str2 = null;
                    }
                    objArr2[c18] = str2;
                    objArr2[4] = "";
                    objArr2[5] = "";
                    objArr2[6] = str3;
                    objArr2[7] = 0;
                    objArr2[8] = "";
                    objArr2[9] = 0;
                    objArr2[10] = pm0.v.u(((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145441f);
                    objArr2[11] = 0;
                    g0Var2.d(18890, objArr2);
                    return;
                }
                g1Var.f251024u.put(str3, java.lang.Boolean.TRUE);
                java.util.LinkedList recommended_cover_list2 = ((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145439d;
                kotlin.jvm.internal.o.f(recommended_cover_list2, "recommended_cover_list");
                java.lang.String g08 = kz5.n0.g0(recommended_cover_list2, "&", null, null, 0, null, ec3.w.f251096d, 30, null);
                boolean b17 = kotlin.jvm.internal.o.b(g1Var.f251028y, g08);
                boolean z17 = !b17;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp：new_request_id：" + pm0.v.u(((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145441f) + "、old_request_id：" + g1Var.f251025v + "、reportSkinList：" + g1Var.f251027x);
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp ，needUpdateSkinUrlList: " + z17 + "、url_isSame: " + b17 + "、old_url_List：" + g1Var.f251028y + "、new_url_List：" + g08);
                g1Var.c7(z17);
                g1Var.f251025v = pm0.v.u(((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145441f);
                java.util.LinkedList recommended_cover_list3 = ((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145439d;
                kotlin.jvm.internal.o.f(recommended_cover_list3, "recommended_cover_list");
                g1Var.f251027x = kz5.n0.g0(recommended_cover_list3, "&", null, null, 0, null, ec3.u.f251092d, 30, null);
                if (z17) {
                    java.util.ArrayList arrayList = g1Var.f251011e;
                    java.util.LinkedList recommended_cover_list4 = ((com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d).f145439d;
                    kotlin.jvm.internal.o.f(recommended_cover_list4, "recommended_cover_list");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(recommended_cover_list4, 10));
                    java.util.Iterator it = recommended_cover_list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new ec3.k1((com.tencent.mm.plugin.luckymoney.model.p6) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                    g1Var.f251028y = g08;
                    g1Var.T6("");
                } else {
                    com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr3 = new java.lang.Object[12];
                    objArr3[0] = 15;
                    objArr3[1] = 0;
                    objArr3[2] = g1Var.f251026w;
                    androidx.appcompat.app.AppCompatActivity activity3 = g1Var.getActivity();
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI3 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity3 : null;
                    objArr3[3] = luckyMoneyNewPrepareUI3 != null ? luckyMoneyNewPrepareUI3.s7() : null;
                    objArr3[4] = "";
                    objArr3[5] = "";
                    objArr3[6] = g1Var.Z6();
                    objArr3[7] = java.lang.Integer.valueOf(g1Var.f251011e.size());
                    objArr3[8] = g1Var.f251027x;
                    objArr3[9] = 0;
                    objArr3[10] = g1Var.f251025v;
                    objArr3[11] = 0;
                    g0Var3.d(18890, objArr3);
                }
                com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr4 = new java.lang.Object[12];
                objArr4[0] = 14;
                objArr4[1] = 0;
                objArr4[2] = g1Var.f251026w;
                androidx.appcompat.app.AppCompatActivity activity4 = g1Var.getActivity();
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI4 = activity4 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity4 : null;
                objArr4[3] = luckyMoneyNewPrepareUI4 != null ? luckyMoneyNewPrepareUI4.s7() : null;
                objArr4[4] = "";
                objArr4[5] = "";
                objArr4[6] = str3;
                objArr4[7] = java.lang.Integer.valueOf(g1Var.f251011e.size());
                objArr4[8] = g1Var.f251027x;
                objArr4[9] = 0;
                objArr4[10] = g1Var.f251025v;
                objArr4[11] = 0;
                g0Var4.d(18890, objArr4);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp failed");
        ec3.g1.d7(g1Var, false, 1, null);
        g1Var.S6();
        com.tencent.mm.plugin.report.service.g0 g0Var5 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr5 = new java.lang.Object[12];
        objArr5[0] = 14;
        objArr5[1] = 0;
        objArr5[2] = g1Var.f251026w;
        androidx.appcompat.app.AppCompatActivity activity5 = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI5 = activity5 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity5 : null;
        objArr5[3] = luckyMoneyNewPrepareUI5 != null ? luckyMoneyNewPrepareUI5.s7() : null;
        objArr5[4] = "";
        objArr5[5] = "";
        objArr5[6] = str3;
        objArr5[7] = 0;
        objArr5[8] = "";
        objArr5[9] = 0;
        com.tencent.mm.plugin.luckymoney.model.m0 m0Var3 = (com.tencent.mm.plugin.luckymoney.model.m0) fVar.f70618d;
        objArr5[10] = pm0.v.u(m0Var3 != null ? m0Var3.f145441f : 0L);
        objArr5[11] = 0;
        g0Var5.d(18890, objArr5);
    }
}
