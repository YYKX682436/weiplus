package df2;

/* loaded from: classes3.dex */
public final class al implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f229728d;

    public al(df2.pl plVar) {
        this.f229728d = plVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pl plVar = this.f229728d;
        com.tencent.mars.xlog.Log.i(plVar.f231087m, "[delCustomText]");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(plVar.O6(), 1, false);
        android.view.View inflate = android.view.View.inflate(plVar.O6(), com.tencent.mm.R.layout.f488904as5, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
        roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(plVar.O6(), 12), com.tencent.mm.ui.zk.a(plVar.O6(), 12), 0.0f, 0.0f);
        android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
        android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        button.setOnClickListener(new df2.tk(plVar, c0Var, k0Var));
        button2.setOnClickListener(new df2.uk(k0Var));
        k0Var.f211854d = new df2.vk(c0Var, plVar);
        k0Var.f211872n = new df2.wk(k0Var, roundedCornerFrameLayout);
        k0Var.e(true);
        k0Var.v();
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = plVar.f231090p;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
