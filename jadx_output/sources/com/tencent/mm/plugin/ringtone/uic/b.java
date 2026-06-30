package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.f f158342d;

    public b(com.tencent.mm.plugin.ringtone.uic.f fVar) {
        this.f158342d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC$addRingtoneToTingList$2$1$invoke$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct voipringtonerecommendreportstruct = new com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct();
        voipringtonerecommendreportstruct.f63183g = 14L;
        voipringtonerecommendreportstruct.f63198v = voipringtonerecommendreportstruct.b("extrainfo", "", true);
        voipringtonerecommendreportstruct.k();
        qk.f9.e(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), this.f158342d.getActivity(), bw5.ar0.TingScene_BellHistory, null, 0, null, null, 60, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC$addRingtoneToTingList$2$1$invoke$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
