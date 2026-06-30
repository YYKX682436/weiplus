package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class g1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f155186d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155187e;

    public g1(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI, com.tencent.mm.plugin.recharge.ui.x0 x0Var) {
        this.f155187e = rechargeUI;
    }

    public void a(int i17) {
        for (int i18 = 0; i18 < this.f155186d.size(); i18++) {
            ((com.tencent.mm.plugin.recharge.model.MallRechargeProduct) this.f155186d.get(i18)).f155080q = false;
        }
        ((com.tencent.mm.plugin.recharge.model.MallRechargeProduct) this.f155186d.get(i17)).f155080q = true;
    }

    public void c(java.util.List list) {
        this.f155186d = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f155186d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.recharge.model.MallRechargeProduct) this.f155186d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.View.inflate(this.f155187e, com.tencent.mm.R.layout.ccq, null);
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = (com.tencent.mm.plugin.recharge.model.MallRechargeProduct) this.f155186d.get(i17);
        checkedTextView.setText(mallRechargeProduct.f155073g);
        checkedTextView.setEnabled(mallRechargeProduct.a());
        if (mallRechargeProduct.f155080q) {
            checkedTextView.setChecked(true);
        } else {
            checkedTextView.setChecked(false);
        }
        return checkedTextView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        if (((com.tencent.mm.plugin.recharge.model.MallRechargeProduct) this.f155186d.get(i17)).a()) {
            return super.isEnabled(i17);
        }
        return false;
    }
}
