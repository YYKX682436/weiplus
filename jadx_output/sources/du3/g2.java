package du3;

/* loaded from: classes3.dex */
public final class g2 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243587f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243588g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243589h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243590i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f243591m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f243592n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f243593o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f243594p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f243595q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f243596r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f243597s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f243598t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f243599u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.PopupWindow f243600v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f243587f = parent;
        this.f243588g = jz5.h.b(new du3.p1(this));
        this.f243589h = jz5.h.b(new du3.l1(this));
        this.f243590i = jz5.h.b(new du3.k1(this));
        this.f243591m = jz5.h.b(new du3.o1(this));
        this.f243592n = jz5.h.b(new du3.f2(this));
        this.f243593o = jz5.h.b(new du3.m1(this));
        this.f243594p = jz5.h.b(new du3.r1(this));
        this.f243595q = jz5.h.b(new du3.j1(this));
        this.f243596r = jz5.h.b(new du3.n1(this));
        this.f243597s = jz5.h.b(new du3.e2(this));
        this.f243598t = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public static final void z(du3.g2 g2Var) {
        android.widget.PopupWindow popupWindow = g2Var.f243600v;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            g2Var.f243600v = null;
        }
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView A() {
        java.lang.Object value = this.f243595q.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final android.view.View B() {
        java.lang.Object value = this.f243588g.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final hk0.u0 C() {
        return (hk0.u0) this.f243597s.getValue();
    }

    @Override // yt3.r2
    public void onAttach() {
        android.view.View B = B();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(B, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        B.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(B, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C().Z6(3, new du3.s1(this));
        C().Z6(5, new du3.t1(this));
        C().Z6(6, new du3.u1(this));
        C().Z6(2, new du3.v1(this));
        C().Z6(4, new du3.w1(this));
        C().Z6(1, new du3.x1(this));
        C().a7(1, new du3.y1(this));
        this.f243599u = kotlinx.coroutines.l.d(this.f243598t, null, null, new du3.c2(this, null), 3, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        int id6 = v17.getId();
        if (id6 == com.tencent.mm.R.id.pzk) {
            hk0.u0.e7(C(), 1, null, 2, null);
        } else if (id6 == com.tencent.mm.R.id.f483984pv0) {
            hk0.u0.e7(C(), 4, null, 2, null);
            nu3.i iVar = nu3.i.f340218a;
            iVar.b(10);
            nu3.i.c(iVar, "KEY_CLICK_CROP_COUNT_INT", 0, 2, null);
        } else if (id6 == com.tencent.mm.R.id.f485986pz0) {
            hk0.u0.e7(C(), 5, null, 2, null);
        } else if (id6 == com.tencent.mm.R.id.sbz) {
            hk0.u0.e7(C(), 6, null, 2, null);
        } else if (id6 == com.tencent.mm.R.id.d8n) {
            ut3.d dVar = ut3.f.f431176c.f431177a;
            if (dVar != null && (dVar instanceof qt3.m)) {
                hk0.u0 C = C();
                kotlinx.coroutines.l.d(C.f281822p, null, null, new hk0.o0(C, null), 3, null);
                C.f281818i = new hk0.z();
            }
            C().d7(10, java.lang.Boolean.TRUE);
            nu3.i.f340218a.b(12);
            nu3.i.f340221d.f60874i = java.lang.System.currentTimeMillis();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onDetach() {
        kotlinx.coroutines.r2 r2Var = this.f243599u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.z0.e(this.f243598t, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        java.lang.Object value = ((jz5.n) this.f243590i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value).setOnClickListener(this);
        java.lang.Object value2 = ((jz5.n) this.f243593o).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value2).setOnClickListener(this);
        java.lang.Object value3 = ((jz5.n) this.f243594p).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value3).setOnClickListener(this);
        java.lang.Object value4 = ((jz5.n) this.f243596r).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.view.View) value4).setOnClickListener(this);
        if (du3.b0.F.a(configProvider)) {
            A().setOnClickListener(this);
            A().setVisibility(0);
            com.tencent.mm.ui.widget.imageview.WeImageView A = A();
            A.getViewTreeObserver().addOnPreDrawListener(new du3.q1(A, this));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(A(), "sns_ai_retouch");
            aVar.fk(A(), "sns_publish_sessionid", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi());
            aVar.ik(A(), 40, 36244);
        }
        android.view.ViewGroup.LayoutParams layoutParams = B().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        int c17 = com.tencent.mm.ui.bl.c(B().getContext());
        layoutParams2.bottomMargin += com.tencent.mm.ui.bl.c(B().getContext());
        B().setLayoutParams(layoutParams2);
        C().f281818i.f281861m += c17;
    }
}
