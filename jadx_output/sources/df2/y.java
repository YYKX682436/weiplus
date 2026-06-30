package df2;

/* loaded from: classes3.dex */
public final class y extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231832m;

    /* renamed from: n, reason: collision with root package name */
    public r45.nb2 f231833n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231832m = "Finder.AnchorRemindController";
    }

    public final void Z6() {
        java.lang.String str;
        java.lang.String str2 = this.f231832m;
        com.tencent.mars.xlog.Log.i(str2, "onLiveCloseClick");
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        y1Var.j(com.tencent.mm.R.layout.aho);
        android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.khs);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.d(textView3);
        com.tencent.mm.ui.fk.a(textView3);
        textView2.setOnClickListener(new df2.v(this, y1Var, textView));
        textView3.setOnClickListener(new df2.w(y1Var, textView));
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = (com.tencent.mm.plugin.finder.live.plugin.kh) R6(com.tencent.mm.plugin.finder.live.plugin.kh.class);
        long j17 = khVar != null ? khVar.P : 0L;
        if (j17 > 0) {
            long j18 = 60;
            long j19 = j17 / j18;
            long j27 = j19 % j18;
            long j28 = j19 / j18;
            java.lang.String valueOf = java.lang.String.valueOf(j27);
            java.lang.String valueOf2 = java.lang.String.valueOf(j28);
            if (j28 <= 0) {
                str = context.getString(com.tencent.mm.R.string.m8o, valueOf);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else if (j27 <= 0) {
                str = context.getString(com.tencent.mm.R.string.m8m, valueOf);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else {
                str = context.getString(com.tencent.mm.R.string.m8m, valueOf2) + context.getString(com.tencent.mm.R.string.m8n, valueOf);
            }
            textView.setText(context.getString(com.tencent.mm.R.string.m8k, str));
        } else {
            textView.setText(context.getString(com.tencent.mm.R.string.m8l));
        }
        r45.nb2 nb2Var = this.f231833n;
        if (nb2Var != null && nb2Var.getBoolean(0)) {
            java.lang.String string = nb2Var.getString(1);
            if (!(string == null || string.length() == 0)) {
                java.lang.String string2 = nb2Var.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                textView.setText(string2);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wording:");
        sb6.append((java.lang.Object) textView.getText());
        sb6.append(", enable:");
        r45.nb2 nb2Var2 = this.f231833n;
        sb6.append(nb2Var2 != null ? java.lang.Boolean.valueOf(nb2Var2.getBoolean(0)) : null);
        sb6.append(",guide_wording:");
        r45.nb2 nb2Var3 = this.f231833n;
        sb6.append(nb2Var3 != null ? nb2Var3.getString(1) : null);
        sb6.append(", duration:");
        com.tencent.mm.plugin.finder.live.plugin.kh khVar2 = (com.tencent.mm.plugin.finder.live.plugin.kh) R6(com.tencent.mm.plugin.finder.live.plugin.kh.class);
        sb6.append(khVar2 != null ? khVar2.P : 0L);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.Q1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("words", textView.getText());
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        df2.o oVar = (df2.o) getStore().controller(df2.o.class);
        boolean z17 = (oVar != null ? oVar.f230904u : null) == r45.f07.VisibilityModeOptionStatus_Enable;
        if (((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) getStore().business(mm2.g1.class)).f329078s).getValue()).f() && z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            k0Var.f211872n = new df2.t(context);
            k0Var.f211881s = new df2.u(this, y1Var);
            k0Var.v();
            android.app.Dialog dialog = k0Var.f211864i;
            kotlin.jvm.internal.o.f(dialog, "getDialog(...)");
            com.tencent.mm.plugin.finder.view.x7.a(dialog, context);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f327344o);
        } else {
            y1Var.s();
        }
        com.tencent.mars.xlog.Log.i(str2, "onLiveCloseClick show bottomSheet");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        com.tencent.mars.xlog.Log.i(this.f231832m, "startPollingCloseLiveGuideInfo");
        dk2.ef.f233392k.e(33, new r45.mb2(), new df2.x(this, r45.nb2.class), true);
    }
}
