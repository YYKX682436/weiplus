package tx4;

/* loaded from: classes8.dex */
public class l implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public tx4.p f422692d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f422693e;

    /* renamed from: f, reason: collision with root package name */
    public tx4.e f422694f;

    /* renamed from: g, reason: collision with root package name */
    public db5.g4 f422695g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView f422696h;

    /* renamed from: i, reason: collision with root package name */
    public tx4.q f422697i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f422698m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f422699n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewTreeObserver f422700o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f422701p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f422702q = false;

    public l(android.content.Context context) {
        this.f422698m = false;
        this.f422693e = context;
        if (context instanceof android.app.Activity) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView();
            if (viewGroup.getChildCount() > 0) {
                this.f422699n = viewGroup.getChildAt(0);
            } else {
                this.f422699n = viewGroup;
            }
        }
        this.f422695g = new db5.g4(context);
        this.f422692d = new tx4.p(context);
        this.f422696h = new com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView(context);
        tx4.q qVar = new tx4.q(context);
        this.f422697i = qVar;
        this.f422696h.setAdapter(qVar);
        this.f422698m = a();
        this.f422692d.setContentView(this.f422696h);
    }

    public final boolean a() {
        android.util.DisplayMetrics displayMetrics = this.f422693e.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels > displayMetrics.heightPixels;
    }

    public void b() {
        android.view.ViewTreeObserver viewTreeObserver = this.f422700o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f422700o = this.f422699n.getViewTreeObserver();
            }
            this.f422700o.removeGlobalOnLayoutListener(this);
            this.f422700o = null;
        }
        tx4.p pVar = this.f422692d;
        if (pVar != null) {
            pVar.dismiss();
        }
    }

    public void c() {
        this.f422698m = a();
        tx4.e eVar = this.f422694f;
        if (eVar != null) {
            eVar.onCreateMMMenu(this.f422695g);
        }
        if (this.f422692d != null) {
            tx4.q qVar = this.f422697i;
            if (qVar != null) {
                qVar.f422708d = this.f422695g;
                qVar.notifyDataSetChanged();
            }
            this.f422692d.getWindow().addFlags(Integer.MIN_VALUE);
            if (this.f422701p) {
                this.f422692d.getWindow().addFlags(1024);
            }
            if (this.f422702q) {
                this.f422692d.getWindow().setFlags(8, 8);
                this.f422692d.getWindow().addFlags(131200);
                this.f422692d.getWindow().getDecorView().setSystemUiVisibility(6);
            } else {
                this.f422692d.getWindow().clearFlags(8);
                this.f422692d.getWindow().clearFlags(131072);
                this.f422692d.getWindow().clearFlags(128);
                this.f422692d.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            android.view.View view = this.f422699n;
            if (view != null) {
                boolean z17 = this.f422700o == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f422700o = viewTreeObserver;
                if (z17) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            this.f422692d.setOnDismissListener(new tx4.j(this));
            com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView gameMenuView = this.f422696h;
            if (gameMenuView != null) {
                gameMenuView.setDismissListener(new tx4.k(this));
            }
            this.f422692d.show();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        tx4.p pVar = this.f422692d;
        if (pVar != null && pVar.isShowing()) {
            android.view.View view = this.f422699n;
            if (view == null || !view.isShown()) {
                b();
                return;
            }
            tx4.p pVar2 = this.f422692d;
            if (!(pVar2 != null && pVar2.isShowing()) || this.f422698m == a()) {
                return;
            }
            b();
        }
    }
}
