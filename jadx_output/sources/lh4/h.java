package lh4;

/* loaded from: classes8.dex */
public abstract class h extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final lh4.b f318710d;

    /* renamed from: e, reason: collision with root package name */
    public final int f318711e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f318712f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f318713g;

    /* renamed from: h, reason: collision with root package name */
    public lh4.n f318714h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f318715i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lh4.b callback, int i17, android.util.AttributeSet attributeSet, int i18) {
        super(context, attributeSet, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f318710d = callback;
        this.f318711e = i17;
        lh4.m mVar = lh4.n.f318719e;
        this.f318714h = lh4.n.f318720f;
        int i19 = com.tencent.mm.R.layout.f489551cy1;
        switch (i17) {
            case 1:
            case 2:
            case 7:
                i19 = com.tencent.mm.R.layout.f489553cy3;
                break;
            case 3:
            case 9:
                i19 = com.tencent.mm.R.layout.f489550cy0;
                break;
            case 4:
            default:
                i19 = com.tencent.mm.R.layout.cxz;
                break;
            case 5:
                i19 = com.tencent.mm.R.layout.f489552cy2;
                break;
            case 6:
            case 8:
                break;
            case 10:
                i19 = com.tencent.mm.R.layout.epu;
                break;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i19, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f318712f = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.cg7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f318715i = (android.widget.FrameLayout) findViewById;
        if (f().length() > 0) {
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc);
            this.f318713g = textView;
            textView.setText(f());
        } else {
            this.f318713g = null;
        }
        d();
        setImportantForAccessibility(2);
        addView(viewGroup);
    }

    public final void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f318715i.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public boolean b(int i17) {
        return true;
    }

    public void c() {
    }

    public void d() {
    }

    public void e(int i17) {
    }

    public abstract java.lang.String f();

    public boolean g(int i17) {
        return false;
    }

    public final lh4.b getCallback() {
        return this.f318710d;
    }

    public final android.widget.FrameLayout getContainerView() {
        return this.f318715i;
    }

    public final android.view.ViewGroup getRoot() {
        return this.f318712f;
    }

    public final int getSectionType() {
        return this.f318711e;
    }

    public final android.widget.TextView getTitle() {
        return this.f318713g;
    }

    public final lh4.n getViewModel() {
        return this.f318714h;
    }

    public void h(int i17) {
        android.widget.TextView textView;
        android.view.ViewGroup viewGroup = this.f318712f;
        if (viewGroup == null || (textView = this.f318713g) == null) {
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.jrt);
        if (textView2 != null) {
            textView2.setTextSize(0, i17);
        }
        textView.setTextSize(0, i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void setViewModel(lh4.n nVar) {
        kotlin.jvm.internal.o.g(nVar, "<set-?>");
        this.f318714h = nVar;
    }
}
