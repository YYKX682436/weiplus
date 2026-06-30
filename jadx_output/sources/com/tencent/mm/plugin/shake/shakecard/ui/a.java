package com.tencent.mm.plugin.shake.shakecard.ui;

/* loaded from: classes11.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.shakecard.ui.e f162062d;

    public a(com.tencent.mm.plugin.shake.shakecard.ui.e eVar) {
        this.f162062d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.shake.shakecard.ui.e eVar = this.f162062d;
        if (id6 == com.tencent.mm.R.id.b8u) {
            eVar.dismiss();
            com.tencent.mm.plugin.shake.shakecard.ui.d dVar = eVar.H;
            if (dVar != null) {
                dVar.a();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "close ShakeCardDialog");
        } else if (view.getId() == com.tencent.mm.R.id.b76) {
            com.tencent.mm.plugin.shake.shakecard.ui.c cVar = eVar.G;
            com.tencent.mm.plugin.shake.shakecard.ui.c cVar2 = com.tencent.mm.plugin.shake.shakecard.ui.c.PRE_ACCEPT;
            com.tencent.mm.plugin.shake.shakecard.ui.c cVar3 = com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTING;
            if (cVar == cVar2) {
                eVar.G = cVar3;
                eVar.f162079o.setVisibility(0);
                eVar.e();
                com.tencent.mm.plugin.shake.shakecard.ui.e.c(eVar);
            } else if (cVar != cVar3) {
                if (cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_FAIL) {
                    com.tencent.mm.plugin.shake.shakecard.ui.e.c(eVar);
                } else if (cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_SUCCES) {
                    eVar.I.alive();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "goCardDetailUI ShakeCardDialog");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11665, eVar.E);
                    android.content.Context context = eVar.getContext();
                    java.lang.String str = eVar.E;
                    java.lang.String str2 = eVar.C.f259330c;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil doCardDetailUI()");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_card_id", str);
                    intent.putExtra("key_card_ext", str2);
                    intent.putExtra("key_from_scene", 15);
                    j45.l.j(context, "card", ".ui.CardDetailUI", intent, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
