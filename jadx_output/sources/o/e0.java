package o;

/* loaded from: classes15.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f341702a;

    /* renamed from: b, reason: collision with root package name */
    public final o.r f341703b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f341704c;

    /* renamed from: d, reason: collision with root package name */
    public final int f341705d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341706e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f341707f;

    /* renamed from: g, reason: collision with root package name */
    public int f341708g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f341709h;

    /* renamed from: i, reason: collision with root package name */
    public o.f0 f341710i;

    /* renamed from: j, reason: collision with root package name */
    public o.c0 f341711j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f341712k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.PopupWindow.OnDismissListener f341713l;

    public e0(android.content.Context context, o.r rVar, android.view.View view, boolean z17, int i17) {
        this(context, rVar, view, z17, i17, 0);
    }

    public o.c0 a() {
        if (this.f341711j == null) {
            android.content.Context context = this.f341702a;
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            o.c0 lVar = java.lang.Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479972kk) ? new o.l(this.f341702a, this.f341707f, this.f341705d, this.f341706e, this.f341704c) : new o.n0(this.f341702a, this.f341703b, this.f341707f, this.f341705d, this.f341706e, this.f341704c);
            lVar.k(this.f341703b);
            lVar.q(this.f341713l);
            lVar.m(this.f341707f);
            lVar.g(this.f341710i);
            lVar.n(this.f341709h);
            lVar.o(this.f341708g);
            this.f341711j = lVar;
        }
        return this.f341711j;
    }

    public boolean b() {
        o.c0 c0Var = this.f341711j;
        return c0Var != null && c0Var.isShowing();
    }

    public void c() {
        this.f341711j = null;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f341712k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i17, int i18, boolean z17, boolean z18) {
        o.c0 a17 = a();
        a17.r(z18);
        if (z17) {
            int i19 = this.f341708g;
            android.view.View view = this.f341707f;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if ((android.view.Gravity.getAbsoluteGravity(i19, n3.v0.d(view)) & 7) == 5) {
                i17 -= this.f341707f.getWidth();
            }
            a17.p(i17);
            a17.s(i18);
            int i27 = (int) ((this.f341702a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a17.f341689d = new android.graphics.Rect(i17 - i27, i18 - i27, i17 + i27, i18 + i27);
        }
        a17.show();
    }

    public e0(android.content.Context context, o.r rVar, android.view.View view, boolean z17, int i17, int i18) {
        this.f341708g = 8388611;
        this.f341713l = new o.d0(this);
        this.f341702a = context;
        this.f341703b = rVar;
        this.f341707f = view;
        this.f341704c = z17;
        this.f341705d = i17;
        this.f341706e = i18;
    }
}
