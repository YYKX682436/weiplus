package uj3;

/* loaded from: classes14.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f428263a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f428264b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f428265c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f428266d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f428267e;

    public f1(android.content.Context context, uj3.b statusManager) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f428263a = context;
        this.f428264b = statusManager;
    }

    public final void a() {
        android.view.View view = this.f428265c;
        this.f428266d = view != null ? view.findViewById(com.tencent.mm.R.id.kq9) : null;
        android.view.View view2 = this.f428265c;
        this.f428267e = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.kq_) : null;
        android.view.View view3 = this.f428266d;
        android.content.Context context = this.f428263a;
        if (view3 != null) {
            view3.setBackground(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.drawable.aft, android.graphics.Color.parseColor("#FA5151")));
        }
        sj3.n3 n3Var = sj3.o3.f408666e;
        if (n3Var.a(context) == 90 || n3Var.a(context) == 270) {
            android.widget.TextView textView = this.f428267e;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.ibs);
            }
        } else {
            android.widget.TextView textView2 = this.f428267e;
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.ibl);
            }
        }
        android.view.View view4 = this.f428266d;
        if (view4 != null) {
            view4.requestLayout();
        }
        android.view.View view5 = this.f428266d;
        if (view5 != null) {
            view5.setOnClickListener(new uj3.e1(this));
        }
    }
}
