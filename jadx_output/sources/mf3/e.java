package mf3;

/* loaded from: classes12.dex */
public abstract class e implements mf3.n, kg3.d, com.tencent.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public final mf3.p f326104d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326105e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f326106f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f326107g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f326108h;

    /* renamed from: i, reason: collision with root package name */
    public int f326109i;

    /* renamed from: m, reason: collision with root package name */
    public mf3.s f326110m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f326111n;

    public e(mf3.p apiCenter, java.lang.String logLabel) {
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        kotlin.jvm.internal.o.g(logLabel, "logLabel");
        this.f326104d = apiCenter;
        this.f326105e = logLabel;
        this.f326106f = "";
        this.f326109i = -1;
    }

    private final java.lang.String N(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" {holder@" + L() + " #" + this.f326109i + '}');
        return sb6.toString();
    }

    @Override // mf3.l
    public void F() {
        this.f326111n = true;
    }

    @Override // mf3.n
    public mf3.p G() {
        return this.f326104d;
    }

    public void H2() {
    }

    public abstract android.view.View J(android.content.Context context);

    public final android.content.Context K() {
        android.content.Context context = this.f326108h;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }

    public java.lang.String L() {
        return this.f326106f;
    }

    public final android.view.View M() {
        android.view.View view = this.f326107g;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("rootView");
        throw null;
    }

    public final void O(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(args, "args");
        N(format);
        java.util.Arrays.copyOf(args, args.length);
    }

    public final void P(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mars.xlog.Log.e(this.f326105e, N(format), java.util.Arrays.copyOf(args, args.length));
    }

    public final void Q(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mars.xlog.Log.i(this.f326105e, N(format), java.util.Arrays.copyOf(args, args.length));
    }

    public final void R() {
        kg3.n nVar = new kg3.n(K(), this, this.f326111n);
        android.content.Context context = nVar.f307721a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return;
        }
        if (nVar.b(activity) || nVar.a()) {
            ym5.a1.f(new kg3.l(nVar));
        } else {
            ym5.a1.f(new kg3.m(nVar));
        }
    }

    public void h4() {
    }

    @Override // mf3.l
    public void i() {
        this.f326111n = false;
    }

    @Override // com.tencent.mm.ui.fa
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        new kg3.n(K(), this, this.f326111n).c(newConfig);
    }

    @Override // mf3.n
    public void p(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f326106f = str;
    }

    public void r(int i17, int i18) {
        R();
    }

    @Override // mf3.l
    public void recycle() {
        android.content.Context K = K();
        com.tencent.mm.ui.MMActivity mMActivity = K instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) K : null;
        if (mMActivity != null) {
            mMActivity.removeOnConfigurationChangedListener(this);
        }
        this.f326111n = false;
    }

    @Override // mf3.l
    public void t(mf3.s bindContext) {
        mf3.k kVar;
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        this.f326109i = bindContext.f326118b;
        this.f326110m = bindContext;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindLayer mediaId: ");
        mf3.s sVar = this.f326110m;
        sb6.append((sVar == null || (kVar = sVar.f326117a) == null) ? null : kVar.getId());
        Q(sb6.toString(), new java.lang.Object[0]);
        android.content.Context K = K();
        com.tencent.mm.ui.MMActivity mMActivity = K instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) K : null;
        if (mMActivity != null) {
            mMActivity.addOnConfigurationChangedListener(this);
        }
    }

    @Override // mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        android.content.Context context = parentView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f326108h = context;
        android.content.Context context2 = parentView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        android.view.View J2 = J(context2);
        kotlin.jvm.internal.o.g(J2, "<set-?>");
        this.f326107g = J2;
        android.view.ViewGroup viewGroup = parentView instanceof android.view.ViewGroup ? (android.view.ViewGroup) parentView : null;
        if (viewGroup != null) {
            viewGroup.addView(M());
        }
    }

    public /* synthetic */ e(mf3.p pVar, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(pVar, (i17 & 2) != 0 ? "" : str);
    }
}
