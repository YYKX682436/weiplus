package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 f156290d;

    public m(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var) {
        this.f156290d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.TextView textView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$applyImproveLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = this.f156290d;
        if (!(e0Var.s(1) || ((e0Var.u().getVisibility() == 0) && !(e0Var.s(2) ^ true)))) {
            com.tencent.mars.xlog.Log.i(e0Var.f156197i, "volumeAdjust click ignored: both options off");
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$applyImproveLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.View.OnClickListener onClickListener = e0Var.f156211z;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            jz5.l lVar = (jz5.l) e0Var.A.invoke();
            int intValue = ((java.lang.Number) lVar.f302833d).intValue();
            int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
            e0Var.t().f156275c = e0Var.D;
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j1 t17 = e0Var.t();
            t17.f156276d = e06.p.f(intValue, 0, t17.f156275c);
            t17.f156277e = e06.p.f(intValue2, 0, t17.f156275c);
            boolean z17 = e0Var.s(1) && e0Var.B != null;
            boolean z18 = (!(e0Var.u().getVisibility() == 0) || (e0Var.s(2) ^ true) || e0Var.C == null) ? false : true;
            e0Var.t().f156278f = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.y(z17, e0Var, z18);
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j1 t18 = e0Var.t();
            t18.getClass();
            if (z17 || z18) {
                com.tencent.mm.ui.widget.dialog.y1 y1Var = t18.f156274b;
                if (!(y1Var != null && y1Var.f())) {
                    android.content.Context context = t18.f156273a;
                    com.tencent.mm.ui.widget.dialog.y1 y1Var2 = new com.tencent.mm.ui.widget.dialog.y1(context);
                    y1Var2.d(true);
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489329el0, (android.view.ViewGroup) null, false);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ujb);
                    if (textView2 != null) {
                        com.tencent.mm.ui.fk.a(textView2);
                    }
                    t18.a(inflate, com.tencent.mm.R.id.f486057uj4, com.tencent.mm.R.id.f486058uj5, com.tencent.mm.R.id.uj6, z17, t18.f156276d, new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.g1(t18));
                    t18.a(inflate, com.tencent.mm.R.id.uj8, com.tencent.mm.R.id.uj9, com.tencent.mm.R.id.uj_, z18, t18.f156277e, new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h1(t18));
                    android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.uj7);
                    if (textView3 != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486056uj3)) != null) {
                        inflate.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i1(inflate, textView3, textView));
                    }
                    y1Var2.k(inflate);
                    y1Var2.s();
                    t18.f156274b = y1Var2;
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.MusicVolumeAdjustDialog", "show: nothing to adjust, skip");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$applyImproveLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
