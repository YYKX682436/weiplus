package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.m implements yz5.p {
    public o(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.plugin.ringtone.uic.v.class, "onClickAvatar", "onClickAvatar(ILcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List data;
        int intValue = ((java.lang.Number) obj).intValue();
        ox3.g p17 = (ox3.g) obj2;
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.plugin.ringtone.uic.v vVar = (com.tencent.mm.plugin.ringtone.uic.v) this.receiver;
        vVar.getClass();
        int i17 = vVar.f158507p;
        if (intValue != i17 && i17 >= 0) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = vVar.f158503i;
            ox3.f fVar = (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) ? null : (ox3.f) kz5.n0.a0(data, vVar.f158507p);
            if (fVar != null) {
                ((ox3.g) fVar).f349750e = false;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = vVar.f158503i;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyItemChanged(vVar.f158507p, java.lang.Boolean.FALSE);
            }
        }
        boolean z17 = !p17.f349750e;
        p17.f349750e = z17;
        if (z17) {
            vx3.i a17 = qx3.d.a(p17.getItemId());
            if (a17 != null) {
                long itemId = p17.getItemId();
                androidx.appcompat.app.AppCompatActivity activity = vVar.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                ((com.tencent.mm.plugin.ringtone.uic.z1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.z1.class)).P6(a17, itemId, true, !a17.j(), true);
            }
            return jz5.f0.f302826a;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = vVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.z1) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.z1.class)).O6();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = vVar.f158503i;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyItemChanged(intValue, java.lang.Boolean.TRUE);
        }
        boolean z18 = p17.f349750e;
        if (!z18) {
            intValue = -1;
        }
        vVar.f158507p = intValue;
        if (!z18) {
            p17 = null;
        }
        vVar.f158508q = p17;
        return jz5.f0.f302826a;
    }
}
