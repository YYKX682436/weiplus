package com.tencent.mm.plugin.teenmode.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI;", "Lcom/tencent/mm/ui/MMActivity;", "Luh4/i0;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BindGuardianMsgUI extends com.tencent.mm.ui.MMActivity implements uh4.i0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f172816q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f172817d = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.t0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f172818e = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.v0(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f172819f = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.m0(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f172820g = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.i0(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f172821h = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.n0(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f172822i = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.l0(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f172823m = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.j0(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f172824n = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.k0(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f172825o = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.u0(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f172826p = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.s0(this));

    public final android.widget.Button T6() {
        return (android.widget.Button) ((jz5.n) this.f172820g).getValue();
    }

    public final java.lang.String U6() {
        return (java.lang.String) ((jz5.n) this.f172824n).getValue();
    }

    public final android.widget.TextView V6() {
        return (android.widget.TextView) ((jz5.n) this.f172819f).getValue();
    }

    public final android.widget.Button W6() {
        return (android.widget.Button) ((jz5.n) this.f172821h).getValue();
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView X6() {
        return (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f172817d).getValue();
    }

    public final android.widget.TextView Y6() {
        return (android.widget.TextView) ((jz5.n) this.f172818e).getValue();
    }

    public final void Z6() {
        com.tencent.mm.plugin.teenmode.ui.g0 g0Var;
        jz5.g gVar = this.f172825o;
        java.lang.String str = (java.lang.String) ((jz5.n) gVar).getValue();
        jz5.g gVar2 = this.f172823m;
        if (str == null) {
            ot5.g.a("MicroMsg.BindGuardianMsgUI", "ticket is null");
            g0Var = com.tencent.mm.plugin.teenmode.ui.g0.f173003i;
        } else {
            wh4.j jVar = wh4.j.f446012a;
            wh4.d dVar = (wh4.d) ((jz5.n) wh4.j.f446015d).getValue();
            java.lang.String str2 = (java.lang.String) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.d(str2);
            dVar.getClass();
            uh4.h0 h0Var = new uh4.h0();
            h0Var.field_ticket = str2;
            dVar.get(h0Var, "ticket");
            boolean equals = c01.z1.r().equals(U6());
            jz5.g gVar3 = this.f172826p;
            if (equals) {
                if (h0Var.field_time > 0) {
                    java.lang.String str3 = (java.lang.String) ((jz5.n) gVar2).getValue();
                    com.tencent.mm.storage.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
                    g0Var = r26.i0.q(str3, df6 != null ? df6.d1() : null, false, 2, null) ? com.tencent.mm.plugin.teenmode.ui.g0.f172999e : com.tencent.mm.plugin.teenmode.ui.g0.f173004m;
                } else {
                    long longValue = ((java.lang.Number) ((jz5.n) gVar3).getValue()).longValue();
                    long j17 = com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
                    g0Var = ((longValue / j17) > (c01.id.c() / j17) ? 1 : ((longValue / j17) == (c01.id.c() / j17) ? 0 : -1)) == 0 ? com.tencent.mm.plugin.teenmode.ui.g0.f172998d : com.tencent.mm.plugin.teenmode.ui.g0.f173003i;
                }
            } else if (h0Var.field_time > 0) {
                g0Var = ((uh4.c0) i95.n0.c(uh4.c0.class)).Se(U6()) ? com.tencent.mm.plugin.teenmode.ui.g0.f173002h : com.tencent.mm.plugin.teenmode.ui.g0.f173005n;
            } else {
                long longValue2 = ((java.lang.Number) ((jz5.n) gVar3).getValue()).longValue();
                long j18 = com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
                g0Var = ((longValue2 / j18) > (c01.id.c() / j18) ? 1 : ((longValue2 / j18) == (c01.id.c() / j18) ? 0 : -1)) == 0 ? getIntent().getBooleanExtra("intent_extra_adult_user", true) ? com.tencent.mm.plugin.teenmode.ui.g0.f173000f : com.tencent.mm.plugin.teenmode.ui.g0.f173001g : com.tencent.mm.plugin.teenmode.ui.g0.f173003i;
            }
        }
        switch (g0Var.ordinal()) {
            case 0:
                X6().s(com.tencent.mm.R.raw.icons_filled_time, com.tencent.mm.R.color.f478496g);
                Y6().setText(com.tencent.mm.R.string.jri);
                android.widget.TextView V6 = V6();
                if (getIntent().getIntExtra("intent_extra_msg_type", 0) == 102) {
                    V6.setVisibility(0);
                    com.tencent.mm.storage.z3 df7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) ((jz5.n) gVar2).getValue(), true);
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    java.lang.String g27 = n17 != null ? n17.g2() : null;
                    if (g27 == null) {
                        g27 = "";
                    }
                    objArr[0] = g27;
                    java.lang.String g28 = df7 != null ? df7.g2() : null;
                    objArr[1] = g28 != null ? g28 : "";
                    V6.setText(getString(com.tencent.mm.R.string.jrh, objArr));
                } else {
                    V6.setVisibility(8);
                }
                T6().setVisibility(8);
                W6().setVisibility(0);
                break;
            case 1:
                X6().s(com.tencent.mm.R.raw.icons_filled_done2, com.tencent.mm.R.color.aaq);
                Y6().setText(com.tencent.mm.R.string.jr_);
                V6().setVisibility(8);
                T6().setVisibility(8);
                W6().setVisibility(0);
                break;
            case 2:
                X6().s(com.tencent.mm.R.raw.icons_outlined_umbrella, com.tencent.mm.R.color.aaq);
                Y6().setText(com.tencent.mm.R.string.jra);
                android.widget.TextView V62 = V6();
                V62.setVisibility(0);
                V62.setText(getString(com.tencent.mm.R.string.f493327jr5, c01.e2.l(U6()).g2()));
                T6().setVisibility(0);
                W6().setVisibility(8);
                break;
            case 3:
                X6().s(com.tencent.mm.R.raw.icons_filled_error, com.tencent.mm.R.color.f478554ao);
                Y6().setText(com.tencent.mm.R.string.okx);
                V6().setVisibility(8);
                T6().setVisibility(8);
                W6().setVisibility(0);
                break;
            case 4:
                X6().s(com.tencent.mm.R.raw.icons_filled_done2, com.tencent.mm.R.color.aaq);
                Y6().setText(com.tencent.mm.R.string.jr8);
                V6().setVisibility(8);
                T6().setVisibility(8);
                W6().setVisibility(0);
                break;
            case 5:
                X6().s(com.tencent.mm.R.raw.icons_filled_error, com.tencent.mm.R.color.f478554ao);
                Y6().setText(com.tencent.mm.R.string.jr7);
                android.widget.TextView V63 = V6();
                V63.setVisibility(0);
                V63.setText(com.tencent.mm.R.string.jr7);
                T6().setVisibility(8);
                W6().setVisibility(0);
                break;
            case 6:
                X6().s(com.tencent.mm.R.raw.icons_filled_error, com.tencent.mm.R.color.f478554ao);
                Y6().setText(com.tencent.mm.R.string.jrg);
                V6().setVisibility(8);
                T6().setVisibility(8);
                W6().setVisibility(0);
                break;
            case 7:
                X6().s(com.tencent.mm.R.raw.icons_filled_error, com.tencent.mm.R.color.f478554ao);
                Y6().setText(com.tencent.mm.R.string.jrf);
                V6().setVisibility(8);
                T6().setVisibility(8);
                W6().setVisibility(0);
                break;
        }
        if (xh4.x.f454644b) {
            W6().setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (xh4.x.f454644b) {
            return;
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cy_;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        initView();
        setBackBtnVisible(false);
        T6().setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.o0(this));
        W6().setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.p0(this));
        jz5.g gVar = this.f172822i;
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(c01.e2.a0() ? 0 : 8);
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.q0(this));
        Z6();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(this);
    }

    @Override // uh4.i0
    public void onDataChanged() {
        pm0.v.X(new com.tencent.mm.plugin.teenmode.ui.r0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this);
        super.onDestroy();
    }
}
