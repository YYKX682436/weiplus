package e23;

/* loaded from: classes12.dex */
public class z extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a0 f247003b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e23.a0 a0Var) {
        super(a0Var);
        this.f247003b = a0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.y yVar = (e23.y) eVar;
        android.view.View view = yVar.f246994a;
        e23.a0 a0Var = this.f247003b;
        com.tencent.mm.plugin.fts.ui.n3.i(view, a0Var.f423761d);
        yVar.f246995b.setText(((e23.a0) gVar).f246773s);
        yVar.f246996c.setImageResource(com.tencent.mm.R.raw.fts_more_button_icon);
        if (a0Var.f423759b == 0 || !a0Var.f246771q) {
            android.view.View view2 = yVar.f246997d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSCreateTalkerMessageDataItem$FTSCreateTalkerMessageViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/item/FTSCreateTalkerMessageDataItem$FTSCreateTalkerMessageViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = yVar.f246997d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSCreateTalkerMessageDataItem$FTSCreateTalkerMessageViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/item/FTSCreateTalkerMessageDataItem$FTSCreateTalkerMessageViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489116bc1, viewGroup, false);
        e23.y yVar = new e23.y(this.f247003b);
        yVar.f246995b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        yVar.f246996c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h6y);
        yVar.f246997d = inflate.findViewById(com.tencent.mm.R.id.knz);
        yVar.f246994a = inflate.findViewById(com.tencent.mm.R.id.mem);
        inflate.setTag(yVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        android.content.Intent intent = new android.content.Intent();
        e23.a0 a0Var = this.f247003b;
        intent.putExtra("key_talker_query", a0Var.f423762e.f351132d[0]);
        intent.putExtra("key_query", a0Var.f423762e.f351132d[1]);
        intent.putExtra("Search_Scene", a0Var.f423765h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f246772r)) {
            o13.n.q(context, ".ui.FTSTalkerMessageUI", intent);
        } else {
            intent.putExtra("key_conv", a0Var.f246772r);
            intent.putExtra("detail_type", 1);
            o13.n.q(context, ".ui.FTSConvTalkerMessageUI", intent);
        }
        return true;
    }
}
