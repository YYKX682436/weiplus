package y84;

/* loaded from: classes4.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f460051e;

    public f3(y84.h3 h3Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f460050d = h3Var;
        this.f460051e = snsInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$1$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y84.h3 h3Var = this.f460050d;
        y84.l3 E = y84.h3.E(h3Var);
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = E != null ? E.a() : null;
        y84.h3.M(h3Var, a17);
        if (a17 != null) {
            a17.f162569a = 38;
        }
        w64.n a18 = y84.h3.C(h3Var).a();
        if (a18 != null) {
            a18.n(a17, this.f460051e);
        }
        w64.n a19 = y84.h3.C(h3Var).a();
        if (a19 != null) {
            a19.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$1$2");
    }
}
