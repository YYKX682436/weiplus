package in2;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292816e;

    public d(in2.s sVar, android.view.View view) {
        this.f292815d = sVar;
        this.f292816e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in2.s sVar = this.f292815d;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = sVar.P;
        boolean z17 = (mMSwitchBtn == null || mMSwitchBtn.f211363x) ? false : true;
        android.view.View view2 = this.f292816e;
        if (z17) {
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setCheck(true);
            }
            sf2.x xVar = sVar.I;
            xVar.q7(true);
            xVar.n7(true, new in2.l(sVar, true, view2));
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view2.getContext(), 1, true);
            android.content.Context context = view2.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489272by3, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odb);
            textView.setGravity(17);
            if (sVar.f0()) {
                textView.setText(context.getResources().getString(com.tencent.mm.R.string.om_));
            } else {
                textView.setText(context.getResources().getString(com.tencent.mm.R.string.p1p));
            }
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
            textView.setTextSize(1, 14.0f);
            k0Var.s(inflate, false);
            k0Var.f211872n = new in2.b(sVar, view2);
            k0Var.f211881s = new in2.c(sVar, view2);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
