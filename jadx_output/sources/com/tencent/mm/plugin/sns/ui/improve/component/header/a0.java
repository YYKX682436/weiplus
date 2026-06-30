package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class a0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168812d;

    public a0(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC) {
        this.f168812d = improveHeaderUIC;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.app.Activity context = this.f168812d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = (com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class);
        improveDataUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("debugInsertToList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        boolean z17 = false;
        xc4.p n17 = ((zc4.b) improveDataUIC.S6().f152065o.get(0)).n();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i17 = 1; i17 < 5; i17++) {
            arrayList2.add(((zc4.b) improveDataUIC.S6().f152065o.get(0)).n());
        }
        int i18 = 0;
        for (java.util.Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            xc4.p pVar = new xc4.p();
            pVar.convertFrom(((xc4.p) next).t0(), z17);
            long j17 = i18;
            pVar.setSnsId(n17.y0() + j17 + 1);
            pVar.systemRowid = n17.systemRowid + j17 + 1;
            pVar.setCreateTime(n17.getCreateTime());
            com.tencent.mm.plugin.mvvmlist.MvvmList.q(improveDataUIC.S6(), new zc4.b(pVar, true), false, 2, null);
            z17 = false;
            i18 = i19;
        }
        db5.t7.makeText(improveDataUIC.getContext(), "Debug Mock:InsertToList", z17 ? 1 : 0).show();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("debugInsertToList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2$2");
        return true;
    }
}
