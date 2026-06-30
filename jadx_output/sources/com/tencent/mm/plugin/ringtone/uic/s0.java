package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158483d;

    public s0(com.tencent.mm.plugin.ringtone.uic.v0 v0Var) {
        this.f158483d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$refreshAddUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "on click add ui link to add new ringtone");
        com.tencent.mm.plugin.ringtone.uic.v0 v0Var = this.f158483d;
        v0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206781b & (-65));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", v0Var.getString(com.tencent.mm.R.string.iqu));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) mx3.i0.g()).iterator();
        while (it.hasNext()) {
            java.lang.String str = ((vx3.a) it.next()).f441262e;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        arrayList2.add(c01.z1.r());
        intent.putExtra("block_contact", kz5.n0.g0(arrayList2, ",", null, null, 0, null, com.tencent.mm.plugin.ringtone.uic.n0.f158449d, 30, null));
        j45.l.v(v0Var.getActivity(), ".ui.contact.SelectContactUI", intent, 8);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$refreshAddUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
