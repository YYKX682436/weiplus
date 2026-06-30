package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.m implements yz5.p {
    public l(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.plugin.ringtone.uic.v.class, "onClickUse", "onClickUse(ILcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        t45.f fVar;
        vx3.i a17;
        int intValue = ((java.lang.Number) obj).intValue();
        ox3.g p17 = (ox3.g) obj2;
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.plugin.ringtone.uic.v vVar = (com.tencent.mm.plugin.ringtone.uic.v) this.receiver;
        vVar.getClass();
        t45.g gVar = p17.f349749d.f415617f;
        if (gVar != null && (fVar = gVar.f415560d) != null && (a17 = qx3.d.a(fVar.f415549d)) != null) {
            androidx.appcompat.app.AppCompatActivity activity = vVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            int i17 = ((com.tencent.mm.plugin.ringtone.uic.c3) zVar.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158374f;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = vVar.f158503i;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemChanged(intValue, java.lang.Boolean.FALSE);
            }
            androidx.appcompat.app.AppCompatActivity activity2 = vVar.getActivity();
            androidx.lifecycle.o mo133getLifecycle = vVar.getActivity().mo133getLifecycle();
            kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
            int i18 = vVar.f158499e;
            java.lang.String str = (i18 == 6 || i18 == 9 || i18 == 10) ? "" : vVar.f158500f;
            androidx.appcompat.app.AppCompatActivity activity3 = vVar.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            cy3.q.b(activity2, mo133getLifecycle, str, a17, 7L, i18, i17, ((com.tencent.mm.plugin.ringtone.uic.g2) zVar.a(activity3).a(com.tencent.mm.plugin.ringtone.uic.g2.class)).Q6(), vVar.f158501g > 1, false, null, new com.tencent.mm.plugin.ringtone.uic.t(vVar, intValue), com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX, null);
            androidx.appcompat.app.AppCompatActivity activity4 = vVar.getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            java.lang.Object a18 = zVar.a(activity4).a(com.tencent.mm.plugin.ringtone.uic.c3.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            ed0.z0.i1((ed0.z0) a18, 9L, vVar.f158507p, vVar.f158508q, 0L, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
