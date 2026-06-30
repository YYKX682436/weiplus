package ns4;

/* loaded from: classes3.dex */
public final class f implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339517d;

    public f(ns4.s sVar) {
        this.f339517d = sVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        ns4.s sVar = this.f339517d;
        sVar.getClass();
        if (l17 != null) {
            long longValue = l17.longValue();
            android.view.View view = sVar.f339644i;
            if (view == null) {
                kotlin.jvm.internal.o.o("mCustomView");
                throw null;
            }
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m3i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog", "updateTitleBalance", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog", "updateTitleBalance", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = sVar.f339644i;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("mCustomView");
                throw null;
            }
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.f486552ln5);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById2;
            os4.h.m(textView, 15);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            boolean z17 = sVar.f339641f;
            androidx.fragment.app.FragmentActivity fragmentActivity = sVar.f339636a;
            if (z17) {
                textView.setTextColor(fragmentActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
            textView.setText("" + longValue);
            findViewById.setContentDescription(fragmentActivity.getString(com.tencent.mm.R.string.l8t, java.lang.String.valueOf(longValue)));
        }
    }
}
