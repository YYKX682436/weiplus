package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151142d;

    public g5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var) {
        this.f151142d = z5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        fm3.q qVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151142d;
        long j17 = z5Var.D;
        if (j17 >= 0 && z5Var.f151582u + j17 <= z5Var.f151581t) {
            fm3.q qVar2 = z5Var.f151584w;
            fm3.o oVar = qVar2 != null ? qVar2.f264113n : null;
            if (oVar != null) {
                oVar.a(j17);
            }
        }
        com.tencent.mm.plugin.mv.ui.uic.w4 w4Var = z5Var.H;
        if (w4Var != null) {
            boolean z17 = z5Var.B;
            jm3.j0 j0Var = (jm3.j0) w4Var;
            int i17 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
            com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI = j0Var.f300328a;
            android.view.View X6 = musicMvMakerUI.X6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(X6, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onConfirm", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            X6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(X6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onConfirm", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            musicMvMakerUI.Y6().setRadius(i65.a.b(musicMvMakerUI.getContext(), 12));
            pf5.z zVar = pf5.z.f353948a;
            androidx.lifecycle.c1 a17 = zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) a17;
            if (z17) {
                h4Var.f151174u = true;
            }
            android.view.View findViewByPosition = ((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) h4Var.f151164h).getValue()).findViewByPosition(h4Var.f151167n.f151864m);
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) musicMvMakerUI.f150877p).getValue();
            kotlin.jvm.internal.o.f(imageView, "access$getMvItemEditThumb(...)");
            kotlin.jvm.internal.o.d(findViewByPosition);
            com.tencent.mm.ui.widget.MMRoundCornerImageView Y6 = musicMvMakerUI.Y6();
            kotlin.jvm.internal.o.f(Y6, "access$getAlbumFakeThumb(...)");
            android.animation.Animator b17 = fm3.x.a(imageView).b(fm3.x.a(findViewByPosition), Y6, false);
            b17.addListener(new jm3.g0(musicMvMakerUI));
            b17.setDuration(250L);
            b17.start();
            musicMvMakerUI.Z6().animate().translationY(0.0f).setListener(new jm3.h0(musicMvMakerUI)).start();
            jm3.i0 i0Var = new jm3.i0(z17);
            int i18 = h4Var.f151167n.f151864m;
            fm3.q qVar3 = (fm3.q) kz5.n0.a0(h4Var.f151161e, i18);
            if (qVar3 != null) {
                i0Var.invoke(java.lang.Integer.valueOf(i18), qVar3);
            }
            com.tencent.mm.plugin.mv.ui.uic.h4 h4Var2 = (com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
            h4Var2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "disableCurrentSyncMusic");
            com.tencent.mm.plugin.mv.ui.view.i iVar = h4Var2.f151167n;
            if (iVar.f151864m + 1 < h4Var2.R6().getItemCount() && (qVar = (fm3.q) kz5.n0.a0(h4Var2.f151161e, iVar.f151864m)) != null) {
                qVar.f264111i = false;
            }
            ((com.tencent.mm.plugin.mv.ui.uic.z5) zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.z5.class)).W6(false);
            musicMvMakerUI.Z6().d();
            if (!j0Var.f300329b.P6()) {
                com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.V6(musicMvMakerUI);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
