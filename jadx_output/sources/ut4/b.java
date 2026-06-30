package ut4;

/* loaded from: classes15.dex */
public class b extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView f431184d;

    public b(com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView walletPayUOpenIntroView, ut4.a aVar) {
        this.f431184d = walletPayUOpenIntroView;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) this.f431184d.f181246f.get(i17));
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        tt4.a[] aVarArr = this.f431184d.f181248h;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr.length;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView walletPayUOpenIntroView = this.f431184d;
        android.view.View view = (android.view.View) walletPayUOpenIntroView.f181246f.get(i17);
        viewGroup.addView(view);
        tt4.a aVar = walletPayUOpenIntroView.f181248h[i17];
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.iph);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o_1);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h0_);
        imageView.setImageResource(aVar.f422038a);
        textView.setText(aVar.f422039b);
        textView2.setText(aVar.f422040c);
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
