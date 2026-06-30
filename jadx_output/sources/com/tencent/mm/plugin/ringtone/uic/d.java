package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f158377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f158378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.f f158379f;

    public d(com.tencent.mm.ui.widget.dialog.y1 y1Var, java.util.ArrayList arrayList, com.tencent.mm.plugin.ringtone.uic.f fVar) {
        this.f158377d = y1Var;
        this.f158378e = arrayList;
        this.f158379f = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        t45.o0 o0Var;
        com.tencent.mm.protobuf.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC$addRingtoneToTingList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct voipringtonerecommendreportstruct = new com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct();
        voipringtonerecommendreportstruct.f63183g = 16L;
        voipringtonerecommendreportstruct.f63198v = voipringtonerecommendreportstruct.b("extrainfo", "", true);
        voipringtonerecommendreportstruct.k();
        this.f158377d.q();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (ox3.g gVar2 : this.f158378e) {
            java.lang.String listenId = (!gVar2.f349753h || (o0Var = gVar2.f349749d.f415622n) == null || (gVar = o0Var.f415625d) == null) ? null : new bw5.lb0().parseFrom(gVar.f192156a).getListenId();
            if (listenId != null) {
                arrayList2.add(listenId);
            }
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        com.tencent.mm.plugin.ringtone.uic.f fVar = this.f158379f;
        ((rk4.k8) aj6).j(fVar.getActivity(), qk.x9.f364368d, arrayList2, new com.tencent.mm.plugin.ringtone.uic.c(arrayList2, fVar), bw5.ar0.TingScene_BellHistory);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC$addRingtoneToTingList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
