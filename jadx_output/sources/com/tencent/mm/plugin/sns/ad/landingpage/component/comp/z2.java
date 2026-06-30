package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes14.dex */
public final class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162994d;

    public z2(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var) {
        this.f162994d = j3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initPlayer$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initPlayer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var = this.f162994d;
        if (j3Var.V().getState() == 0) {
            ((kotlinx.coroutines.flow.q2) j3Var.Z()).e(1);
        } else {
            ((kotlinx.coroutines.flow.q2) j3Var.Z()).e(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initPlayer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initPlayer$1");
    }
}
