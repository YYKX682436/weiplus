package im2;

/* loaded from: classes3.dex */
public final class q extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.atp;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.cz1 cz1Var;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        mMActivity.setMMTitle(com.tencent.mm.R.string.dxr);
        mMActivity.setBackBtn(new im2.o(mMActivity));
        java.lang.String stringExtra = getActivity().getIntent().getStringExtra("KEY_LIVE_ANCHOR_USERNAME");
        byte[] byteArrayExtra = getActivity().getIntent().getByteArrayExtra("KEY_LOTTERY_HISTORY_INFO");
        jz5.f0 f0Var = null;
        if (byteArrayExtra != null) {
            r45.cz1 cz1Var2 = new r45.cz1();
            try {
                cz1Var2.parseFrom(byteArrayExtra);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderLiveLotteryDetailUIC", "onCreate: lottery info parse errpr", th6);
                cz1Var2 = null;
            }
            cz1Var = cz1Var2;
        } else {
            cz1Var = null;
        }
        long longExtra = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0L);
        if (cz1Var != null) {
            ya2.b2 b17 = ya2.h.f460484a.b(stringExtra);
            java.lang.String string = getActivity().getResources().getString(com.tencent.mm.R.string.dqo);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (b17 != null) {
                string = string + (char) 183 + b17.w0();
            }
            ((android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.irg)).setText(string);
            java.lang.String string2 = cz1Var.getString(4);
            if (string2 == null || string2.length() == 0) {
                android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.irb);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.irb);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.ird)).setText(cz1Var.getString(4));
            android.widget.TextView textView = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.irq);
            if (textView != null) {
                on2.l3.f346966a.f(textView);
            }
            ((android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.irf)).setText(zl2.r4.f473950a.H0((r45.xy1) cz1Var.getCustom(5)));
            ((android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.irc)).setText(getActivity().getResources().getString(com.tencent.mm.R.string.dqi, java.lang.Integer.valueOf(cz1Var.getInteger(6))));
            ((android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.ire)).setText(k35.m1.d("yyyy-MM-dd HH:mm", cz1Var.getInteger(2)));
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            zy2.ra Sj = ((c61.p2) ybVar).Sj((com.tencent.mm.ui.MMActivity) activity2);
            r45.qt2 V6 = Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null;
            com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
            com.tencent.mm.plugin.finder.report.k kVar = com.tencent.mm.plugin.finder.report.p.f125228g;
            kVar.c(xy2.c.e(getContext()), "", stringExtra == null ? "" : stringExtra);
            com.tencent.mm.plugin.finder.report.k.b(kVar, V6, 4L, null, 4, null);
            getActivity().findViewById(com.tencent.mm.R.id.f485725is4).setOnClickListener(new im2.p(this, cz1Var, longExtra, V6, stringExtra));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            getActivity().finish();
        }
    }
}
