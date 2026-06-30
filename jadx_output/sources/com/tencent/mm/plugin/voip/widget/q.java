package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f177188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.VoipScoreDialog f177189e;

    public q(com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog, int i17) {
        this.f177189e = voipScoreDialog;
        this.f177188d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/widget/VoipScoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.voip.widget.VoipScoreDialog.f177123i;
        com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog = this.f177189e;
        voipScoreDialog.getClass();
        int i18 = this.f177188d;
        rk0.c.c("MicroMsg.VoipScoreDialog", "onScoreViewClick %s", java.lang.Integer.valueOf(i18));
        if (i18 >= 0) {
            android.widget.ImageView[] imageViewArr = voipScoreDialog.f177126f;
            if (i18 < imageViewArr.length) {
                for (int i19 = 0; i19 <= i18; i19++) {
                    imageViewArr[i19].setImageResource(com.tencent.mm.R.drawable.f482204ch2);
                }
                int i27 = i18 + 1;
                for (int i28 = i27; i28 < imageViewArr.length; i28++) {
                    imageViewArr[i28].setImageResource(com.tencent.mm.R.drawable.f482203ch1);
                }
                voipScoreDialog.f177128h = i27;
            }
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = voipScoreDialog.f177127g;
        if (j0Var != null) {
            j0Var.z(com.tencent.mm.R.string.kd6, new com.tencent.mm.plugin.voip.widget.u(voipScoreDialog));
            voipScoreDialog.f177127g.u(com.tencent.mm.R.string.f490347sg, new com.tencent.mm.plugin.voip.widget.v(voipScoreDialog));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/voip/widget/VoipScoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
