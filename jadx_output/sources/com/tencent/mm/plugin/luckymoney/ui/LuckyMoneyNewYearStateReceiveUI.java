package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearStateReceiveUI;", "Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LuckyMoneyNewYearStateReceiveUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public ym5.w1 B;
    public ym5.w1 C;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f146450g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f146451h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f146452i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f146453m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f146454n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView f146455o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f146456p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f146457q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f146458r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f146459s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f146460t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f146461u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f146462v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f146463w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f146464x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f146465y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.api.LuckyMoneyNewYearStateInfo f146466z;

    public final void V6(java.lang.String str) {
        com.tencent.mm.plugin.wallet.api.LuckyMoneyNewYearStateInfo luckyMoneyNewYearStateInfo = this.f146466z;
        if (luckyMoneyNewYearStateInfo == null) {
            kotlin.jvm.internal.o.o("info");
            throw null;
        }
        java.lang.String d17 = com.tencent.mm.plugin.luckymoney.model.e5.d(luckyMoneyNewYearStateInfo.f177561m, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            android.widget.ImageView imageView = this.f146452i;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("newYearGoodImg");
                throw null;
            }
            imageView.setVisibility(0);
            com.tencent.mm.view.MMPAGView mMPAGView = this.f146462v;
            if (mMPAGView != null) {
                mMPAGView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("pagVideoView");
                throw null;
            }
        }
        android.widget.ImageView imageView2 = this.f146452i;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("newYearGoodImg");
            throw null;
        }
        imageView2.setVisibility(8);
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f146462v;
        if (mMPAGView2 == null) {
            kotlin.jvm.internal.o.o("pagVideoView");
            throw null;
        }
        mMPAGView2.setVisibility(0);
        com.tencent.mm.view.MMPAGView mMPAGView3 = this.f146462v;
        if (mMPAGView3 != null) {
            mMPAGView3.post(new com.tencent.mm.plugin.luckymoney.ui.zi(str, d17, this));
        } else {
            kotlin.jvm.internal.o.o("pagVideoView");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dn_;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03cd  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.view.MMPAGView mMPAGView = this.f146462v;
        if (mMPAGView == null) {
            kotlin.jvm.internal.o.o("pagVideoView");
            throw null;
        }
        if (mMPAGView.getVisibility() == 0) {
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.f146462v;
            if (mMPAGView2 == null) {
                kotlin.jvm.internal.o.o("pagVideoView");
                throw null;
            }
            mMPAGView2.setVisibility(8);
            com.tencent.mm.view.MMPAGView mMPAGView3 = this.f146462v;
            if (mMPAGView3 != null) {
                com.tencent.mm.plugin.luckymoney.model.e5.o(mMPAGView3, this.B, this.C);
            } else {
                kotlin.jvm.internal.o.o("pagVideoView");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
