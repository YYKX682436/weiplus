package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.vp f119665d;

    public rp(com.tencent.mm.plugin.finder.live.widget.vp vpVar) {
        this.f119665d = vpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMicVoiceRoomLbsRequestPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.vp vpVar = this.f119665d;
        vpVar.o0(2, 2, new com.tencent.mm.plugin.finder.live.widget.qp(vpVar));
        android.widget.CheckBox checkBox = vpVar.R;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        if (!checkBox.isChecked()) {
            ((com.tencent.mm.plugin.finder.live.widget.sp) ((jz5.n) vpVar.U).getValue()).b();
        } else {
            if (!com.tencent.mm.sdk.platformtools.n2.a()) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                android.content.Context context = vpVar.f118183e;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getString(com.tencent.mm.R.string.mlf);
                e4Var.c();
                com.tencent.mars.xlog.Log.i(vpVar.Q, "isGpsEnable false");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMicVoiceRoomLbsRequestPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!vpVar.k0()) {
                vpVar.K = false;
                com.tencent.mm.plugin.finder.live.widget.e0.t(vpVar, false, 1, null);
            }
            vpVar.h0(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMicVoiceRoomLbsRequestPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
