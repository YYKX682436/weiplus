package ub3;

/* loaded from: classes15.dex */
public class t extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426138d;

    public t(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI, ub3.j jVar) {
        this.f426138d = luckyMoneyF2FQRCodeUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f426138d.f145083t).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) ((java.util.ArrayList) this.f426138d.f145083t).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ub3.s sVar;
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426138d;
        if (view == null) {
            view = android.view.LayoutInflater.from(luckyMoneyF2FQRCodeUI).inflate(com.tencent.mm.R.layout.buh, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.j1u);
            android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.j1n);
            sVar = new ub3.s(this);
            sVar.f426135a = imageView;
            sVar.f426136b = imageView2;
            view.setTag(sVar);
        } else {
            sVar = (ub3.s) view.getTag();
        }
        java.lang.String str = (java.lang.String) ((java.util.HashMap) luckyMoneyF2FQRCodeUI.f145084u).get((java.lang.String) ((java.util.ArrayList) luckyMoneyF2FQRCodeUI.f145083t).get(i17));
        com.tencent.mm.plugin.luckymoney.model.m5.b(sVar.f426135a, null, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyF2FQRCodeUI.L) || !luckyMoneyF2FQRCodeUI.L.equals(str)) {
            sVar.f426136b.setVisibility(4);
        } else {
            sVar.f426136b.setVisibility(0);
        }
        return view;
    }
}
