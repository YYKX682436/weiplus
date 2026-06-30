package qv4;

/* loaded from: classes12.dex */
public final class j extends jv4.e {

    /* renamed from: g, reason: collision with root package name */
    public boolean f366982g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f366983h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f366984i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(su4.p0 config) {
        super(config);
        kotlin.jvm.internal.o.g(config, "config");
        this.f366982g = true;
        this.f366983h = jz5.h.b(new qv4.i(this, config));
        this.f366984i = jz5.h.b(qv4.h.f366977d);
    }

    @Override // jv4.e
    public jv4.h a() {
        return f();
    }

    @Override // jv4.e
    public int b() {
        return com.tencent.mm.R.layout.efz;
    }

    @Override // jv4.e
    public void d() {
        if (this.f302235a.isTeenMode()) {
            return;
        }
        f().k();
    }

    @Override // jv4.e
    public void e(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.ViewGroup teachContainer) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(teachContainer, "teachContainer");
        super.e(recyclerView, teachContainer);
        android.view.View findViewById = teachContainer.findViewById(com.tencent.mm.R.id.f485077tz1);
        android.view.ViewGroup viewGroup = findViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById : null;
        android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.tyu) : null;
        android.widget.TextView textView2 = textView instanceof android.widget.TextView ? textView : null;
        su4.p0 p0Var = this.f302235a;
        if (p0Var.isTeenMode() || p0Var.m()) {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        } else {
            if (textView2 != null) {
                textView2.setOnClickListener(new qv4.f(this));
            }
            f().g().w();
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new qv4.g(recyclerView, this, viewGroup));
        }
    }

    public final qv4.r0 f() {
        return (qv4.r0) ((jz5.n) this.f366983h).getValue();
    }
}
