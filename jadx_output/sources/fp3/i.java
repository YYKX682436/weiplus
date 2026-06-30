package fp3;

/* loaded from: classes9.dex */
public class i extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI f265308d;

    public i(com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI, fp3.a aVar) {
        this.f265308d = mallOrderDetailInfoUI;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dp3.b getItem(int i17) {
        return (dp3.b) ((java.util.ArrayList) this.f265308d.f152828e).get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f265308d.f152828e).size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return getItem(i17).f242201e;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fp3.j jVar;
        dp3.b item = getItem(i17);
        int i18 = item.f242201e;
        com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI = this.f265308d;
        if (i18 == 1) {
            android.view.View inflate = android.view.View.inflate(mallOrderDetailInfoUI, com.tencent.mm.R.layout.bwa, null);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.kkj);
            mallOrderDetailInfoUI.f152844x = (android.widget.CheckedTextView) inflate.findViewById(com.tencent.mm.R.id.kkm);
            mallOrderDetailInfoUI.f152845y = (android.widget.CheckedTextView) inflate.findViewById(com.tencent.mm.R.id.kki);
            mallOrderDetailInfoUI.f152844x.setOnClickListener(mallOrderDetailInfoUI.A);
            mallOrderDetailInfoUI.f152845y.setOnClickListener(mallOrderDetailInfoUI.A);
            int i19 = i17 + 1;
            if (i19 < getCount()) {
                mallOrderDetailInfoUI.Y6(findViewById, getItem(i19));
            }
            return inflate;
        }
        if (i18 == 2) {
            android.view.View inflate2 = android.view.View.inflate(mallOrderDetailInfoUI, com.tencent.mm.R.layout.bw_, null);
            android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.kki);
            android.view.View findViewById2 = inflate2.findViewById(com.tencent.mm.R.id.kkj);
            if (com.tencent.mm.sdk.platformtools.t8.P(item.f242198b, 0) >= 0) {
                textView.setText(com.tencent.mm.R.string.grc);
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.tencent.mm.R.raw.mall_order_detail_good, 0);
            } else {
                textView.setText(com.tencent.mm.R.string.grb);
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.tencent.mm.R.raw.mall_order_detail_bad, 0);
            }
            int i27 = i17 + 1;
            if (i27 < getCount()) {
                mallOrderDetailInfoUI.Y6(findViewById2, getItem(i27));
            }
            return inflate2;
        }
        if (view == null) {
            view = android.view.View.inflate(mallOrderDetailInfoUI, com.tencent.mm.R.layout.bw9, null);
            jVar = new fp3.j(mallOrderDetailInfoUI, null);
            jVar.f265309a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kko);
            jVar.f265310b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kkn);
            jVar.f265311c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kkl);
            jVar.f265312d = view.findViewById(com.tencent.mm.R.id.kkj);
            view.setTag(jVar);
        } else {
            jVar = (fp3.j) view.getTag();
        }
        jVar.f265309a.setText(item.f242197a);
        if (android.text.TextUtils.isEmpty(item.f242198b)) {
            jVar.f265310b.setVisibility(4);
        } else {
            jVar.f265310b.setVisibility(0);
            jVar.f265310b.setText(item.f242198b);
        }
        if (item.f242200d) {
            jVar.f265311c.setVisibility(0);
        } else {
            jVar.f265311c.setVisibility(8);
        }
        int i28 = i17 + 1;
        if (i28 < getCount()) {
            mallOrderDetailInfoUI.Y6(jVar.f265312d, getItem(i28));
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
