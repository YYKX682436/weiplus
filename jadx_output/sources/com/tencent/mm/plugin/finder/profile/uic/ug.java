package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ug extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC f124270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC) {
        super(0);
        this.f124270d = finderProfileTemplateUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        android.view.View findViewById2;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC = this.f124270d;
        finderProfileTemplateUIC.Q6().setHasBottomMore(false);
        android.view.View f213435x = finderProfileTemplateUIC.Q6().getF213435x();
        if (f213435x != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View f213435x2 = finderProfileTemplateUIC.Q6().getF213435x();
        android.widget.TextView textView = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View f213435x3 = finderProfileTemplateUIC.Q6().getF213435x();
        android.view.View findViewById3 = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view = findViewById3;
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.app.Activity context = finderProfileTemplateUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.class)).a2()) {
            android.view.View f213435x4 = finderProfileTemplateUIC.Q6().getF213435x();
            if (f213435x4 != null && (findViewById2 = f213435x4.findViewById(com.tencent.mm.R.id.ilg)) != null) {
                findViewById2.setBackgroundColor(finderProfileTemplateUIC.getResources().getColor(com.tencent.mm.R.color.a9e));
            }
        } else {
            android.view.View f213435x5 = finderProfileTemplateUIC.Q6().getF213435x();
            if (f213435x5 != null && (findViewById = f213435x5.findViewById(com.tencent.mm.R.id.ilg)) != null) {
                findViewById.setBackgroundColor(finderProfileTemplateUIC.getResources().getColor(com.tencent.mm.R.color.aaw));
            }
        }
        return jz5.f0.f302826a;
    }
}
