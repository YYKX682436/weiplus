package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class IPCallShareCouponCardUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, jk5.b, jk5.a {
    public static final /* synthetic */ int F = 0;
    public android.view.View E;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f142670d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142671e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f142672f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f142673g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142674h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f142675i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f142676m;

    /* renamed from: n, reason: collision with root package name */
    public final jk5.j f142677n = new jk5.j();

    /* renamed from: o, reason: collision with root package name */
    public android.app.ProgressDialog f142678o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f142679p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f142680q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f142681r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ProgressBar f142682s = null;

    /* renamed from: t, reason: collision with root package name */
    public final q83.d f142683t = new q83.d();

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f142684u = null;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f142685v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f142686w = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f142687x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f142688y = null;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f142689z = null;
    public java.lang.String A = null;
    public r45.u57 B = null;
    public java.lang.String C = null;
    public int D = 0;

    @Override // jk5.b
    public void I4(jk5.c cVar) {
        android.app.ProgressDialog progressDialog = this.f142679p;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            db5.e1.n(getContext(), com.tencent.mm.R.string.f493411k25, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.ipcall.ui.n4(this), new com.tencent.mm.plugin.ipcall.ui.o4(this));
        } else {
            if (ordinal != 1) {
                return;
            }
            db5.e1.n(getContext(), com.tencent.mm.R.string.f493410k24, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.ipcall.ui.n4(this), new com.tencent.mm.plugin.ipcall.ui.o4(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap T6() {
        /*
            r8 = this;
            java.lang.String r0 = c01.z1.r()
            java.lang.String r1 = g83.a.a()
            java.lang.String r2 = g83.a.b()
            java.lang.String r3 = "qr_"
            byte[] r0 = r0.getBytes()
            java.lang.String r4 = kk.k.g(r0)
            java.lang.String r5 = ".png"
            r6 = 1
            r7 = 1
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.h1.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r2 = 0
            java.lang.String r3 = "MicroMsg.IPCallShareCouponCardUI"
            if (r1 == 0) goto L2d
            java.lang.String r0 = "filename is null"
            com.tencent.mars.xlog.Log.e(r3, r0)
            goto L55
        L2d:
            r1 = 0
            java.io.RandomAccessFile r0 = com.tencent.mm.vfs.w6.B(r0, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            long r4 = r0.length()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r0.read(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r0.close()     // Catch: java.lang.Exception -> L56
            goto L56
        L40:
            r1 = move-exception
            r2 = r0
            goto L5e
        L43:
            r4 = move-exception
            goto L49
        L45:
            r0 = move-exception
            goto L5f
        L47:
            r4 = move-exception
            r0 = r2
        L49:
            java.lang.String r5 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L40
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.lang.Exception -> L55
        L55:
            r4 = r2
        L56:
            if (r4 != 0) goto L59
            return r2
        L59:
            android.graphics.Bitmap r0 = com.tencent.mm.sdk.platformtools.x.G(r4)
            return r0
        L5e:
            r0 = r1
        L5f:
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.lang.Exception -> L64
        L64:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.T6():android.graphics.Bitmap");
    }

    public final void U6(int i17, java.lang.String str, java.lang.String str2) {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488673a02, null);
        this.E = inflate;
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.c_l);
        this.f142681r = (android.widget.ImageView) this.E.findViewById(com.tencent.mm.R.id.c_i);
        this.f142682s = (android.widget.ProgressBar) this.E.findViewById(com.tencent.mm.R.id.imb);
        editText.setText(str);
        android.graphics.Bitmap T6 = T6();
        if (T6 == null) {
            c01.d9.e().g(new g21.a(c01.z1.r(), com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(66561, null)), 0));
            this.f142682s.setVisibility(0);
        } else {
            android.widget.ImageView imageView = this.f142681r;
            if (imageView != null) {
                imageView.setImageBitmap(T6);
            }
        }
        r35.j1.i(this.mController, str2, this.E, getResources().getString(com.tencent.mm.R.string.f490551ya), new com.tencent.mm.plugin.ipcall.ui.d4(this, editText, str, i17));
    }

    @Override // jk5.a
    public void V2(jk5.c cVar) {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blp;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        r35.j1.j(getController(), this.f142687x, this.f142686w, this.f142685v, null, true, getResources().getString(com.tencent.mm.R.string.f490551ya), new com.tencent.mm.plugin.ipcall.ui.g4(this, stringExtra));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.g6b);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.h4(this));
        this.f142670d = findViewById(com.tencent.mm.R.id.hur);
        this.f142671e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ckd);
        this.f142672f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cqh);
        this.f142673g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483957ck3);
        this.f142674h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cke);
        this.f142675i = (android.widget.Button) findViewById(com.tencent.mm.R.id.msh);
        this.f142676m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gyk);
        android.view.View view = this.f142670d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "initview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "initview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f142676m, c01.z1.r(), 0.5f);
        this.f142680q = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.g3z), true, true, new com.tencent.mm.plugin.ipcall.ui.i4(this));
        if (r83.b.f393311b == null) {
            r83.b.f393311b = new r83.b();
        }
        r83.b.f393311b.a(false);
        this.D = getIntent().getIntExtra("IPCallShareCouponCardUI_KFrom", 0);
        c01.d9.e().a(257, this);
        c01.d9.e().a(1804, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(257, this);
        c01.d9.e().q(1804, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof p83.g)) {
            if (!(m1Var instanceof w11.o0)) {
                if ((m1Var instanceof g21.a) && i17 == 0 && i18 == 0 && this.f142681r != null) {
                    android.widget.ProgressBar progressBar = this.f142682s;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    this.f142681r.setImageBitmap(T6());
                    return;
                }
                return;
            }
            android.app.ProgressDialog progressDialog = this.f142678o;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f142678o = null;
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            androidx.appcompat.app.AppCompatActivity context = getContext();
            ((com.tencent.mm.app.o7) wi6).getClass();
            if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 7)) {
                return;
            }
            if (i17 == 0 && i18 == 0) {
                db5.e1.T(this, getResources().getString(com.tencent.mm.R.string.f490940bb2));
                return;
            } else {
                db5.e1.i(getContext(), com.tencent.mm.R.string.iil, com.tencent.mm.R.string.f490573yv);
                return;
            }
        }
        if (i17 != 0 || i18 != 0) {
            android.app.ProgressDialog progressDialog2 = this.f142680q;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            this.f142680q.dismiss();
            db5.e1.t(getContext(), getString(com.tencent.mm.R.string.g3x), getString(com.tencent.mm.R.string.g3s), new com.tencent.mm.plugin.ipcall.ui.j4(this));
            return;
        }
        android.view.View view = this.f142670d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.zr3 e17 = t83.f.e();
        if (e17 != null) {
            this.f142684u = e17.f392317d;
            this.f142685v = e17.f392320g;
            this.f142686w = e17.f392321h;
            this.f142687x = e17.f392319f;
            this.f142688y = e17.f392322i;
            this.f142689z = e17.f392325o;
            this.A = e17.f392327q;
            this.B = e17.f392326p;
            this.C = e17.f392328r;
        }
        this.f142671e.setText(this.A);
        this.f142672f.setText(java.lang.String.format(getContext().getString(com.tencent.mm.R.string.f492356g65), this.f142684u));
        this.f142675i.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.k4(this));
        this.f142673g.setText(java.lang.String.format(getString(com.tencent.mm.R.string.g67), this.A));
        android.widget.TextView textView = this.f142674h;
        java.lang.String format = java.lang.String.format(getString(com.tencent.mm.R.string.g66), this.A);
        java.lang.String string = getString(com.tencent.mm.R.string.g6a);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            textView.setText(format);
        } else {
            java.lang.String string2 = getString(com.tencent.mm.R.string.g6c);
            android.text.TextPaint paint = textView.getPaint();
            float measureText = paint.measureText(format);
            float measureText2 = paint.measureText(string2);
            float B = i65.a.B(getContext()) - (((android.widget.LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin + ((android.widget.LinearLayout.LayoutParams) textView.getLayoutParams()).rightMargin);
            int ceil = (int) java.lang.Math.ceil(measureText / B);
            int ceil2 = (int) java.lang.Math.ceil((measureText + measureText2) / B);
            if (ceil == 0) {
                ceil = 1;
            }
            if (ceil2 > ceil) {
                string2 = "\n" + string2;
            }
            textView.setGravity(17);
            android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(format + string2);
            newSpannable.setSpan(new com.tencent.mm.plugin.ipcall.ui.f4(this, string), format.length(), format.length() + string2.length(), 33);
            textView.setText(newSpannable);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        android.app.ProgressDialog progressDialog3 = this.f142680q;
        if (progressDialog3 == null || !progressDialog3.isShowing()) {
            return;
        }
        this.f142680q.dismiss();
    }
}
