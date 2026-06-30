package r35;

/* loaded from: classes11.dex */
public class o implements kv.e0, ns.e, r35.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f369215d;

    /* renamed from: e, reason: collision with root package name */
    public final int f369216e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369217f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369218g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369219h;

    /* renamed from: i, reason: collision with root package name */
    public int f369220i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369221m;

    /* renamed from: n, reason: collision with root package name */
    public int f369222n;

    /* renamed from: o, reason: collision with root package name */
    public final r35.n3 f369223o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f369224p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f369225q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f369226r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f369227s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f369228t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f369229u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f369230v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f369231w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f369232x;

    public o(android.content.Context context, java.lang.String str, int i17, r35.n3 n3Var, o25.a aVar, boolean z17) {
        this(context, str, i17, n3Var);
        d(aVar);
        this.f369232x = z17;
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        com.tencent.mm.storage.z3 z3Var = this.f369227s;
        if (z3Var != null) {
            boolean z17 = z3Var.d1() != null && this.f369227s.d1().equals(str);
            boolean z18 = this.f369227s.t0() != null && this.f369227s.t0().equals(str);
            if (!z17 && !z18) {
                return;
            }
        } else {
            java.lang.String str2 = this.f369228t;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f369225q;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new r35.l(this));
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        android.app.ProgressDialog progressDialog = this.f369224p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (!z17) {
            b(-1);
            return;
        }
        this.f369227s.N2();
        this.f369227s.X1(str);
        if (((int) this.f369227s.E2) == 0) {
            gm0.j1.i();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(this.f369227s);
        } else {
            gm0.j1.i();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(this.f369227s.d1(), this.f369227s);
        }
        if (this.f369230v) {
            android.content.Context context = this.f369215d;
            db5.e1.U(context, context.getResources().getString(com.tencent.mm.R.string.law), 1);
        }
        b(1);
    }

    public final void b(int i17) {
        r35.n3 n3Var = this.f369223o;
        if (n3Var != null) {
            n3Var.a(i17);
        }
    }

    public final void c(com.tencent.mm.storage.z3 z3Var) {
        android.app.ProgressDialog progressDialog = this.f369224p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        android.content.Context context = this.f369215d;
        boolean z17 = this.f369232x;
        if (!z17) {
            android.content.Context context2 = this.f369215d;
            this.f369224p = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.lat), true, true, null);
        }
        r35.a aVar = new r35.a(context, this);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(this.f369216e));
        r45.hy6 hy6Var = new r45.hy6();
        hy6Var.f376558e = this.f369217f;
        hy6Var.f376561h = this.f369218g;
        hy6Var.f376560g = this.f369219h;
        hy6Var.f376557d = this.f369220i;
        aVar.F = hy6Var;
        aVar.C = 0;
        aVar.D = this.f369221m;
        aVar.f369022w = !z17;
        aVar.b(z3Var.d1(), linkedList, false, this.f369231w);
    }

    public final void d(o25.a aVar) {
        if (aVar != null) {
            this.f369229u = aVar.f342469g;
            this.f369231w = aVar.f342463a;
            this.f369222n = aVar.f342464b;
            this.f369217f = aVar.f342465c;
            this.f369218g = aVar.f342466d;
            this.f369219h = aVar.f342467e;
            this.f369220i = aVar.f342468f;
            this.f369221m = "";
            this.f369230v = aVar.f342470h;
        }
    }

    public final void e(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContactDialog", "searchContact %s", str);
        if (this.f369226r == null) {
            this.f369226r = new r35.m(this);
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.a(106, this.f369226r);
        tg3.r1 r1Var = new tg3.r1(str, this.f369222n);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(r1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.o.f():void");
    }

    public final void g(com.tencent.mm.storage.z3 z3Var) {
        android.widget.EditText editText;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddContactDialog", "showContact fail, contact is null");
            b(-1);
            return;
        }
        android.content.Context context = this.f369215d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.lar);
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String d17 = z3Var.d1();
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(d17);
        if (a17 == null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().d(this);
        }
        if (a17 != null && z3Var.k2()) {
            a17 = com.tencent.mm.sdk.platformtools.x.s0(a17, false, a17.getWidth() / 2);
        }
        java.lang.String P0 = z3Var.P0();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = null;
        this.f369225q = null;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            if (!this.f369229u) {
                c(z3Var);
                return;
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(z3Var.d1());
            java.lang.String d18 = (n07 == null || com.tencent.mm.sdk.platformtools.t8.K0(n07.d())) ? null : n07.d();
            com.tencent.mm.ui.ga controller = ((com.tencent.mm.ui.MMActivity) context).getController();
            r35.k kVar = new r35.k(this, z3Var);
            if ((string == null || string.length() == 0) && (P0 == null || P0.length() == 0)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem6 fail, title message both are empty");
            } else {
                android.view.View inflate = ((android.view.LayoutInflater) controller.x().getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488675a05, (android.view.ViewGroup) null);
                com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(controller.x());
                com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
                aVar.A = false;
                aVar.B = false;
                if (inflate != null && (editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.c_l)) != null) {
                    editText.setVisibility(8);
                }
                r35.j1.e(controller, i0Var, kVar, inflate, controller.x().getResources().getString(com.tencent.mm.R.string.bbp));
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c_o);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity x17 = controller.x();
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(x17, string, textSize));
                textView.getPaint().setFakeBoldText(true);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c_k);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity x18 = controller.x();
                float textSize2 = textView2.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(x18, P0, textSize2));
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c_m);
                if (imageView != null) {
                    if (a17 != null && !a17.isRecycled()) {
                        imageView.setImageBitmap(a17);
                        aVar.H = new r35.w0(a17);
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(d18)) {
                        imageView.setImageResource(com.tencent.mm.R.drawable.bgo);
                    } else {
                        n11.a b17 = n11.a.b();
                        o11.f fVar = new o11.f();
                        fVar.f342091o = com.tencent.mm.R.drawable.bgo;
                        fVar.f342079c = true;
                        fVar.f342096t = true;
                        b17.h(d18, imageView, fVar.a());
                    }
                }
                aVar.L = inflate;
                j0Var = i0Var.a();
                j0Var.show();
            }
            this.f369225q = j0Var;
        }
        if (this.f369225q == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddContactDialog", "showContact fail, cannot show dialog");
            b(-1);
        }
    }

    public o(android.content.Context context, java.lang.String str, int i17, r35.n3 n3Var) {
        this.f369221m = "";
        this.f369222n = 0;
        this.f369226r = null;
        this.f369229u = true;
        this.f369230v = true;
        this.f369215d = context;
        this.f369228t = str;
        this.f369216e = i17;
        this.f369223o = n3Var;
    }
}
