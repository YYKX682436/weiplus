package uk4;

/* loaded from: classes10.dex */
public class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f428530d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f428531e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f428532f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f428533g;

    /* renamed from: h, reason: collision with root package name */
    public int f428534h;

    /* renamed from: i, reason: collision with root package name */
    public int f428535i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f428536m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f428537n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f428538o;

    /* renamed from: p, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f428539p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f428540q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f428541r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f428542s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f428543t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f428544u = new java.util.LinkedList();

    public e(android.content.Context context) {
        this.f428533g = false;
        this.f428538o = false;
        this.f428531e = context;
        this.f428538o = false;
        if (context instanceof android.app.Activity) {
            this.f428536m = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        this.f428530d = new y9.i(context, com.tencent.mm.R.style.f30do);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d0z, null);
        this.f428532f = inflate;
        this.f428542s = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.f483444av5);
        this.f428543t = (android.view.ViewGroup) this.f428532f.findViewById(com.tencent.mm.R.id.avd);
        this.f428540q = (android.widget.LinearLayout) this.f428532f.findViewById(com.tencent.mm.R.id.f483441av3);
        this.f428541r = this.f428532f.findViewById(com.tencent.mm.R.id.b5t);
        this.f428540q.setOnClickListener(new uk4.a(this));
        this.f428533g = a();
        this.f428530d.requestWindowFeature(1);
        this.f428530d.setContentView(this.f428532f);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f428532f.getParent());
        this.f428539p = A;
        if (A != null) {
            A.D(3);
        }
        this.f428530d.setOnDismissListener(new uk4.b(this));
    }

    public final boolean a() {
        return this.f428531e.getResources().getConfiguration().orientation == 2;
    }

    public void b() {
        android.app.Dialog dialog = this.f428530d;
        if (dialog != null) {
            android.content.Context context = this.f428531e;
            if (!(context instanceof android.app.Activity)) {
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) context).isDestroyed()) {
                this.f428530d.dismiss();
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f428539p;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.app.Dialog dialog = this.f428530d;
        if (dialog != null && dialog.isShowing()) {
            android.view.View view = this.f428536m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                b();
                return;
            }
            android.app.Dialog dialog2 = this.f428530d;
            if (dialog2 != null && dialog2.isShowing()) {
                if (this.f428533g == a()) {
                    int i17 = this.f428534h;
                    android.content.Context context = this.f428531e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        if (this.f428535i != this.f428542s.getHeight()) {
                            this.f428535i = this.f428542s.getHeight();
                            int width = this.f428542s.getWidth();
                            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f428543t.getLayoutParams();
                            layoutParams.height = this.f428535i;
                            layoutParams.width = width;
                            layoutParams.gravity = 85;
                            this.f428543t.setLayoutParams(layoutParams);
                            return;
                        }
                        return;
                    }
                }
                b();
            }
        }
    }
}
