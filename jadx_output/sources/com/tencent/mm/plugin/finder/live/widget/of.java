package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class of extends com.tencent.mm.plugin.finder.live.widget.g implements com.tencent.mm.plugin.finder.live.viewmodel.f4 {

    /* renamed from: z, reason: collision with root package name */
    public static final int f119286z = 30 * 2;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f119287h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f119288i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f119289m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f119290n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f119291o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f119292p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f119293q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f119294r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f119295s;

    /* renamed from: t, reason: collision with root package name */
    public int f119296t;

    /* renamed from: u, reason: collision with root package name */
    public int f119297u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f119298v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f119299w;

    /* renamed from: x, reason: collision with root package name */
    public r45.qo f119300x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f119301y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(android.content.Context context) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f119296t = 1;
        this.f119297u = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String y(com.tencent.mm.plugin.finder.live.widget.of r5) {
        /*
            r5.getClass()
            cl0.g r0 = new cl0.g     // Catch: java.lang.Exception -> L58
            r0.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = r5.f119298v     // Catch: java.lang.Exception -> L58
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L1d
            int r4 = r1.length()     // Catch: java.lang.Exception -> L58
            if (r4 <= 0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = r3
        L17:
            if (r4 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r1 != 0) goto L2a
        L1d:
            r45.qo r1 = r5.f119300x     // Catch: java.lang.Exception -> L58
            if (r1 == 0) goto L28
            r4 = 2
            java.lang.String r1 = r1.getString(r4)     // Catch: java.lang.Exception -> L58
            if (r1 != 0) goto L2a
        L28:
            java.lang.String r1 = ""
        L2a:
            java.lang.String r4 = "placard_desc"
            com.tencent.mm.ui.widget.MMEditText r5 = r5.f119287h     // Catch: java.lang.Exception -> L58
            if (r5 == 0) goto L52
            android.text.Editable r5 = r5.getText()     // Catch: java.lang.Exception -> L58
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L58
            r0.h(r4, r5)     // Catch: java.lang.Exception -> L58
            java.lang.String r5 = "pic_url"
            r0.h(r5, r1)     // Catch: java.lang.Exception -> L58
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.o.f(r5, r0)     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = ","
            java.lang.String r1 = ";"
            java.lang.String r5 = r26.i0.t(r5, r0, r1, r3)     // Catch: java.lang.Exception -> L58
            goto L73
        L52:
            java.lang.String r5 = "editView"
            kotlin.jvm.internal.o.o(r5)     // Catch: java.lang.Exception -> L58
            throw r2     // Catch: java.lang.Exception -> L58
        L58:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[dumpBulletinInfo] e = "
            r0.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "LiveFansClubSlice"
            com.tencent.mars.xlog.Log.i(r0, r5)
            java.lang.String r5 = "{}"
        L73:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.of.y(com.tencent.mm.plugin.finder.live.widget.of):java.lang.String");
    }

    public final void A() {
        a();
        android.content.Context context = this.f118381d;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            com.tencent.mm.plugin.finder.live.viewmodel.g4 g4Var = (com.tencent.mm.plugin.finder.live.viewmodel.g4) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.live.viewmodel.g4.class);
            g4Var.getClass();
            g4Var.f117111d.remove(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r1 == null || r1.length() == 0) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r5 = this;
            android.widget.TextView r0 = r5.f119292p
            r1 = 0
            if (r0 == 0) goto L39
            java.lang.String r2 = r5.f119298v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L14
            int r2 = r2.length()
            if (r2 != 0) goto L12
            goto L14
        L12:
            r2 = r3
            goto L15
        L14:
            r2 = r4
        L15:
            if (r2 == 0) goto L34
            com.tencent.mm.ui.widget.MMEditText r2 = r5.f119287h
            if (r2 == 0) goto L2e
            android.text.Editable r1 = r2.getText()
            if (r1 == 0) goto L2a
            int r1 = r1.length()
            if (r1 != 0) goto L28
            goto L2a
        L28:
            r1 = r3
            goto L2b
        L2a:
            r1 = r4
        L2b:
            if (r1 != 0) goto L35
            goto L34
        L2e:
            java.lang.String r0 = "editView"
            kotlin.jvm.internal.o.o(r0)
            throw r1
        L34:
            r3 = r4
        L35:
            r0.setEnabled(r3)
            return
        L39:
            java.lang.String r0 = "confirmBtn"
            kotlin.jvm.internal.o.o(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.of.B():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dip;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.content.Context context = this.f118381d;
        int a17 = i65.a.a(context, 16.0f);
        root.setPadding(a17, a17, a17, i65.a.a(context, 64.0f));
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.hdd);
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById;
        mMEditText.setFilters(new android.text.InputFilter[]{com.tencent.mm.plugin.finder.live.widget.df.f118102d, new com.tencent.mm.ui.tools.v4(f119286z, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2)});
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.widget.ef(this));
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        this.f119287h = (com.tencent.mm.ui.widget.MMEditText) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.qp6);
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ff(this));
        this.f119288i = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.myb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f119289m = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f483286mf4);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f119290n = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.c9z);
        ((android.widget.TextView) findViewById5).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.gf(this));
        kotlin.jvm.internal.o.f(findViewById5, "apply(...)");
        this.f119292p = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.aa8);
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.hf(this));
        this.f119291o = findViewById6;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.qhz);
        findViewById7.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.Cif(this));
        this.f119293q = findViewById7;
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.p3o);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f119295s = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.qrc);
        findViewById9.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.jf(this));
        this.f119294r = findViewById9;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        yz5.a aVar = this.f119301y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final java.lang.String z(int i17) {
        android.content.Context context = this.f118381d;
        if (i17 == 0) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.ltu);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (i17 != 2) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.ltt);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.ltv);
        kotlin.jvm.internal.o.d(string3);
        return string3;
    }
}
