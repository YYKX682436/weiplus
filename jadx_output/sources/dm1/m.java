package dm1;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f241646a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewManager f241647b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f241648c;

    /* renamed from: d, reason: collision with root package name */
    public int f241649d;

    /* renamed from: e, reason: collision with root package name */
    public int f241650e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.Animator f241651f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f241652g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f241653h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f241654i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f241655j;

    /* renamed from: k, reason: collision with root package name */
    public final l01.r f241656k;

    /* renamed from: l, reason: collision with root package name */
    public dm1.a f241657l;

    /* renamed from: m, reason: collision with root package name */
    public final dm1.c f241658m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241659n;

    public m(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f241646a = context;
        this.f241649d = 1;
        this.f241652g = "";
        this.f241653h = "";
        this.f241654i = "";
        this.f241656k = new l01.n0();
        this.f241658m = new dm1.c(this);
    }

    public final void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "dismissCard() called with: quickHide = " + z17);
        if (!z18) {
            com.tencent.mm.app.w.INSTANCE.p(this.f241658m);
        }
        android.view.View view = this.f241648c;
        if (view != null) {
            dm1.f fVar = new dm1.f(this);
            if (z17) {
                fVar.invoke();
                return;
            }
            android.animation.Animator animator = this.f241651f;
            if (animator != null) {
                animator.cancel();
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -this.f241650e);
            ofInt.addUpdateListener(new dm1.d(view, this));
            ofInt.addListener(new dm1.e(fVar));
            ofInt.setDuration(200L);
            ofInt.start();
            this.f241651f = ofInt;
        }
    }

    public final void b(boolean z17, int i17) {
        this.f241649d = i17;
        com.tencent.mm.app.w.INSTANCE.a(this.f241658m);
        android.view.ViewManager viewManager = this.f241647b;
        android.content.Context context = this.f241646a;
        if (viewManager == null) {
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f241647b = new dm1.n((android.view.WindowManager) systemService);
        }
        if (this.f241648c == null) {
            if (i17 == 2) {
                this.f241648c = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488151dz4, (android.view.ViewGroup) null, false);
            } else {
                this.f241648c = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488150ik, (android.view.ViewGroup) null, false);
            }
        }
        android.view.View view = this.f241648c;
        kotlin.jvm.internal.o.d(view);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kg6)).setText(this.f241653h);
        android.view.View view2 = this.f241648c;
        kotlin.jvm.internal.o.d(view2);
        ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.kg8)).setText(this.f241652g);
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "show: avatarUrl = " + this.f241654i);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f241654i)) {
                l01.b bVar = l01.d0.f314761a;
                android.view.View view3 = this.f241648c;
                kotlin.jvm.internal.o.d(view3);
                bVar.b((android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.kfq), this.f241654i, l01.a.h(), this.f241656k);
            }
        }
        android.view.View view4 = this.f241648c;
        kotlin.jvm.internal.o.d(view4);
        view4.findViewById(com.tencent.mm.R.id.f485020g91).setOnClickListener(new dm1.g(this));
        android.view.View view5 = this.f241648c;
        kotlin.jvm.internal.o.d(view5);
        view5.findViewById(com.tencent.mm.R.id.kfp).setOnClickListener(new dm1.h(this));
        android.view.View view6 = this.f241648c;
        kotlin.jvm.internal.o.d(view6);
        view6.findViewById(com.tencent.mm.R.id.f486172kg4).setOnClickListener(new dm1.i(this));
        if (this.f241655j) {
            android.view.View view7 = this.f241648c;
            kotlin.jvm.internal.o.d(view7);
            view7.findViewById(com.tencent.mm.R.id.kfp).setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.bci));
        } else {
            android.view.View view8 = this.f241648c;
            kotlin.jvm.internal.o.d(view8);
            view8.findViewById(com.tencent.mm.R.id.kfp).setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.bch));
        }
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = fp.h.c(26) ? 2038 : 2002;
        layoutParams.flags = com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX;
        layoutParams.format = 1;
        layoutParams.packageName = context.getPackageName();
        layoutParams.gravity = 49;
        layoutParams.width = -1;
        layoutParams.height = -2;
        android.view.View view9 = this.f241648c;
        if (view9 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view9, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow", "show", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow", "show", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewManager viewManager2 = this.f241647b;
            if (viewManager2 != null) {
                viewManager2.addView(view9, layoutParams);
            }
            view9.post(new dm1.l(z17, view9, this));
        }
    }
}
