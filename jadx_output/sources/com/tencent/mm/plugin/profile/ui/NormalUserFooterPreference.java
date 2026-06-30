package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes11.dex */
public class NormalUserFooterPreference extends com.tencent.mm.ui.base.preference.Preference implements l75.q0 {
    public android.widget.Button A1;
    public android.widget.Button B1;
    public android.widget.Button C1;
    public android.widget.Button D1;
    public android.widget.Button E1;
    public android.widget.Button F1;
    public android.widget.Button G1;
    public android.widget.TextView H1;
    public boolean I1;
    public int J1;
    public final com.tencent.mm.ui.MMActivity K1;
    public com.tencent.mm.storage.z3 L;
    public java.lang.String L1;
    public boolean M;
    public final l75.v0 M1;
    public int N;
    public int P;
    public boolean Q;
    public boolean R;
    public long S;
    public java.lang.String T;
    public java.lang.String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.Button f153731l1;

    /* renamed from: p0, reason: collision with root package name */
    public hr3.va f153732p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.Button f153733p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f153734x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f153735x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.Button f153736y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.Button f153737y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f153738z1;

    public NormalUserFooterPreference(android.content.Context context) {
        super(context);
        this.Q = false;
        this.S = 0L;
        this.T = "";
        this.U = "";
        this.V = false;
        this.Y = false;
        this.Z = false;
        this.I1 = false;
        this.J1 = 0;
        this.L1 = null;
        this.M1 = new hr3.v9(this);
        this.K1 = (com.tencent.mm.ui.MMActivity) context;
        this.X = false;
        this.f153732p0 = null;
    }

    public void M() {
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        am.y00 y00Var = voipEvent.f54945g;
        y00Var.f8415b = 5;
        y00Var.f8418e = this.L.d1();
        y00Var.f8417d = this.K1;
        y00Var.f8419f = 4;
        voipEvent.e();
    }

    public void N() {
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        am.y00 y00Var = voipEvent.f54945g;
        y00Var.f8415b = 5;
        y00Var.f8418e = this.L.d1();
        y00Var.f8417d = this.K1;
        y00Var.f8419f = 2;
        voipEvent.e();
    }

    public final void O() {
        if (this.X && this.L != null) {
            hr3.va vaVar = this.f153732p0;
            if (vaVar != null) {
                vaVar.h();
            }
            Q();
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NormalUserFooterPreference", "iniView : bindView = " + this.X + " contact = " + this.L);
        hr3.va vaVar2 = this.f153732p0;
        if (vaVar2 != null) {
            try {
                vaVar2.g();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public boolean Q() {
        if (this.I1 && this.L.r2()) {
            this.G1.setVisibility(0);
            return true;
        }
        this.G1.setVisibility(8);
        return false;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.storage.z3 z3Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() > 0 && (z3Var = this.L) != null) {
            if (str.equals(z3Var.d1()) || str.equals(this.L.J0())) {
                this.L = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.L.d1(), true);
                com.tencent.mm.sdk.platformtools.u3.h(new hr3.w9(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        android.widget.Button button;
        view.toString();
        this.f153734x0 = view.findViewById(com.tencent.mm.R.id.cdh);
        this.f153736y0 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.ce6);
        this.f153731l1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.ccq);
        this.f153737y1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.ce8);
        this.f153735x1 = view.findViewById(com.tencent.mm.R.id.ce9);
        this.f153733p1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.ce7);
        this.C1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cau);
        this.f153738z1 = view.findViewById(com.tencent.mm.R.id.cdn);
        this.A1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cdm);
        this.B1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cdo);
        this.D1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cdp);
        this.G1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cdd);
        this.E1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.ce_);
        this.F1 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.ccm);
        this.H1 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cde);
        this.X = true;
        O();
        super.t(view);
        if (!this.K1.getIntent().getBooleanExtra("Accept_NewFriend_FromOutside", false) || (button = this.f153736y0) == null) {
            return;
        }
        button.performClick();
    }

    public NormalUserFooterPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = false;
        this.S = 0L;
        this.T = "";
        this.U = "";
        this.V = false;
        this.Y = false;
        this.Z = false;
        this.I1 = false;
        this.J1 = 0;
        this.L1 = null;
        this.M1 = new hr3.v9(this);
        this.K1 = (com.tencent.mm.ui.MMActivity) context;
        this.X = false;
        this.f153732p0 = null;
    }

    public NormalUserFooterPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Q = false;
        this.S = 0L;
        this.T = "";
        this.U = "";
        this.V = false;
        this.Y = false;
        this.Z = false;
        this.I1 = false;
        this.J1 = 0;
        this.L1 = null;
        this.M1 = new hr3.v9(this);
        this.K1 = (com.tencent.mm.ui.MMActivity) context;
        this.X = false;
        this.f153732p0 = null;
    }
}
