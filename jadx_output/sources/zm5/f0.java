package zm5;

/* loaded from: classes3.dex */
public final class f0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public long f474205d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474206e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f474207f;

    /* renamed from: g, reason: collision with root package name */
    public db5.t4 f474208g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f474209h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f474210i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f474211m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f474212n;

    /* renamed from: o, reason: collision with root package name */
    public zm5.x0 f474213o;

    /* renamed from: p, reason: collision with root package name */
    public sy3.c f474214p;

    /* renamed from: q, reason: collision with root package name */
    public long f474215q;

    /* renamed from: r, reason: collision with root package name */
    public zm5.x0 f474216r;

    /* renamed from: s, reason: collision with root package name */
    public final sy3.e f474217s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f474205d = -1L;
        this.f474206e = "";
        this.f474209h = jz5.h.b(new zm5.a0(activity));
        this.f474210i = jz5.h.b(new zm5.b0(activity));
        this.f474211m = jz5.h.b(new zm5.u(activity));
        zm5.x0 x0Var = zm5.x0.f474286d;
        this.f474213o = x0Var;
        this.f474216r = x0Var;
        this.f474217s = new zm5.v(activity, this);
    }

    public final void O6() {
        nc5.w wVar;
        zm5.x0 x0Var = this.f474213o;
        zm5.x0 x0Var2 = zm5.x0.f474287e;
        if (x0Var == x0Var2) {
            if (aq.p.f12930b != null && (wVar = nc5.b.f336193e) != null) {
                com.tencent.mm.autogen.events.CancelScanTranslationEvent cancelScanTranslationEvent = new com.tencent.mm.autogen.events.CancelScanTranslationEvent();
                am.r1 r1Var = cancelScanTranslationEvent.f54027g;
                r1Var.f7757a = 1;
                r1Var.f7758b = wVar.f336238a;
                cancelScanTranslationEvent.e();
                wVar.f336238a = 0;
            }
            this.f474213o = zm5.x0.f474286d;
            U6();
        }
        sy3.c cVar = this.f474214p;
        if (cVar == null || this.f474216r != x0Var2) {
            return;
        }
        ((kz3.l) cVar).b(this.f474215q);
        U6();
        this.f474215q = 0L;
        this.f474216r = zm5.x0.f474286d;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        zm5.l lVar = (zm5.l) pf5.z.f353948a.a(activity).a(zm5.l.class);
        lVar.f474240n = true;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = lVar.f474234e;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(true);
            mMViewPager.setSingleMode(false);
        }
    }

    public final android.widget.ImageView P6() {
        java.lang.Object value = ((jz5.n) this.f474211m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public final android.widget.ImageView Q6() {
        java.lang.Object value = ((jz5.n) this.f474209h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public final void R6(int i17) {
        java.lang.Object value = ((jz5.n) this.f474210i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.ImageView) value).setVisibility(i17);
        Q6().setVisibility(i17);
        P6().setVisibility(i17);
    }

    public final void S6(long j17, java.lang.String str) {
        boolean z17;
        this.f474205d = j17;
        this.f474206e = str;
        if (this.f474207f == null) {
            this.f474207f = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getActivity(), 0, true);
        }
        if (aq.p.f12930b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "getShareAndSaveIsToShow: " + j17);
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, j17);
            boolean z18 = (c01.ia.y(n17) || c01.ia.C(n17)) ? false : true;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "getShareAndSaveIsToShow: " + z18);
            z17 = z18;
        } else {
            z17 = false;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f474207f;
        if (k0Var != null) {
            k0Var.f211872n = new zm5.c0(z17, this);
        }
        if (k0Var != null) {
            k0Var.f211874o = new zm5.d0(z17, this, j17, str);
        }
        db5.t4 t4Var = this.f474208g;
        if (t4Var != null) {
            if (k0Var != null) {
                k0Var.f211881s = t4Var;
            }
            if (k0Var != null) {
                k0Var.f211884v = t4Var;
            }
        }
        if (k0Var != null) {
            k0Var.p(new zm5.e0(this));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f474207f;
        if (k0Var2 != null) {
            k0Var2.v();
        }
    }

    public final void T6() {
        R6(0);
        android.animation.ValueAnimator valueAnimator = this.f474212n;
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
        }
        android.animation.ValueAnimator valueAnimator2 = this.f474212n;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(-1);
        }
        android.animation.ValueAnimator valueAnimator3 = this.f474212n;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void U6() {
        R6(8);
        android.animation.ValueAnimator valueAnimator = this.f474212n;
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
        }
        android.animation.ValueAnimator valueAnimator2 = this.f474212n;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(0);
        }
        android.animation.ValueAnimator valueAnimator3 = this.f474212n;
        if (valueAnimator3 != null) {
            valueAnimator3.end();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f474212n = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(5000L);
        }
        android.animation.ValueAnimator valueAnimator = this.f474212n;
        if (valueAnimator != null) {
            valueAnimator.addListener(new zm5.w(this));
        }
        int height = getActivity().getWindowManager().getDefaultDisplay().getHeight();
        android.animation.ValueAnimator valueAnimator2 = this.f474212n;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new zm5.x(this, height));
        }
        android.view.ViewGroup.LayoutParams layoutParams = P6().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += i65.a.b(getActivity(), aq.p.f12930b != null ? nc5.b.f336192d : 0);
        P6().setLayoutParams(layoutParams2);
        P6().setOnClickListener(new zm5.y(this));
        this.f474208g = new zm5.z(this);
        if (aq.p.f12930b != null) {
            nc5.w wVar = new nc5.w();
            nc5.b.f336193e = wVar;
            wVar.f336243f.alive();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6();
        if (aq.p.f12930b != null) {
            nc5.w wVar = nc5.b.f336193e;
            if (wVar != null) {
                wVar.f336243f.dead();
            }
            nc5.b.f336193e = null;
        }
    }
}
