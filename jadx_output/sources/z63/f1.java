package z63;

/* loaded from: classes5.dex */
public class f1 implements z63.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f470381b;

    /* renamed from: c, reason: collision with root package name */
    public final j45.h f470382c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f470383d;

    /* renamed from: e, reason: collision with root package name */
    public db5.d5 f470384e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f470385f;

    /* renamed from: g, reason: collision with root package name */
    public final z63.e1 f470386g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f470387h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470392m;

    /* renamed from: n, reason: collision with root package name */
    public int f470393n;

    /* renamed from: o, reason: collision with root package name */
    public int f470394o;

    /* renamed from: p, reason: collision with root package name */
    public int f470395p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f470396q;

    /* renamed from: s, reason: collision with root package name */
    public final z63.b1 f470398s;

    /* renamed from: t, reason: collision with root package name */
    public final z63.c1 f470399t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f470401v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f470402w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f470403x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f470404y;

    /* renamed from: a, reason: collision with root package name */
    public android.animation.ValueAnimator f470380a = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f470388i = false;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f470389j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f470390k = "";

    /* renamed from: l, reason: collision with root package name */
    public y63.a f470391l = null;

    /* renamed from: r, reason: collision with root package name */
    public y63.a f470397r = null;

    /* renamed from: u, reason: collision with root package name */
    public z63.d1 f470400u = null;

    public f1(android.content.Context context, j45.h hVar, z63.e1 e1Var) {
        this.f470392m = "";
        z63.v0 v0Var = new z63.v0(this);
        this.f470403x = v0Var;
        this.f470404y = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "SuggestSolitatireTips()");
        this.f470381b = context;
        this.f470382c = hVar;
        this.f470386g = e1Var;
        this.f470398s = new z63.b1(context, v0Var, this);
        this.f470399t = new z63.c1(this, context, v0Var, this);
        this.f470392m = context.getString(com.tencent.mm.R.string.fsk);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.cxe, null);
        this.f470383d = inflate;
        inflate.setOnClickListener(new z63.x0(this));
        db5.d5 d5Var = new db5.d5(this.f470383d, i65.a.f(context, com.tencent.mm.R.dimen.ac_), i65.a.f(context, com.tencent.mm.R.dimen.ac9), true);
        this.f470384e = d5Var;
        d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f470384e.setOutsideTouchable(false);
        this.f470384e.setFocusable(false);
        this.f470384e.setAnimationStyle(com.tencent.mm.R.style.f494462np);
        android.widget.TextView textView = (android.widget.TextView) this.f470383d.findViewById(com.tencent.mm.R.id.nda);
        this.f470387h = textView;
        textView.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479853h2));
        ((android.widget.TextView) this.f470383d.findViewById(com.tencent.mm.R.id.nd8)).setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479568k));
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "hideTips()");
        if (this.f470384e.isShowing()) {
            this.f470384e.dismiss();
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f470403x;
        n3Var.removeCallbacksAndMessages(null);
        n3Var.removeMessages(20002);
    }
}
