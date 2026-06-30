package ec4;

/* loaded from: classes10.dex */
public final class d0 extends com.tencent.mm.ui.component.UIComponent {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f251121d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f251122e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f251123f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f251124g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f251125h;

    /* renamed from: i, reason: collision with root package name */
    public int f251126i;

    /* renamed from: m, reason: collision with root package name */
    public int f251127m;

    /* renamed from: n, reason: collision with root package name */
    public int f251128n;

    /* renamed from: o, reason: collision with root package name */
    public int f251129o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f251130p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f251131q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f251132r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f251133s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.GestureDetector f251134t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.VelocityTracker f251135u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f251136v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f251137w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f251138x;

    /* renamed from: y, reason: collision with root package name */
    public float f251139y;

    /* renamed from: z, reason: collision with root package name */
    public int f251140z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f251121d = jz5.h.b(new ec4.w(this));
        this.f251122e = jz5.h.b(new ec4.t(this));
        this.f251123f = jz5.h.b(new ec4.c0(this));
        this.f251124g = jz5.h.b(new ec4.b0(this));
        this.f251132r = "";
        this.f251139y = 1.0f;
    }

    public static final /* synthetic */ android.view.VelocityTracker O6(ec4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMVelocityTracker$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        android.view.VelocityTracker velocityTracker = d0Var.f251135u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMVelocityTracker$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return velocityTracker;
    }

    public static final /* synthetic */ android.view.View P6(ec4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        android.view.View h17 = d0Var.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return h17;
    }

    public static final /* synthetic */ boolean Q6(ec4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScaled$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        boolean z17 = d0Var.f251136v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScaled$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return z17;
    }

    public static final /* synthetic */ android.view.View R6(ec4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        android.view.View U6 = d0Var.U6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return U6;
    }

    public static final /* synthetic */ void S6(ec4.d0 d0Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setLongPress$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        d0Var.f251137w = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setLongPress$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }

    public final android.widget.ImageView T6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        java.lang.Object value = ((jz5.n) this.f251124g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return imageView;
    }

    public final android.view.View U6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        java.lang.Object value = ((jz5.n) this.f251123f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return view;
    }

    public final void V6(boolean z17) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoAniUIC", "runExitAni >> " + this.f251131q);
        int width = h().getWidth();
        int height = h().getHeight();
        int i18 = this.f251128n;
        if (i18 != 0 && (i17 = this.f251129o) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f251125h;
        if (s4Var != null) {
            s4Var.f210699f = width;
            s4Var.f210700g = height;
            s4Var.e(this.f251126i, this.f251127m, i18, this.f251129o);
            if (!(((double) this.f251139y) == 1.0d)) {
                com.tencent.mm.ui.tools.s4 s4Var2 = this.f251125h;
                kotlin.jvm.internal.o.d(s4Var2);
                float f17 = 1;
                s4Var2.f210707n = f17 / this.f251139y;
                if (this.f251140z != 0 || this.A != 0) {
                    int width2 = ((int) ((h().getWidth() / 2) * (f17 - this.f251139y))) + this.f251140z;
                    int height2 = (int) (((h().getHeight() / 2) + this.A) - ((height / 2) * this.f251139y));
                    com.tencent.mm.ui.tools.s4 s4Var3 = this.f251125h;
                    kotlin.jvm.internal.o.d(s4Var3);
                    s4Var3.f210708o = width2;
                    s4Var3.f210709p = height2;
                }
            }
            android.view.View U6 = U6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            java.lang.Object value = ((jz5.n) this.f251122e).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            s4Var.d(U6, (android.view.View) value, false, new ec4.a0(this, z17), null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }

    public final android.view.View h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        java.lang.Object value = ((jz5.n) this.f251121d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return view;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        this.f251126i = getIntent().getIntExtra("intent_left", 0);
        this.f251127m = getIntent().getIntExtra("intent_top", 0);
        this.f251129o = getIntent().getIntExtra("intent_height", 0);
        this.f251128n = getIntent().getIntExtra("intent_width", 0);
        this.f251130p = getIntent().getBooleanExtra("intent_video_is_preview", false);
        java.lang.String stringExtra = getIntent().getStringExtra("intent_video_thumb_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f251132r = stringExtra;
        this.f251125h = new com.tencent.mm.ui.tools.s4(getActivity());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoAniUIC", "thumbPath >> " + this.f251132r);
        T6().setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(this.f251132r, 1.0f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoAniUIC", "runEnterAni >> " + this.f251131q);
        if (this.f251131q) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        } else {
            this.f251131q = true;
            com.tencent.mm.ui.tools.s4 s4Var = this.f251125h;
            if (s4Var != null) {
                s4Var.e(this.f251126i, this.f251127m, this.f251128n, this.f251129o);
                android.view.ViewTreeObserver viewTreeObserver = U6().getViewTreeObserver();
                kotlin.jvm.internal.o.f(viewTreeObserver, "getViewTreeObserver(...)");
                viewTreeObserver.addOnPreDrawListener(new ec4.y(this, s4Var));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        }
        if (!this.f251130p) {
            this.f251134t = new android.view.GestureDetector(getActivity(), new ec4.u(this));
            U6().setOnTouchListener(new ec4.v(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }
}
