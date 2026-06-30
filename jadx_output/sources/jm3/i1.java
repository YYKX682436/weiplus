package jm3;

/* loaded from: classes11.dex */
public class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm3.j1 f300325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.WeCheckBox f300326e;

    public i1(com.tencent.mm.plugin.mv.ui.WeCheckBox weCheckBox, jm3.j1 j1Var) {
        this.f300326e = weCheckBox;
        this.f300325d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/WeCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.WeCheckBox weCheckBox = this.f300326e;
        boolean z17 = !weCheckBox.f150892r;
        weCheckBox.f150892r = z17;
        jm3.j1 j1Var = this.f300325d;
        if (j1Var != null) {
            com.tencent.mm.plugin.mv.ui.shake.c cVar = (com.tencent.mm.plugin.mv.ui.shake.c) j1Var;
            b21.r rVar = cVar.f150936a;
            if (rVar == null) {
                int i17 = com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew.H;
                com.tencent.mars.xlog.Log.e("MusicMainUINew", "musicWrapper is null, do nothing");
            } else if (z17) {
                int i18 = com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew.H;
                com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = cVar.f150937b;
                musicMainUINew.U6(rVar, true);
                musicMainUINew.f150913s = true;
            } else {
                rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
                if (rVar.f17346e.equals(z8Var.Vi(rVar.f17345d))) {
                    z8Var.zj();
                }
            }
        }
        if (weCheckBox.f150892r) {
            weCheckBox.setImageResource(com.tencent.mm.R.raw.icons_outlined_pause_white);
        } else {
            weCheckBox.setImageResource(com.tencent.mm.R.raw.icons_outlined_playbtn_white);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/WeCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
