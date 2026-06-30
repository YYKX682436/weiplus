package y84;

/* loaded from: classes4.dex */
public final class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f460058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f460059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f460060g;

    public g3(y84.h3 h3Var, int i17, java.util.List list, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f460057d = h3Var;
        this.f460058e = i17;
        this.f460059f = list;
        this.f460060g = snsInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y84.h3 h3Var = this.f460057d;
        java.lang.String j17 = h3Var.j();
        int i17 = this.f460058e;
        java.util.List list = this.f460059f;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f460060g;
        try {
            y84.l3 E = y84.h3.E(h3Var);
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = E != null ? E.a() : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            java.util.List z07 = h3Var.z0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMVirtualIndexToPosIndexList$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            java.util.List list2 = h3Var.I0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMVirtualIndexToPosIndexList$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int intValue = ((java.lang.Number) ((java.util.ArrayList) list2).get(i17)).intValue();
            java.lang.String str = ((y84.n3) list.get(intValue)).f460163e;
            if (str == null) {
                str = "";
            }
            if (((java.util.ArrayList) z07).contains(str)) {
                y84.h3.N(h3Var, a17, str);
                if (a17 != null) {
                    a17.f162569a = 37;
                }
            } else {
                y84.h3.M(h3Var, a17);
                if (a17 != null) {
                    a17.f162569a = 36;
                }
                intValue = 0;
            }
            w64.n a18 = y84.h3.C(h3Var).a();
            if (a18 != null) {
                a18.o(a17, snsInfo, intValue);
            }
            w64.n a19 = y84.h3.C(h3Var).a();
            if (a19 != null) {
                a19.k(view);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$2");
    }
}
