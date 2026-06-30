package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class yj extends com.tencent.mm.plugin.finder.extension.reddot.rb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f130069d;

    public yj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f130069d = finderShareFeedRelUI;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.rb
    public void a(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f130069d;
        java.lang.String str = finderShareFeedRelUI.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MENU_ID_PROFILE] red=");
        sb6.append(z9Var != null && z9Var.f105327a);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!(z9Var != null && z9Var.f105327a)) {
            finderShareFeedRelUI.B7().f434675k.setVisibility(4);
            return;
        }
        r45.f03 f03Var = z9Var.f105328b;
        int i17 = f03Var != null ? f03Var.f373888e : 0;
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLPersonalCenter");
        if (I0 != null) {
            i17 = I0.f373888e;
        }
        r45.f03 f03Var2 = z9Var.f105328b;
        if (!(f03Var2 != null && f03Var2.f373887d == 2) || i17 <= 0) {
            finderShareFeedRelUI.B7().f434675k.setVisibility(4);
            return;
        }
        android.widget.TextView personalCenterRedCount = finderShareFeedRelUI.B7().f434675k;
        kotlin.jvm.internal.o.f(personalCenterRedCount, "personalCenterRedCount");
        personalCenterRedCount.setVisibility(0);
        personalCenterRedCount.setText(com.tencent.mm.plugin.finder.assist.w2.a(i17));
        androidx.appcompat.app.AppCompatActivity context = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        personalCenterRedCount.setBackgroundResource(java.lang.Float.compare(i65.a.q(context), i65.a.z(context)) > 0 ? i17 < 10 ? com.tencent.mm.R.drawable.b5b : com.tencent.mm.R.drawable.b5e : i17 < 10 ? com.tencent.mm.R.drawable.b5c : com.tencent.mm.R.drawable.b5d);
        android.view.ViewGroup.LayoutParams layoutParams = personalCenterRedCount.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        if (i17 < 10) {
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd((int) finderShareFeedRelUI.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
            layoutParams2.gravity = 8388613;
        } else {
            layoutParams2.gravity = 8388611;
            layoutParams2.setMarginStart((int) finderShareFeedRelUI.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
            layoutParams2.setMarginEnd(0);
        }
        personalCenterRedCount.setLayoutParams(layoutParams2);
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.v7(finderShareFeedRelUI, 1);
    }
}
