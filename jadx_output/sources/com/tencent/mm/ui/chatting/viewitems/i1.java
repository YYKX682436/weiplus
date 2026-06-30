package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class i1 extends com.tencent.mm.ui.chatting.viewitems.a0 {
    public static final java.lang.String D = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/wacomplain?action=show&appid=%s&msgid=%s&from=%d#wechat_redirect";
    public boolean A;
    public final int[] B = new int[2];
    public com.tencent.mm.ui.widget.dialog.u3 C;

    /* renamed from: s, reason: collision with root package name */
    public final int f204149s;

    /* renamed from: t, reason: collision with root package name */
    public yb5.d f204150t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f204151u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f204152v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f204153w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnTouchListener f204154x;

    /* renamed from: y, reason: collision with root package name */
    public final o11.g f204155y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.i5 f204156z;

    public i1() {
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342091o = com.tencent.mm.R.drawable.bgo;
        this.f204155y = fVar.a();
        this.f204149s = gm0.j1.b().h();
        this.f204156z = (com.tencent.mm.plugin.appbrand.service.i5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i5.class);
        this.f204152v = new com.tencent.mm.ui.chatting.viewitems.h1(this, null);
        this.f204153w = new com.tencent.mm.ui.chatting.viewitems.w0(this);
        this.f204154x = new com.tencent.mm.ui.chatting.viewitems.x0(this);
    }

    public static int d0(com.tencent.mm.ui.chatting.viewitems.i1 i1Var, int i17) {
        return java.lang.Math.max(0, ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) i1Var.f204150t.f460708c.a(sb5.z.class))).getCount() - i17);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488449tm, (android.view.ViewGroup) null);
        com.tencent.mm.ui.chatting.viewitems.bs bsVar = new com.tencent.mm.ui.chatting.viewitems.bs();
        bsVar.a(inflate);
        inflate.setTag(bsVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 100) {
            return false;
        }
        tt0.a a17 = tt0.a.a(f9Var.j());
        pt0.f0.P7(f9Var.Q0(), f9Var.getMsgId());
        java.lang.String str = a17.f421779e;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = a17.f421783i;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = a17.f421777c;
        e0(9, str2, str5 == null ? "" : str5, str4, null, 0);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            return false;
        }
        g4Var.c(erVar.d(), 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    public final void e0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        com.tencent.mm.plugin.appbrand.service.i5 i5Var = this.f204156z;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19724, 1, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18), 0, null, 0, 0, 0, str, str3, str4, str2, 0, null, null, 0, null, null, i5Var != null ? ((com.tencent.mm.plugin.appbrand.app.d0) i5Var).f75047d : null);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204150t = dVar;
        com.tencent.mm.ui.chatting.viewitems.bs bsVar = (com.tencent.mm.ui.chatting.viewitems.bs) g0Var;
        tt0.a a17 = tt0.a.a(f9Var.j());
        if (dVar2.f394254d.f445300b.A0() == 2) {
            bsVar.f203512b.setVisibility(0);
            bsVar.timeTV.setVisibility(8);
        } else {
            bsVar.f203512b.setVisibility(8);
        }
        com.tencent.mm.storage.f9 item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f204150t.f460708c.a(sb5.z.class))).getItem(0);
        if (item != null && item.A0() == 2) {
            ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f204150t.f460708c.a(sb5.z.class))).I0(1);
        }
        com.tencent.mm.storage.f9 f9Var2 = dVar2.f394254d.f445300b;
        int A0 = f9Var2.A0();
        android.view.View.OnClickListener onClickListener = this.f204153w;
        if (A0 == 2) {
            bsVar.f203513c.setVisibility(8);
        } else {
            bsVar.f203513c.setVisibility(0);
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(a17.f421778d);
            if (Bi == null || com.tencent.mm.sdk.platformtools.t8.K0(Bi.field_brandIconURL) || com.tencent.mm.sdk.platformtools.t8.K0(Bi.field_nickname)) {
                java.lang.String str4 = a17.f421782h;
                str2 = str4 == null ? "" : str4;
                str3 = a17.f421776b;
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str2 = Bi.field_brandIconURL;
                str3 = Bi.field_nickname;
            }
            java.lang.String str5 = a17.f421778d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str5 == null) {
                str5 = "";
            }
            bsVar.f203514d.setTag(null);
            android.widget.TextView textView = bsVar.f203515e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = this.f204150t.g();
            float textSize = bsVar.f203515e.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g17, str3, textSize));
            bsVar.f203515e.setTag(a17);
            n11.a.b().h(str2, bsVar.f203514d, this.f204155y);
            bsVar.f203514d.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, (java.lang.String) null));
            bsVar.f203514d.setTag(com.tencent.mm.R.id.bhl, bsVar);
            bsVar.f203514d.setOnClickListener(onClickListener);
            bsVar.f203514d.setOnLongClickListener(null);
            android.widget.ImageView imageView = bsVar.f203514d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            sb6.append(c01.a2.e(str5));
            sb6.append(this.f204150t.g().getString(com.tencent.mm.R.string.a6x));
            imageView.setContentDescription(sb6.toString());
            com.tencent.mm.plugin.appbrand.service.i5 i5Var = (com.tencent.mm.plugin.appbrand.service.i5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i5.class);
            java.lang.String str6 = a17.f421779e + "#NotifyMessageStatus";
            ((com.tencent.mm.plugin.appbrand.app.d0) i5Var).getClass();
            if (java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(str6, "true")).booleanValue()) {
                bsVar.f203516f.setVisibility(8);
                this.A = false;
            } else {
                bsVar.f203516f.setVisibility(0);
                this.A = true;
            }
            bsVar.f203517g.setTag(f9Var2);
            bsVar.f203517g.setTag(com.tencent.mm.R.id.bhl, bsVar);
            bsVar.f203517g.setOnClickListener(this.f204152v);
        }
        if (dVar2.f394254d.f445300b.A0() != 2) {
            android.widget.TextView textView2 = bsVar.f203518h;
            java.lang.String str7 = a17.f421775a;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            textView2.setText(str7 != null ? str7 : "");
            bsVar.f203513c.setOnClickListener(onClickListener);
            bsVar.f203513c.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, (java.lang.String) null));
            bsVar.f203513c.setLongClickable(true);
            bsVar.f203513c.setTag(com.tencent.mm.R.id.ohu, this.B);
            bsVar.f203513c.setTag(com.tencent.mm.R.id.bhl, bsVar);
            bsVar.f203513c.setOnLongClickListener(u(this.f204150t));
            bsVar.f203513c.setOnTouchListener(this.f204154x);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void n(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (str == null || g0Var.userTV == null) {
            return;
        }
        java.lang.CharSequence s07 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) dVar.f460708c.a(sb5.n.class))).s0(str);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = dVar.g();
        float textSize = g0Var.userTV.getTextSize();
        ((ke0.e) xVar).getClass();
        X(g0Var, com.tencent.mm.pluginsdk.ui.span.c0.j(g17, s07, textSize));
    }
}
