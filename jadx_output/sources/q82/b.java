package q82;

/* loaded from: classes12.dex */
public class b extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q82.c f360737b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q82.c cVar) {
        super(cVar);
        this.f360737b = cVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        q82.a aVar = (q82.a) eVar;
        q82.c cVar = (q82.c) gVar;
        com.tencent.mm.ui.MMImageView mMImageView = aVar.f360732a;
        com.tencent.mm.plugin.fts.ui.n3.k(context, mMImageView, cVar.f360744w, cVar.f360743v, cVar.f360745x, false, mMImageView.getMeasuredWidth(), aVar.f360732a.getMeasuredHeight());
        android.widget.TextView textView = aVar.f360733b;
        android.widget.TextView textView2 = aVar.f360734c;
        q82.c cVar2 = this.f360737b;
        java.lang.CharSequence charSequence = cVar2.f360740s;
        java.lang.CharSequence charSequence2 = cVar2.f360741t;
        try {
            if (com.tencent.mm.plugin.fts.ui.n3.a(charSequence, textView)) {
                if (com.tencent.mm.plugin.fts.ui.n3.a(charSequence2, textView2)) {
                    textView.setMaxLines(1);
                    textView2.setMaxLines(1);
                } else {
                    textView.setMaxLines(2);
                }
            } else if (com.tencent.mm.plugin.fts.ui.n3.a(charSequence2, textView2)) {
                textView2.setMaxLines(2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSFavoriteDataItem", e17, "fillingCommonItemTitleAndDesc", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(cVar2.f360742u, aVar.f360735d);
        if (cVar2.f360739r) {
            android.view.View view = aVar.f360736e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = aVar.f360736e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bc7, viewGroup, false);
        q82.a aVar = this.f360737b.f360747z;
        aVar.f360732a = (com.tencent.mm.ui.MMImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        aVar.f360733b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        aVar.f360734c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482331bl);
        aVar.f360735d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487100ni2);
        aVar.f360736e = inflate.findViewById(com.tencent.mm.R.id.d0v);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 10;
        z9Var.f8532e = ((q82.c) gVar).f360738q.f351186d;
        z9Var.f8535h = context;
        z9Var.f8546s = new r45.dq0();
        q82.c cVar = this.f360737b;
        if (cVar.f423763f == 1) {
            z9Var.f8546s.f372653d = 3;
        } else {
            z9Var.f8546s.f372653d = 4;
        }
        r45.dq0 dq0Var = z9Var.f8546s;
        dq0Var.f372654e = 3;
        dq0Var.f372655f = cVar.f423767j;
        favoriteOperationEvent.e();
        return true;
    }
}
