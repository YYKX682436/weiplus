package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem f146974d;

    public h(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem luckyMoneyAutoScrollItem, com.tencent.mm.plugin.luckymoney.ui.f fVar) {
        this.f146974d = luckyMoneyAutoScrollItem;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 2147483646;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return java.lang.Integer.valueOf(i17 % 10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.luckymoney.ui.g gVar;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(this.f146974d.f145948d).inflate(com.tencent.mm.R.layout.bty, (android.view.ViewGroup) null);
            gVar = new com.tencent.mm.plugin.luckymoney.ui.g(this);
            gVar.f146921a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.o4m);
            view.setTag(gVar);
        } else {
            gVar = (com.tencent.mm.plugin.luckymoney.ui.g) view.getTag();
        }
        gVar.f146921a.setImageResource(((java.lang.Integer) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem.f145947m.get(i17 % 10)).intValue());
        return view;
    }
}
