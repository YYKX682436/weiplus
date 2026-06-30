package e23;

/* loaded from: classes12.dex */
public class f0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.g0 f246846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e23.g0 g0Var) {
        super(g0Var);
        this.f246846b = g0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        android.view.View.OnClickListener onClickListener;
        e23.e0 e0Var = (e23.e0) eVar;
        e23.g0 g0Var = this.f246846b;
        com.tencent.mm.plugin.fts.ui.n3.b(g0Var.f246853q, e0Var.f246827b);
        com.tencent.mm.plugin.fts.ui.n3.b(g0Var.f246854r, e0Var.f246828c);
        android.widget.TextView textView = e0Var.f246828c;
        if (textView != null && (onClickListener = g0Var.f246855s) != null) {
            textView.setOnClickListener(onClickListener);
            java.lang.String i17 = g0Var.i();
            java.util.Set set = com.tencent.mm.plugin.fts.ui.x2.f138375a;
            ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.fts.ui.w2(1, i17), 100L);
        }
        if (g0Var.f423759b == 0) {
            android.view.View view = e0Var.f246829d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = e0Var.f246829d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = e0Var.f246826a;
        if (g0Var.f423761d) {
            view3.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
        } else {
            view3.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bc_, viewGroup, false);
        e23.e0 e0Var = (e23.e0) this.f246846b.o();
        e0Var.f246827b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzf);
        e0Var.f246828c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gyu);
        e0Var.f246829d = inflate.findViewById(com.tencent.mm.R.id.knz);
        e0Var.f246826a = inflate.findViewById(com.tencent.mm.R.id.mem);
        inflate.setTag(e0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
