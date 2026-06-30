package fp3;

/* loaded from: classes9.dex */
public class l extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderProductListUI f265314d;

    public l(com.tencent.mm.plugin.order.ui.MallOrderProductListUI mallOrderProductListUI, fp3.k kVar) {
        this.f265314d = mallOrderProductListUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f265314d.f152849f).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.order.model.ProductSectionItem) ((java.util.ArrayList) this.f265314d.f152849f).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fp3.n nVar;
        com.tencent.mm.plugin.order.ui.MallOrderProductListUI mallOrderProductListUI = this.f265314d;
        if (view == null) {
            view = android.view.View.inflate(mallOrderProductListUI, com.tencent.mm.R.layout.bws, null);
            nVar = new fp3.n(mallOrderProductListUI, null);
            nVar.f265317d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hj7);
            nVar.f265319f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hj6);
            nVar.f265320g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485390hj3);
            nVar.f265321h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hj8);
            nVar.f265322i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485391hj4);
            nVar.f265323m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hj9);
            view.setTag(nVar);
        } else {
            nVar = (fp3.n) view.getTag();
        }
        com.tencent.mm.plugin.order.model.ProductSectionItem productSectionItem = (com.tencent.mm.plugin.order.model.ProductSectionItem) ((java.util.ArrayList) mallOrderProductListUI.f152849f).get(i17);
        java.lang.String str = productSectionItem.f152809d;
        nVar.f265318e = str;
        if (android.text.TextUtils.isEmpty(str) || !com.tencent.mm.wallet_core.ui.r1.Q(nVar.f265318e)) {
            nVar.f265317d.setImageResource(com.tencent.mm.R.raw.mall_order_detail_frame);
        } else {
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            hp3.c cVar = new hp3.c(nVar.f265318e);
            ((x60.e) fVar).getClass();
            nVar.f265317d.setImageBitmap(x51.w0.d(cVar));
        }
        nVar.f265319f.setText(productSectionItem.f152810e);
        nVar.f265320g.setText(com.tencent.mm.plugin.order.model.ProductSectionItem.Skus.a(productSectionItem.f152811f));
        nVar.f265321h.setText(productSectionItem.f152813h);
        nVar.f265322i.setText("+" + productSectionItem.f152812g);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(nVar);
        nVar.f265323m.setVisibility(8);
        return view;
    }
}
