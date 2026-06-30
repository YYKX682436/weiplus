package or1;

/* loaded from: classes12.dex */
public class a0 extends fb5.b {
    public a0(or1.c0 c0Var) {
    }

    @Override // fb5.b
    public void a(android.view.View view, fb5.a aVar) {
        if (view == null || aVar == null || !(aVar instanceof or1.b0)) {
            return;
        }
        ((or1.b0) aVar).f347457a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bdd);
    }

    @Override // fb5.b
    public void b(android.content.Context context, fb5.a aVar, fb5.c cVar, java.lang.Object... objArr) {
        if (context == null || aVar == null || cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CatalogDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.b0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CatalogDataItem", "The ViewHolder is not a instance of CatalogViewHolder.");
        } else if (cVar instanceof or1.c0) {
            lr1.m.b(((or1.b0) aVar).f347457a, ((or1.c0) cVar).f347468d);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CatalogDataItem", "The DataItem is not a instance of CatalogDataItem.");
        }
    }

    @Override // fb5.b
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        return view == null ? android.view.View.inflate(context, com.tencent.mm.R.layout.ciz, null) : view;
    }

    @Override // fb5.b
    public boolean d(android.content.Context context, android.view.View view, fb5.c cVar, java.lang.Object... objArr) {
        return true;
    }
}
