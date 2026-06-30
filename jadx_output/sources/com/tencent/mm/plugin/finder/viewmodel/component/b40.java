package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b40 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f133835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f133836e;

    public b40(android.widget.TextView textView, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f133835d = textView;
        this.f133836e = f50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.f03 f03Var;
        r45.f03 f03Var2;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[wxMessageEntrance new] red=");
        sb6.append(z9Var != null && z9Var.f105327a);
        sb6.append(" ctrlType=");
        sb6.append((z9Var == null || (jbVar = z9Var.f105329c) == null) ? null : java.lang.Integer.valueOf(jbVar.getType()));
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb6.toString());
        java.lang.String str = (z9Var == null || (f03Var2 = z9Var.f105328b) == null) ? null : f03Var2.f373906z;
        if ((str == null || str.length() == 0) == false) {
            if (!kotlin.jvm.internal.o.b((z9Var == null || (f03Var = z9Var.f105328b) == null) ? null : f03Var.f373906z, g92.b.f269769e.T0())) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("return show this reddot ");
                sb7.append(z9Var != null ? z9Var.f105329c : null);
                com.tencent.mars.xlog.Log.w("Finder.SelfUIC", sb7.toString());
                return;
            }
        }
        boolean z17 = z9Var != null && z9Var.f105327a;
        android.widget.TextView textView = this.f133835d;
        if (!z17) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        r45.f03 f03Var3 = z9Var.f105328b;
        int i17 = f03Var3 != null ? f03Var3.f373888e : 0;
        int i18 = f03Var3 != null ? f03Var3.f373887d : 0;
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "wxMessageEntrance new count:" + i17 + ",show_type:" + i18);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f133836e;
        if (i18 == 2) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(com.tencent.mm.plugin.finder.assist.w2.a(i17));
            }
            textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(f50Var.getContext(), i17));
            textView.setTextSize(0, i65.a.f(f50Var.getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(f50Var.getContext()));
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageEntry");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("WxMessageEntry");
        if (I0 == null || L0 == null || kotlin.jvm.internal.o.b(L0.field_tipsId, f50Var.R)) {
            return;
        }
        java.lang.String field_tipsId = L0.field_tipsId;
        kotlin.jvm.internal.o.f(field_tipsId, "field_tipsId");
        f50Var.R = field_tipsId;
        com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
        androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
    }
}
