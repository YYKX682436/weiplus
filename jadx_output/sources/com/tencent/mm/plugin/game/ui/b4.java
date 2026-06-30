package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class b4 implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f141046d = 0;

    public final void a(android.content.Context context, com.tencent.mm.plugin.game.model.b bVar) {
        int i17;
        int o17;
        int i18 = bVar.f140205h2;
        if (i18 == 1) {
            o17 = r53.f.v(context, bVar.f140208k2, null, null);
        } else {
            if (i18 != 0) {
                i17 = 0;
                com.tencent.mm.game.report.l.g(context, bVar.f140212o2, bVar.f140213p2, bVar.f140214q2, i17, bVar.field_appId, this.f141046d, bVar.f140210m2, bVar.f140221x2);
            }
            if (bVar.I0() && !com.tencent.mm.sdk.platformtools.t8.K0(bVar.C2.f323655i)) {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                if (!com.tencent.mm.pluginsdk.model.app.w.q(context, bVar)) {
                    o17 = r53.f.v(context, bVar.C2.f323655i, null, null);
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.Q) || bVar.T != 4) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putCharSequence("game_app_id", bVar.field_appId);
                int i19 = bVar.f140213p2;
                if (i19 == 1601) {
                    bundle.putInt("game_report_from_scene", this.f141046d);
                } else {
                    bundle.putInt("game_report_from_scene", i19);
                }
                o17 = r53.f.o(context, bVar.field_appId, bVar.f140208k2, bundle, 0);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameItemClickListener", "Download via Google Play");
                ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).wi(context, bVar.Q);
                o17 = 25;
            }
        }
        i17 = o17;
        com.tencent.mm.game.report.l.g(context, bVar.f140212o2, bVar.f140213p2, bVar.f140214q2, i17, bVar.field_appId, this.f141046d, bVar.f140210m2, bVar.f140221x2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.plugin.game.model.b)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        a(view.getContext(), (com.tencent.mm.plugin.game.model.b) view.getTag());
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.Object item = adapterView.getAdapter().getItem(i17);
        if (item == null || !(item instanceof com.tencent.mm.plugin.game.model.b)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.plugin.game.model.b bVar = (com.tencent.mm.plugin.game.model.b) item;
        if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.field_appId)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            a(view.getContext(), bVar);
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
