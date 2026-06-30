package ww1;

/* loaded from: classes5.dex */
public final class d extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.f f450168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y63.a f450169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ww1.f fVar, y63.a aVar) {
        super(false);
        this.f450168d = fVar;
        this.f450169e = aVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        ww1.b bVar = this.f450168d.f450180g;
        if (bVar != null) {
            com.tencent.mm.plugin.aa.ui.l5 l5Var = (com.tencent.mm.plugin.aa.ui.l5) bVar;
            com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = l5Var.f72722b.f72748d;
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "importGroupSolitatireData：%s", java.lang.Integer.valueOf(launchAAUI.f72504h));
            launchAAUI.D1 = 1;
            y63.a aVar = this.f450169e;
            launchAAUI.E1 = aVar;
            java.lang.String j17 = h61.o.j(200, aVar.H);
            launchAAUI.f72510p.setFilters(new android.text.InputFilter[]{new com.tencent.mm.plugin.aa.ui.o5(launchAAUI, j17.length() > 100 ? j17.length() : 100)});
            launchAAUI.f72510p.setText(j17);
            java.util.ArrayList arrayList = launchAAUI.F1;
            arrayList.clear();
            java.util.ArrayList arrayList2 = launchAAUI.G1;
            arrayList2.clear();
            ((java.util.HashMap) launchAAUI.R).clear();
            launchAAUI.H.clear();
            ((java.util.ArrayList) launchAAUI.H1).clear();
            launchAAUI.f72506l1 = 2;
            launchAAUI.f72522x1 = "";
            launchAAUI.A.setVisibility(8);
            launchAAUI.f72523y.setVisibility(0);
            launchAAUI.f72526z.setVisibility(0);
            if (launchAAUI.A.getVisibility() == 0) {
                launchAAUI.f72520x.setClickable(false);
            } else {
                launchAAUI.f72520x.setClickable(true);
            }
            java.util.HashMap h17 = h61.o.h(launchAAUI.E1);
            for (int i17 = 1; i17 <= h17.size(); i17++) {
                y63.b bVar2 = (y63.b) h17.get(java.lang.Integer.valueOf(i17));
                if (bVar2 != null) {
                    arrayList.add(bVar2.f459652a);
                    arrayList2.add(bVar2.f459656e);
                }
            }
            launchAAUI.H7();
            launchAAUI.A7();
            launchAAUI.z7();
            db5.t7.e(launchAAUI.getContext(), launchAAUI.getContext().getString(com.tencent.mm.R.string.ga8), com.tencent.mm.R.raw.icons_outlined_done);
            l5Var.f72721a.q();
        }
    }
}
