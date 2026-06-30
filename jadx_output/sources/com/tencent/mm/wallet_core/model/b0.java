package com.tencent.mm.wallet_core.model;

/* loaded from: classes5.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f213857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f213858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletTextView f213859g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213860h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213861i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f213862m;

    public b0(android.view.View view, double d17, int i17, com.tencent.mm.wallet_core.ui.WalletTextView walletTextView, android.view.View view2, android.view.View view3, android.widget.TextView textView) {
        this.f213856d = view;
        this.f213857e = d17;
        this.f213858f = i17;
        this.f213859g = walletTextView;
        this.f213860h = view2;
        this.f213861i = view3;
        this.f213862m = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f213856d;
        int width = view.getWidth();
        long longValue = new java.lang.Double(this.f213857e).longValue();
        int i17 = 0;
        int i18 = 0;
        while (longValue != 0) {
            int i19 = (int) (longValue % 10);
            longValue /= 10;
            i17++;
            i18 = i19;
        }
        if (i17 < this.f213858f) {
            android.view.View view2 = this.f213861i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = this.f213859g;
        int left = (int) (((this.f213860h.getLeft() + walletTextView.getLeft()) + ((i18 == 1 ? walletTextView.getPaint().measureText("1") : walletTextView.getPaint().measureText("2")) / 2.0f)) - (width / 2));
        if (left == 0) {
            android.view.View view3 = this.f213861i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f213861i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f213862m.setText(com.tencent.mm.wallet_core.model.b2.a(i17));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.leftMargin = left;
        view.setLayoutParams(layoutParams);
    }
}
