package e23;

/* loaded from: classes12.dex */
public class p extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.r f246924b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e23.r rVar) {
        super(rVar);
        this.f246924b = rVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.q qVar = (e23.q) eVar;
        e23.r rVar = this.f246924b;
        com.tencent.mm.plugin.fts.ui.n3.a(rVar.f246948v, qVar.f246936b);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(qVar.f246937c, rVar.f246949w, null);
        com.tencent.mm.plugin.fts.ui.n3.a(rVar.f246950x, qVar.f246938d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f246951y)) {
            qVar.f246939e.setVisibility(8);
        } else {
            qVar.f246939e.setVisibility(0);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(qVar.f246939e, rVar.f246951y, null);
        }
        android.view.View view = qVar.f246935a;
        if (rVar.f423761d) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
        } else {
            view.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
        }
        if (rVar.f423759b == 0) {
            android.view.View view2 = qVar.f246941g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = qVar.f246941g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        qVar.f246940f.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bbz, viewGroup, false);
        e23.q qVar = this.f246924b.C;
        qVar.f246936b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485218gy3);
        qVar.f246937c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a9p);
        qVar.f246938d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485219gy4);
        qVar.f246939e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a9r);
        qVar.f246940f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hcv);
        qVar.f246935a = inflate.findViewById(com.tencent.mm.R.id.mem);
        qVar.f246941g = inflate.findViewById(com.tencent.mm.R.id.knz);
        inflate.setTag(qVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
