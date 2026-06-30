package zu2;

/* loaded from: classes8.dex */
public final class a0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f475692d;

    /* renamed from: e, reason: collision with root package name */
    public r45.i33 f475693e;

    /* renamed from: f, reason: collision with root package name */
    public zu2.q f475694f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f475695g;

    /* renamed from: h, reason: collision with root package name */
    public jx2.j f475696h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f475697i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f475698m;

    /* renamed from: n, reason: collision with root package name */
    public int f475699n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f475700o;

    /* renamed from: p, reason: collision with root package name */
    public int f475701p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f475702q;

    /* renamed from: r, reason: collision with root package name */
    public mn2.j4 f475703r;

    /* renamed from: s, reason: collision with root package name */
    public int f475704s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.qm f475705t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f475692d = "Finder.WxaAdUIC";
        this.f475699n = 15;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        cw2.f8 f8Var;
        com.tencent.mm.plugin.finder.viewmodel.component.nb0 nb0Var;
        if (!(this.f475693e != null) || this.f475700o) {
            return super.onBackPressed();
        }
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.f475705t;
        if (qmVar != null && (f8Var = qmVar.f106429o) != null && (nb0Var = f8Var.f223700h) != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var).c7(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        u1Var.g(getResources().getString(com.tencent.mm.R.string.cjs));
        u1Var.n(getResources().getString(com.tencent.mm.R.string.f490358sq));
        u1Var.l(zu2.w.f475752a);
        u1Var.j(getResources().getString(com.tencent.mm.R.string.cmj));
        u1Var.i(new zu2.x(this));
        u1Var.e(new zu2.y(this));
        u1Var.q(false);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        fc2.c n17;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ggn);
        if (this.f475693e != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.f483315aa4);
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_close);
            }
            if (weImageView != null) {
                weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f479261ud));
            }
            weImageView.getLayoutParams().width = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            weImageView.getLayoutParams().height = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ggl);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(getContext());
            android.view.View decorView = getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            b17.inflate(com.tencent.mm.R.layout.adx, (android.view.ViewGroup) decorView, true);
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f482629jr);
            this.f475695g = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.f482631js);
            findViewById3.setPadding(0, com.tencent.mm.ui.bl.h(getActivity()), 0, 0);
            com.tencent.mm.ui.a4.g(findViewById3, true);
            pm0.v.X(new zu2.v(this));
            r45.i33 i33Var = this.f475693e;
            if (i33Var != null) {
                zu2.q qVar = new zu2.q(getContext(), i33Var);
                this.f475694f = qVar;
                r45.i33 i33Var2 = qVar.f475731a;
                qVar.f475735e = c01.id.c();
                try {
                    java.lang.String string = i33Var2.getString(5);
                    if (string == null) {
                        string = "";
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
                    if (optJSONObject == null) {
                        optJSONObject = new org.json.JSONObject();
                    }
                    jSONObject.put("report_type", 1);
                    jSONObject.put("report_link", i33Var2.getString(3));
                    jSONObject.put("viewable", false);
                    jSONObject.put("exposure_type", 0);
                    optJSONObject.put("exp_time", qVar.f475735e);
                    optJSONObject.put("clk_time", 0);
                    jSONObject.put("weapp_extra_data", optJSONObject.toString());
                    if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K().r()).booleanValue()) {
                        java.lang.String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                        new db2.m2(1, jSONObject2, null).l();
                    } else {
                        java.lang.String jSONObject3 = jSONObject.toString();
                        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                        gm0.j1.d().g(new db2.w5(1, jSONObject3));
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(qVar.f475732b, th6, "reportExpose", new java.lang.Object[0]);
                }
                boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127684eh).getValue()).r()).booleanValue();
                com.tencent.mars.xlog.Log.i("Finder.AdFeedbackSwitch", "WxaAdUIC, useRefactor=" + booleanValue);
                if (booleanValue) {
                    android.view.View findViewById4 = findViewById3.findViewById(com.tencent.mm.R.id.f482623jl);
                    android.view.View findViewById5 = findViewById3.findViewById(com.tencent.mm.R.id.hvm);
                    this.f475697i = findViewById4;
                    this.f475698m = findViewById5;
                    if (findViewById4 != null) {
                        findViewById4.setOnClickListener(new zu2.t(this, i33Var, qVar, findViewById5, findViewById4));
                    }
                } else {
                    new zu2.o(getContext(), findViewById3, i33Var, qVar);
                }
            }
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
                return;
            }
            n17.a(new zu2.u(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateBefore(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreateBefore(r4)
            r45.i33 r4 = new r45.i33
            r4.<init>()
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "KEY_MINI_APP_AD_FLOW_INFO"
            byte[] r0 = r0.getByteArrayExtra(r1)
            r1 = 0
            if (r0 != 0) goto L17
        L15:
            r4 = r1
            goto L28
        L17:
            r4.parseFrom(r0)     // Catch: java.lang.Exception -> L1b
            goto L28
        L1b:
            r4 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r2 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r2, r0, r4)
            goto L15
        L28:
            r3.f475693e = r4
            if (r4 == 0) goto L3f
            r0 = 10
            int r1 = r4.getInteger(r0)
            if (r1 <= 0) goto L3b
            int r4 = r4.getInteger(r0)
            r3.f475699n = r4
            goto L3f
        L3b:
            r4 = 15
            r3.f475699n = r4
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu2.a0.onCreateBefore(android.os.Bundle):void");
    }
}
