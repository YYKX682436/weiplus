package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class f2 extends com.tencent.mm.ui.widget.dialog.k2 {
    public com.tencent.mm.ui.widget.edittext.PasterEditText A;
    public android.widget.Button B;
    public android.widget.Button C;
    public android.widget.TextView D;
    public android.view.animation.Animation E;
    public java.util.ArrayList F;
    public final com.tencent.mm.sdk.platformtools.n3 G;
    public final android.view.View.OnClickListener H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f142804J;
    public final int K;
    public final int L;

    /* renamed from: d, reason: collision with root package name */
    public int f142805d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142806e;

    /* renamed from: f, reason: collision with root package name */
    public final long f142807f;

    /* renamed from: g, reason: collision with root package name */
    public final android.app.Activity f142808g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f142809h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f142810i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ScrollView f142811m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f142812n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f142813o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f142814p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f142815q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f142816r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f142817s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f142818t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f142819u;

    /* renamed from: v, reason: collision with root package name */
    public int f142820v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f142821w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.base.FlowLayout f142822x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.Button f142823y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.Button f142824z;

    public f2(android.app.Activity activity, android.content.Context context, int i17, long j17) {
        super(context, com.tencent.mm.R.style.f494791wd);
        s83.f fVar;
        this.f142805d = 0;
        this.G = new com.tencent.mm.sdk.platformtools.n3();
        this.H = new com.tencent.mm.plugin.ipcall.ui.x1(this);
        this.I = com.tencent.mm.R.drawable.f481502uu;
        this.f142804J = com.tencent.mm.R.color.f478971ma;
        this.K = com.tencent.mm.R.drawable.f481499ur;
        this.L = com.tencent.mm.R.color.f479549ab0;
        setCancelable(false);
        this.f142809h = context;
        this.f142806e = i17;
        this.f142807f = j17;
        this.f142808g = activity;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.blz, null);
        this.f142810i = inflate;
        this.f142812n = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f485487hv0);
        this.f142813o = (android.widget.LinearLayout) this.f142810i.findViewById(com.tencent.mm.R.id.f485488hv1);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.anim.f477723k);
        this.E = loadAnimation;
        loadAnimation.setDuration(200L);
        this.E.setStartOffset(100L);
        this.f142821w = (android.widget.FrameLayout) this.f142810i.findViewById(com.tencent.mm.R.id.g9f);
        this.f142822x = (com.tencent.mm.ui.base.FlowLayout) this.f142810i.findViewById(com.tencent.mm.R.id.g9e);
        this.f142823y = (android.widget.Button) this.f142810i.findViewById(com.tencent.mm.R.id.c_8);
        this.f142824z = (android.widget.Button) this.f142810i.findViewById(com.tencent.mm.R.id.c_9);
        this.A = (com.tencent.mm.ui.widget.edittext.PasterEditText) this.f142810i.findViewById(com.tencent.mm.R.id.c_l);
        this.f142823y.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.y1(this));
        this.f142824z.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.z1(this));
        if (com.tencent.mm.plugin.ipcall.model.l.f142478c == null) {
            com.tencent.mm.plugin.ipcall.model.l.f142478c = new com.tencent.mm.plugin.ipcall.model.l();
        }
        com.tencent.mm.plugin.ipcall.model.l lVar = com.tencent.mm.plugin.ipcall.model.l.f142478c;
        if (lVar.f142479a == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource try get cacheResUpdate");
            java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(39, 1);
            if (com.tencent.mm.sdk.platformtools.t8.K0(Bi)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource get cacheResUpdate no filePath");
            } else {
                byte[] N = com.tencent.mm.vfs.w6.N(Bi, 0, -1);
                if (N != null) {
                    lVar.a(N);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource file not exist");
                }
            }
        }
        if (lVar.f142479a != null) {
            java.lang.String p17 = com.tencent.mm.sdk.platformtools.m2.p(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
            if ("language_default".equalsIgnoreCase(p17) && java.util.Locale.getDefault() != null) {
                p17 = java.util.Locale.getDefault().toString();
            }
            java.util.Iterator it = lVar.f142479a.iterator();
            while (it.hasNext()) {
                fVar = (s83.f) it.next();
                if (p17.equalsIgnoreCase(fVar.f404875a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "curLang: %s,resListCount: %s", p17, java.lang.Integer.valueOf(lVar.f142479a.size()));
                    break;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "no lanuage equal curLang, curLang: %s,resListCount: %s", p17, java.lang.Integer.valueOf(lVar.f142479a.size()));
        }
        fVar = null;
        if (fVar != null) {
            java.util.ArrayList arrayList = fVar.f404876b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                s83.e eVar = (s83.e) it6.next();
                com.tencent.mm.plugin.ipcall.ui.e2 e2Var = new com.tencent.mm.plugin.ipcall.ui.e2();
                e2Var.f142790a = eVar.f404873a;
                e2Var.f142791b = eVar.f404874b;
                e2Var.f142792c = false;
                arrayList2.add(e2Var);
            }
            this.F = arrayList2;
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.plugin.ipcall.ui.e2 e2Var2 = (com.tencent.mm.plugin.ipcall.ui.e2) it7.next();
                com.tencent.mm.ui.base.FlowLayout flowLayout = this.f142822x;
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480416xb) * i65.a.q(getContext()));
                textView.setBackgroundResource(this.I);
                textView.setTextColor(context.getResources().getColor(this.f142804J));
                textView.setTag(e2Var2);
                textView.setGravity(17);
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setText(e2Var2.f142791b);
                textView.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.a2(this));
                flowLayout.addView(textView);
            }
        }
        this.f142814p = (android.widget.RelativeLayout) this.f142810i.findViewById(com.tencent.mm.R.id.hv_);
        this.f142815q = (android.widget.RelativeLayout) this.f142810i.findViewById(com.tencent.mm.R.id.hva);
        this.f142816r = (android.widget.RelativeLayout) this.f142810i.findViewById(com.tencent.mm.R.id.hvb);
        android.widget.RelativeLayout relativeLayout = this.f142814p;
        android.view.View.OnClickListener onClickListener = this.H;
        relativeLayout.setOnClickListener(onClickListener);
        this.f142815q.setOnClickListener(onClickListener);
        this.f142816r.setOnClickListener(onClickListener);
        this.f142817s = (android.widget.ImageView) this.f142810i.findViewById(com.tencent.mm.R.id.hae);
        this.f142818t = (android.widget.ImageView) this.f142810i.findViewById(com.tencent.mm.R.id.haf);
        this.f142819u = (android.widget.ImageView) this.f142810i.findViewById(com.tencent.mm.R.id.hag);
        this.f142820v = 0;
        c(0);
        this.B = (android.widget.Button) this.f142810i.findViewById(com.tencent.mm.R.id.hem);
        this.C = (android.widget.Button) this.f142810i.findViewById(com.tencent.mm.R.id.hen);
        this.D = (android.widget.TextView) this.f142810i.findViewById(com.tencent.mm.R.id.hep);
        r45.zr3 e17 = t83.f.e();
        java.lang.String format = e17 != null ? java.lang.String.format(context.getString(com.tencent.mm.R.string.g66), e17.f392327q) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(format)) {
            this.D.setVisibility(4);
        } else {
            this.D.setVisibility(0);
            this.D.setText(format);
        }
        this.B.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.b2(this));
        this.C.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.c2(this));
        this.f142811m = (android.widget.ScrollView) this.f142810i.findViewById(com.tencent.mm.R.id.e0n);
        android.view.View childAt = ((android.view.ViewGroup) this.f142808g.findViewById(android.R.id.content)).getChildAt(0);
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.ipcall.ui.v1(this, childAt));
    }

    public final void c(int i17) {
        this.f142820v = i17;
        if (i17 == 0) {
            this.f142817s.setVisibility(4);
            this.f142818t.setVisibility(4);
            this.f142819u.setVisibility(4);
            this.f142824z.setEnabled(false);
            f(0);
            return;
        }
        if (i17 == 1) {
            this.f142817s.setVisibility(0);
            this.f142818t.setVisibility(4);
            this.f142819u.setVisibility(4);
            this.f142824z.setEnabled(true);
            f(1);
            return;
        }
        if (i17 == 2) {
            this.f142817s.setVisibility(0);
            this.f142818t.setVisibility(0);
            this.f142819u.setVisibility(4);
            this.f142824z.setEnabled(true);
            f(1);
            return;
        }
        if (i17 == 3) {
            this.f142817s.setVisibility(0);
            this.f142818t.setVisibility(0);
            this.f142819u.setVisibility(0);
            this.f142824z.setEnabled(true);
            f(0);
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallFeedbackDialog", "dismiss exception, e = " + e17.getMessage());
        }
    }

    public final java.lang.String e(int i17) {
        if (i17 == 3) {
            return "";
        }
        java.lang.String str = !com.tencent.mm.sdk.platformtools.t8.K0(this.A.getText().toString().trim()) ? "0" : "";
        java.util.ArrayList arrayList = this.F;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.ipcall.ui.e2 e2Var = (com.tencent.mm.plugin.ipcall.ui.e2) it.next();
                if (e2Var.f142792c) {
                    if (str.equals("")) {
                        str = e2Var.f142790a;
                    } else {
                        str = str + "_" + e2Var.f142790a;
                    }
                }
            }
        }
        return str;
    }

    public void f(int i17) {
        if (i17 == 0) {
            this.f142812n.setVisibility(0);
            this.f142813o.setVisibility(4);
            if (this.f142805d == 1) {
                ((android.widget.LinearLayout.LayoutParams) this.f142821w.getLayoutParams()).height = 0;
                this.f142821w.requestLayout();
            }
            com.tencent.mm.sdk.platformtools.t8.t0(this.f142810i);
        } else if (i17 == 1) {
            this.f142812n.setVisibility(0);
            this.f142813o.setVisibility(4);
            if (this.f142805d == 0) {
                ((android.widget.LinearLayout.LayoutParams) this.f142821w.getLayoutParams()).height = -2;
                this.f142821w.requestLayout();
                this.f142821w.startAnimation(this.E);
            }
        } else if (i17 == 2) {
            this.f142812n.setVisibility(4);
            this.f142813o.setVisibility(0);
            com.tencent.mm.sdk.platformtools.t8.t0(this.f142810i);
        }
        this.f142805d = i17;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f142810i);
        getWindow().getAttributes().width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        f(0);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog
    public void show() {
        super.show();
    }
}
