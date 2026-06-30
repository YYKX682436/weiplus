package s23;

/* loaded from: classes4.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final s23.o f402343d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ib6 f402344e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f402345f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageButton f402346g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f402347h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f402348i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f402349m;

    /* renamed from: n, reason: collision with root package name */
    public int f402350n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f402351o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f402352p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f402353q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f402354r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f402355s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f402356t;

    /* renamed from: u, reason: collision with root package name */
    public k33.b f402357u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f402358v;

    public x(s23.o templateView, r45.ib6 ib6Var) {
        android.widget.LinearLayout linearLayout;
        kotlin.jvm.internal.o.g(templateView, "templateView");
        this.f402343d = templateView;
        this.f402344e = ib6Var;
        this.f402350n = 1;
        s23.n nVar = s23.n.f402309d;
        java.lang.Object value = s23.n.f402319q.getValue();
        kotlin.jvm.internal.o.d(value);
        this.f402351o = new androidx.lifecycle.j0(java.lang.Integer.valueOf(((java.lang.Number) value).intValue()));
        java.lang.Object value2 = s23.n.f402320r.getValue();
        kotlin.jvm.internal.o.d(value2);
        this.f402352p = new androidx.lifecycle.j0((java.lang.String) value2);
        this.f402353q = s23.r.f402328d;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a);
        this.f402354r = a17;
        this.f402356t = s23.u.f402336d;
        this.f402358v = jz5.h.b(s23.v.f402337d);
        androidx.appcompat.app.AppCompatActivity activity = templateView.getActivity();
        this.f402345f = (android.widget.LinearLayout) activity.findViewById(com.tencent.mm.R.id.o17);
        this.f402346g = (android.widget.ImageButton) activity.findViewById(com.tencent.mm.R.id.f487254o12);
        this.f402347h = (android.widget.TextView) activity.findViewById(com.tencent.mm.R.id.o1l);
        if (activity instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI) {
            com.tencent.mm.plugin.gallery.view.AlbumFooterBarView g86 = ((com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI) activity).g8();
            g86 = g86 instanceof android.view.View ? g86 : null;
            if (g86 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MJTemplateUI", "initView: albumFooterBarDelegate null");
            }
            if (g86 != null) {
                this.f402345f = (android.widget.LinearLayout) g86.findViewById(com.tencent.mm.R.id.o17);
                this.f402346g = (android.widget.ImageButton) g86.findViewById(com.tencent.mm.R.id.f487254o12);
                this.f402347h = (android.widget.TextView) g86.findViewById(com.tencent.mm.R.id.o1l);
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", "initView: albumFooterBarDelegate from SnsPostAlbumUI");
            }
        }
        android.widget.TextView textView = this.f402347h;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479897ia));
        }
        this.f402348i = (android.widget.LinearLayout) activity.findViewById(com.tencent.mm.R.id.f487252o10);
        this.f402349m = (android.widget.TextView) activity.findViewById(com.tencent.mm.R.id.f487253o11);
        android.widget.ImageButton imageButton = this.f402346g;
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.f402347h;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        if (s23.n.f402323u) {
            android.widget.LinearLayout linearLayout2 = this.f402345f;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            android.widget.ImageButton imageButton2 = this.f402346g;
            if (imageButton2 != null) {
                imageButton2.setSelected(d());
            }
            if (templateView.d() && !c()) {
                kotlinx.coroutines.l.d(a17, null, null, new s23.t(this, null), 3, null);
            }
        }
        if (!templateView.a() && (linearLayout = this.f402348i) != null) {
            linearLayout.setVisibility(8);
        }
        if (c()) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
            e(0, null);
        }
    }

    public final uy0.g a() {
        return (uy0.g) ((jz5.n) this.f402358v).getValue();
    }

    public final void b(r45.d2 d2Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", "hitActivityTipPositiveEvent: selected=" + d());
        yz5.l lVar = this.f402355s;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(d2Var.f372004m));
        }
    }

    public final boolean c() {
        r45.ib6 ib6Var = this.f402344e;
        return (ib6Var != null ? ib6Var.f376910e : null) != null;
    }

    public final boolean d() {
        java.lang.Integer num = (java.lang.Integer) this.f402351o.getValue();
        s23.a[] aVarArr = s23.a.f402297d;
        return num == null || num.intValue() != 0;
    }

    public final void e(int i17, java.lang.Boolean bool) {
        androidx.lifecycle.j0 j0Var = this.f402351o;
        if (i17 == 0) {
            android.widget.ImageButton imageButton = this.f402346g;
            if (imageButton != null) {
                imageButton.setSelected(true);
            }
            android.widget.ImageButton imageButton2 = this.f402346g;
            if (imageButton2 != null) {
                imageButton2.setEnabled(bool != null ? bool.booleanValue() : false);
            }
            android.widget.TextView textView = this.f402347h;
            if (textView != null) {
                textView.setClickable(false);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MJTemplateUI", "[updateTemplateView] selectTemplateState.value = MJTemplateHandleNew.TemplateSelectType.SELECTED_NO_ENABLE_CHANGE.value");
            s23.a[] aVarArr = s23.a.f402297d;
            j0Var.setValue(2);
            this.f402350n = 2;
        } else if (d()) {
            android.widget.ImageButton imageButton3 = this.f402346g;
            if (imageButton3 != null) {
                imageButton3.setSelected(true);
            }
            android.widget.ImageButton imageButton4 = this.f402346g;
            if (imageButton4 != null) {
                imageButton4.setEnabled(bool != null ? bool.booleanValue() : true);
            }
            android.widget.TextView textView2 = this.f402347h;
            if (textView2 != null) {
                textView2.setClickable(true);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MJTemplateUI", "[updateTemplateView] selectTemplateState.value = MJTemplateHandleNew.TemplateSelectType.SELECTED.value");
            s23.a[] aVarArr2 = s23.a.f402297d;
            j0Var.setValue(1);
            this.f402350n = 1;
        }
        if (d()) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f487254o12) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.o1l)) != false) {
            if (!d() && !((java.lang.Boolean) this.f402353q.invoke()).booleanValue()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MJTemplateUI", "not enable to select");
                yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            d();
            androidx.lifecycle.j0 j0Var = this.f402351o;
            if (d()) {
                s23.a[] aVarArr = s23.a.f402297d;
                i17 = 0;
            } else {
                s23.a[] aVarArr2 = s23.a.f402297d;
                i17 = 1;
            }
            j0Var.setValue(i17);
            android.widget.ImageButton imageButton = this.f402346g;
            if (imageButton != null) {
                imageButton.setSelected(d());
            }
            s23.n nVar = s23.n.f402309d;
            s23.n.f402324v = d() ? 1 : 0;
            if (d()) {
                ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
                ((s23.m) s23.n.f402327y).invoke();
            }
            r45.d2 d2Var = (r45.d2) this.f402356t.invoke();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkHitAliveActivityTemplateTip: ");
            sb6.append(d2Var != null ? java.lang.Long.valueOf(d2Var.f372004m) : null);
            sb6.append(", ");
            sb6.append(d());
            com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", sb6.toString());
            if (d2Var == null || !d()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", "hitActivityTipNegativeEvent: ");
                yz5.l lVar = this.f402355s;
                if (lVar != null) {
                    lVar.invoke(0L);
                }
            } else {
                b(d2Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
