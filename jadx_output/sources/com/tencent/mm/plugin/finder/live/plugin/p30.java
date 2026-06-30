package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r30 f113826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113827e;

    public p30(com.tencent.mm.plugin.finder.live.plugin.r30 r30Var, android.view.ViewGroup viewGroup) {
        this.f113826d = r30Var;
        this.f113827e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = this.f113826d;
        if (!com.tencent.mm.plugin.finder.live.plugin.r30.t1(r30Var)) {
            r30Var.u1();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.qc6 qc6Var = ((mm2.c1) r30Var.P0(mm2.c1.class)).Q;
        boolean z17 = qc6Var != null && qc6Var.getInteger(3) == 1;
        android.view.ViewGroup viewGroup = this.f113827e;
        if (!z17) {
            df2.ar arVar = (df2.ar) r30Var.U0(df2.ar.class);
            if (arVar != null && arVar.f7()) {
                db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.nwt));
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                com.tencent.mm.plugin.finder.live.plugin.r30 r30Var2 = this.f113826d;
                com.tencent.mm.plugin.finder.live.util.y.m(r30Var2, null, null, new com.tencent.mm.plugin.finder.live.plugin.o30(viewGroup, r30Var2, null), 3, null);
                r30Var.u1();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        r45.qc6 qc6Var2 = ((mm2.c1) r30Var.P0(mm2.c1.class)).Q;
        if (qc6Var2 != null && (string = qc6Var2.getString(4)) != null) {
            java.lang.String str = string.length() == 0 ? string : null;
            if (str != null) {
                android.content.Context context = viewGroup.getContext();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = str;
                e4Var.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
