package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class c implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f158368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.f f158369e;

    public c(java.util.List list, com.tencent.mm.plugin.ringtone.uic.f fVar) {
        this.f158368d = list;
        this.f158369e = fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (!((java.lang.Boolean) obj2).booleanValue()) {
            java.lang.String jSONObject = new org.json.JSONObject().put("add_bell_num", this.f158368d.size()).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
            com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct voipringtonerecommendreportstruct = new com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct();
            voipringtonerecommendreportstruct.f63183g = 15L;
            voipringtonerecommendreportstruct.f63198v = voipringtonerecommendreportstruct.b("extrainfo", t17, true);
            voipringtonerecommendreportstruct.k();
            com.tencent.mm.plugin.ringtone.uic.f fVar = this.f158369e;
            android.view.View inflate = android.view.LayoutInflater.from(fVar.getActivity()).inflate(com.tencent.mm.R.layout.dd8, (android.view.ViewGroup) null);
            inflate.findViewById(com.tencent.mm.R.id.q1t).setOnClickListener(new com.tencent.mm.plugin.ringtone.uic.b(fVar));
            com.tencent.mm.ui.widget.snackbar.f fVar2 = new com.tencent.mm.ui.widget.snackbar.f(fVar.getActivity());
            fVar2.f212471e = inflate;
            fVar2.f212470d = 2500;
            fVar2.a();
        }
        return jz5.f0.f302826a;
    }
}
