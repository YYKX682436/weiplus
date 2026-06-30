package xt2;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingView f457055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.o45 f457056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.p45 f457057f;

    public v(com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingView finderLiveProductPairingView, r45.o45 o45Var, r45.p45 p45Var) {
        this.f457055d = finderLiveProductPairingView;
        this.f457056e = o45Var;
        this.f457057f = p45Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingView finderLiveProductPairingView = this.f457055d;
        android.view.ViewGroup viewGroup = finderLiveProductPairingView.f126293e;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        r45.o45 o45Var = this.f457056e;
        layoutParams.height = (int) ((o45Var.getInteger(1) / o45Var.getInteger(2)) * finderLiveProductPairingView.getWidth());
        layoutParams.width = (int) ((o45Var.getInteger(2) / o45Var.getInteger(1)) * finderLiveProductPairingView.getHeight());
        viewGroup.setLayoutParams(layoutParams);
        java.util.LinkedList<r45.q45> list = o45Var.getList(3);
        kotlin.jvm.internal.o.f(list, "getLabel_list(...)");
        for (r45.q45 q45Var : list) {
            android.content.Context context = finderLiveProductPairingView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingTagView finderLiveProductPairingTagView = new com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingTagView(context);
            kotlin.jvm.internal.o.d(q45Var);
            finderLiveProductPairingTagView.f126291d.setText(q45Var.getString(3));
            finderLiveProductPairingTagView.setOnClickListener(new xt2.u(q45Var, finderLiveProductPairingTagView, this.f457057f));
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            float f17 = 0.0f;
            float f18 = q45Var.getLong(0) > 0 ? ((float) q45Var.getLong(0)) / 100.0f : 0.0f;
            if (q45Var.getLong(1) > 0) {
                f17 = ((float) q45Var.getLong(1)) / 100.0f;
            }
            layoutParams2.setMarginStart((int) (f18 * finderLiveProductPairingView.getWidth()));
            layoutParams2.topMargin = (int) (f17 * finderLiveProductPairingView.getHeight());
            finderLiveProductPairingTagView.setLayoutParams(layoutParams2);
            finderLiveProductPairingView.f126293e.addView(finderLiveProductPairingTagView);
        }
    }
}
