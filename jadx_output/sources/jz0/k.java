package jz0;

/* loaded from: classes5.dex */
public final class k extends com.tencent.mm.ui.component.UIComponent {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f302583d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f302584e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f302585f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f302586g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f302587h;

    /* renamed from: i, reason: collision with root package name */
    public int f302588i;

    /* renamed from: m, reason: collision with root package name */
    public int f302589m;

    /* renamed from: n, reason: collision with root package name */
    public int f302590n;

    /* renamed from: o, reason: collision with root package name */
    public int f302591o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f302592p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f302593q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f302594r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnTouchListener f302595s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.GestureDetector f302596t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.VelocityTracker f302597u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f302598v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f302599w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f302600x;

    /* renamed from: y, reason: collision with root package name */
    public float f302601y;

    /* renamed from: z, reason: collision with root package name */
    public int f302602z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f302583d = jz5.h.b(new jz0.d(this));
        this.f302584e = jz5.h.b(new jz0.a(this));
        this.f302585f = jz5.h.b(new jz0.j(this));
        this.f302586g = jz5.h.b(new jz0.i(this));
        this.f302601y = 1.0f;
    }

    public final android.view.View O6() {
        java.lang.Object value = ((jz5.n) this.f302584e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View P6() {
        java.lang.Object value = ((jz5.n) this.f302585f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void Q6(boolean z17) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "runExitAni >> " + this.f302593q);
        int width = h().getWidth();
        int height = h().getHeight();
        int i18 = this.f302590n;
        if (i18 != 0 && (i17 = this.f302591o) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f302587h;
        if (s4Var != null) {
            s4Var.f210699f = width;
            s4Var.f210700g = height;
            s4Var.e(this.f302588i, this.f302589m, i18, this.f302591o);
            if (!(((double) this.f302601y) == 1.0d)) {
                com.tencent.mm.ui.tools.s4 s4Var2 = this.f302587h;
                kotlin.jvm.internal.o.d(s4Var2);
                float f17 = 1;
                s4Var2.f210707n = f17 / this.f302601y;
                if (this.f302602z != 0 || this.A != 0) {
                    int width2 = ((int) ((h().getWidth() / 2) * (f17 - this.f302601y))) + this.f302602z;
                    int height2 = (int) (((h().getHeight() / 2) + this.A) - ((height / 2) * this.f302601y));
                    com.tencent.mm.ui.tools.s4 s4Var3 = this.f302587h;
                    kotlin.jvm.internal.o.d(s4Var3);
                    s4Var3.f210708o = width2;
                    s4Var3.f210709p = height2;
                }
            }
            s4Var.d(P6(), O6(), false, new jz0.h(this, z17), null);
        }
    }

    public final android.view.View h() {
        java.lang.Object value = ((jz5.n) this.f302583d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        Q6(false);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f302588i = getIntent().getIntExtra("intent_left", 0);
        this.f302589m = getIntent().getIntExtra("intent_top", 0);
        this.f302591o = getIntent().getIntExtra("intent_height", 0);
        this.f302590n = getIntent().getIntExtra("intent_width", 0);
        this.f302592p = getIntent().getBooleanExtra("intent_video_is_preview", false);
        this.f302587h = new com.tencent.mm.ui.tools.s4(getActivity());
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String stringExtra = ((com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.class)).getIntent().getStringExtra("intent_video_thumb_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "onCreate, " + this.f302592p + ", thumbPath:" + stringExtra);
        java.lang.Object value = ((jz5.n) this.f302586g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.ImageView) value).setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(stringExtra, 1.0f));
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "runEnterAni >> " + this.f302593q);
        if (!this.f302593q) {
            this.f302593q = true;
            com.tencent.mm.ui.tools.s4 s4Var = this.f302587h;
            if (s4Var != null) {
                s4Var.e(this.f302588i, this.f302589m, this.f302590n, this.f302591o);
                android.view.ViewTreeObserver viewTreeObserver = P6().getViewTreeObserver();
                kotlin.jvm.internal.o.f(viewTreeObserver, "getViewTreeObserver(...)");
                viewTreeObserver.addOnPreDrawListener(new jz0.f(this, s4Var));
            }
        }
        if (this.f302592p) {
            return;
        }
        this.f302596t = new android.view.GestureDetector(getActivity(), new jz0.b(this));
        this.f302595s = new jz0.c(this);
        P6().setOnTouchListener(this.f302595s);
    }
}
