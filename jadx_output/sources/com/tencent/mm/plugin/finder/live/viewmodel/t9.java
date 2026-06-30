package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class t9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.of1 f117428e;

    public t9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var, r45.of1 of1Var) {
        this.f117427d = v9Var;
        this.f117428e = of1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117427d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            rl5.r rVar = v9Var.f117490i;
            if (rVar != null) {
                rVar.a();
            }
            v9Var.getClass();
            v9Var.f117491m = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) v9Var.getContext(), 1, false);
            android.view.View inflate = android.view.View.inflate(v9Var.getContext(), com.tencent.mm.R.layout.bqn, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.i77);
            textView.setText(v9Var.getContext().getResources().getString(com.tencent.mm.R.string.ehp));
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
            com.tencent.mm.ui.widget.dialog.k0 k0Var = v9Var.f117491m;
            if (k0Var != null) {
                k0Var.s(inflate, false);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = v9Var.f117491m;
            if (k0Var2 != null) {
                k0Var2.f211872n = new com.tencent.mm.plugin.finder.live.viewmodel.n9(v9Var);
            }
            if (k0Var2 != null) {
                k0Var2.f211881s = new com.tencent.mm.plugin.finder.live.viewmodel.r9(v9Var);
            }
            if (k0Var2 != null) {
                k0Var2.v();
                return;
            }
            return;
        }
        rl5.r rVar2 = v9Var.f117490i;
        if (rVar2 != null) {
            rVar2.a();
        }
        int e17 = c01.id.e();
        com.tencent.mars.xlog.Log.i(v9Var.f117485d, "showPopupMenu modifyTime:" + v9Var.f117498t + ",serverTime:" + e17);
        java.lang.String string = v9Var.getContext().getResources().getString(com.tencent.mm.R.string.ehr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        long j17 = v9Var.f117498t;
        if (j17 == Long.MIN_VALUE) {
            db5.t7.makeText(v9Var.getContext(), string, 0).show();
            return;
        }
        if (j17 - c01.id.e() <= 0) {
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            androidx.appcompat.app.AppCompatActivity activity = v9Var.getActivity();
            android.content.Intent intent = new android.content.Intent();
            r45.of1 of1Var = this.f117428e;
            intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", of1Var.getString(0));
            intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", of1Var.getString(1));
            intent.putExtra("KEY_SOURCE", v9Var.getIntent().getIntExtra("KEY_SOURCE", 0));
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Gj(activity, intent, 1);
            return;
        }
        v9Var.getClass();
        android.text.format.Time time = new android.text.format.Time();
        time.set(v9Var.f117498t * 1000);
        java.lang.String string2 = v9Var.getContext().getResources().getString(com.tencent.mm.R.string.ehq, k35.s.a(v9Var.getContext().getString(com.tencent.mm.R.string.fcl), time));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(v9Var.getContext());
        if (string.length() == 0) {
            u1Var.g(string2);
        } else {
            u1Var.u(string);
            u1Var.g(string2);
        }
        java.lang.String string3 = v9Var.getContext().getResources().getString(com.tencent.mm.R.string.d3z);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        u1Var.n(string3);
        u1Var.l(new com.tencent.mm.plugin.finder.live.viewmodel.m9(v9Var));
        u1Var.q(false);
    }
}
