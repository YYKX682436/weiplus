package com.tencent.mm.plugin.wallet_payu.create.ui;

/* loaded from: classes15.dex */
public class WalletPayUOpenIntroView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMAutoHeightViewPager f181244d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMPageControlView f181245e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f181246f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f181247g;

    /* renamed from: h, reason: collision with root package name */
    public tt4.a[] f181248h;

    public WalletPayUOpenIntroView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f181247g = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c98, (android.view.ViewGroup) this, true);
        this.f181244d = (com.tencent.mm.ui.base.MMAutoHeightViewPager) inflate.findViewById(com.tencent.mm.R.id.kod);
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = (com.tencent.mm.ui.base.MMPageControlView) inflate.findViewById(com.tencent.mm.R.id.cii);
        this.f181245e = mMPageControlView;
        mMPageControlView.setVisibility(0);
        this.f181244d.setOnPageChangeListener(new ut4.a(this));
    }

    public void setPagerData(tt4.a[] aVarArr) {
        this.f181248h = aVarArr;
        this.f181246f = new java.util.ArrayList();
        if (this.f181248h != null) {
            for (int i17 = 0; i17 < this.f181248h.length; i17++) {
                this.f181246f.add(android.view.LayoutInflater.from(this.f181247g).inflate(com.tencent.mm.R.layout.c99, (android.view.ViewGroup) null));
            }
        }
        this.f181244d.setAdapter(new ut4.b(this, null));
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = this.f181245e;
        tt4.a[] aVarArr2 = this.f181248h;
        mMPageControlView.f197514e = aVarArr2 == null ? 0 : aVarArr2.length;
        mMPageControlView.a(0);
    }

    public WalletPayUOpenIntroView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
