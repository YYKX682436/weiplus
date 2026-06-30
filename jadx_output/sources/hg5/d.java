package hg5;

/* loaded from: classes8.dex */
public abstract class d extends androidx.appcompat.app.i0 implements androidx.lifecycle.y {

    /* renamed from: p, reason: collision with root package name */
    public static hg5.d f281398p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f281399q;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f281400f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f281401g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f281402h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f281403i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f281404m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f281405n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f281406o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context selfContext) {
        super(selfContext, com.tencent.mm.R.style.f494231hn);
        kotlin.jvm.internal.o.g(selfContext, "selfContext");
        this.f281400f = selfContext;
        jz5.g b17 = jz5.h.b(new hg5.c(this));
        this.f281405n = b17;
        ((androidx.lifecycle.b0) ((jz5.n) b17).getValue()).g(androidx.lifecycle.n.INITIALIZED);
    }

    public static final boolean I() {
        if (f281399q != com.tencent.mm.ui.bk.C()) {
            try {
                hg5.d dVar = f281398p;
                if (dVar != null) {
                    dVar.dismiss();
                }
            } catch (java.lang.Exception unused) {
            }
            f281398p = null;
            return false;
        }
        hg5.d dVar2 = f281398p;
        if (dVar2 == null) {
            return false;
        }
        if (dVar2.isShowing()) {
            return true;
        }
        f281398p = null;
        return false;
    }

    public final void D() {
        if (this.f281403i != null) {
            int i17 = 0;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.content.Context context = this.f281400f;
                if (com.tencent.mm.ui.bl.f(context)) {
                    if (!(getContext().getResources().getConfiguration().orientation == 2)) {
                        i17 = com.tencent.mm.ui.bl.c(context);
                    }
                }
            }
            android.view.View view = this.f281403i;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i17;
            }
            android.view.View view2 = this.f281403i;
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    public int E() {
        return i65.a.b(getContext(), 130);
    }

    public abstract android.view.View F();

    public void G() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bj8, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f281401g = inflate;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.f484220df2) : null;
        this.f281402h = findViewById;
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = E();
            android.view.View view = this.f281402h;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
        android.view.View view2 = this.f281402h;
        if (view2 != null) {
            view2.setOnTouchListener(new hg5.a(this));
        }
        android.view.View view3 = this.f281401g;
        this.f281404m = view3 != null ? view3.findViewById(com.tencent.mm.R.id.ci6) : null;
        this.f281403i = F();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, com.tencent.mm.R.id.f484220df2);
        android.view.View view4 = this.f281401g;
        android.view.ViewGroup viewGroup = view4 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view4 : null;
        if (viewGroup != null) {
            viewGroup.addView(this.f281403i, layoutParams2);
        }
        setCancelable(true);
        super.setOnDismissListener(new hg5.b(this));
    }

    public void J() {
        ((androidx.lifecycle.b0) ((jz5.n) this.f281405n).getValue()).g(androidx.lifecycle.n.DESTROYED);
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f281406o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        f281398p = null;
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return (androidx.lifecycle.b0) ((jz5.n) this.f281405n).getValue();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        D();
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((androidx.lifecycle.b0) ((jz5.n) this.f281405n).getValue()).g(androidx.lifecycle.n.CREATED);
        G();
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f281406o = onDismissListener;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        f281399q = com.tencent.mm.ui.bk.C();
        ((androidx.lifecycle.b0) ((jz5.n) this.f281405n).getValue()).g(androidx.lifecycle.n.RESUMED);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
