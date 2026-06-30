package e23;

/* loaded from: classes9.dex */
public class a2 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.c2 f246776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(e23.c2 c2Var) {
        super(c2Var);
        this.f246776b = c2Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        android.widget.LinearLayout linearLayout;
        e23.b2 b2Var = (e23.b2) eVar;
        e23.c2 c2Var = this.f246776b;
        if (c2Var.f246799r) {
            b2Var.f246791a.setOnClickListener(new e23.y1(this, context));
        } else {
            b2Var.f246791a.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        for (int i17 = 0; i17 < c2Var.f246798q.size(); i17++) {
            r45.vx5 vx5Var = (r45.vx5) c2Var.f246798q.get(i17);
            if (i17 % 2 != 0) {
                linearLayout = (android.widget.LinearLayout) linearLayout2.findViewById(com.tencent.mm.R.id.q9h);
                linearLayout.setVisibility(0);
                linearLayout.setTag(java.lang.Integer.valueOf(i17));
                linearLayout.setOutlineProvider(new zl5.a(true, true, i65.a.b(context, 4)));
                linearLayout.setClipToOutline(true);
                ((android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.q9j)).setText(vx5Var.f388646d);
            } else {
                linearLayout2 = (android.widget.LinearLayout) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dfb, (android.view.ViewGroup) null);
                float b17 = i65.a.b(context, 4);
                if (linearLayout2 != null) {
                    linearLayout2.setOutlineProvider(new zl5.a(true, true, b17));
                }
                if (linearLayout2 != null) {
                    linearLayout2.setClipToOutline(true);
                }
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) linearLayout2.findViewById(com.tencent.mm.R.id.q9g);
                linearLayout3.setTag(java.lang.Integer.valueOf(i17));
                linearLayout3.setOutlineProvider(new zl5.a(true, true, i65.a.b(context, 4)));
                linearLayout3.setClipToOutline(true);
                ((android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.q9i)).setText(vx5Var.f388646d);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, i65.a.b(context, 8), 0, 0);
                linearLayout2.setLayoutParams(layoutParams);
                android.view.View findViewById = linearLayout2.findViewById(com.tencent.mm.R.id.q9h);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b2Var.f246792b.addView(linearLayout2);
                linearLayout = linearLayout3;
            }
            linearLayout.setOnClickListener(new e23.z1(this, linearLayout, context));
        }
        b2Var.f246792b.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dfc, viewGroup, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.q9e);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.q9f);
        float b17 = i65.a.b(context, 8);
        if (linearLayout != null) {
            linearLayout.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout != null) {
            linearLayout.setClipToOutline(true);
        }
        float b18 = i65.a.b(context, 8);
        if (linearLayout2 != null) {
            linearLayout2.setOutlineProvider(new zl5.a(true, true, b18));
        }
        if (linearLayout2 != null) {
            linearLayout2.setClipToOutline(true);
        }
        e23.b2 b2Var = this.f246776b.f246801t;
        b2Var.f246791a = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.q9e);
        b2Var.f246792b = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.q__);
        inflate.setTag(b2Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
