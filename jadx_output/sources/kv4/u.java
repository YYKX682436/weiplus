package kv4;

/* loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv4.b0 f312730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f312731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f312732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f312733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312734h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f312735i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f312736m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f312737n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ rv4.i0 f312738o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f312739p;

    public u(kv4.b0 b0Var, android.view.ViewParent viewParent, kotlin.jvm.internal.h0 h0Var, android.widget.TextView textView, java.lang.String str, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView2, float f17, rv4.i0 i0Var, android.view.View view) {
        this.f312730d = b0Var;
        this.f312731e = viewParent;
        this.f312732f = h0Var;
        this.f312733g = textView;
        this.f312734h = str;
        this.f312735i = weImageView;
        this.f312736m = weImageView2;
        this.f312737n = f17;
        this.f312738o = i0Var;
        this.f312739p = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.TextPaint paint;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f312731e;
        java.lang.Object element = this.f312732f.f310123d;
        kotlin.jvm.internal.o.f(element, "element");
        android.widget.TextView textView = (android.widget.TextView) element;
        java.util.List list = this.f312738o.f400499j;
        android.content.Context context = this.f312739p.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f312730d.getClass();
        java.lang.Object parent = viewGroup.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        int width = view != null ? view.getWidth() : viewGroup.getWidth();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f312735i;
        boolean z17 = weImageView != null && weImageView.getVisibility() == 0;
        float f17 = this.f312737n;
        float width2 = z17 ? weImageView.getWidth() + (4 * f17) : 0.0f;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f312736m;
        float width3 = (width - width2) - (weImageView2 != null && weImageView2.getVisibility() == 0 ? weImageView2.getWidth() + (4 * f17) : 0.0f);
        android.text.TextPaint paint2 = textView.getPaint();
        java.lang.String str = this.f312734h;
        float measureText = paint2 != null ? paint2.measureText(str) : 0.0f;
        java.lang.String string = context.getString(com.tencent.mm.R.string.p07, java.lang.Integer.valueOf(list.size()));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.widget.TextView textView2 = this.f312733g;
        float measureText2 = (textView2 == null || (paint = textView2.getPaint()) == null) ? 0.0f : paint.measureText(string);
        if (measureText <= width3) {
            textView.setMaxWidth((int) width3);
            textView.setText(str);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        if (list.size() == 1) {
            kv4.b0.a(textView, str, width3);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        float f18 = width3 - measureText2;
        if (f18 <= 0.0f) {
            textView.setMaxWidth(0);
            kv4.b0.a(textView2, string, width3);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
            return;
        }
        kv4.b0.a(textView, str, f18);
        if (textView2 != null) {
            textView2.setText(string);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }
}
