package jx2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f302420a;

    /* renamed from: b, reason: collision with root package name */
    public jx2.k f302421b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f302422c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f302423d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f302424e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.FlowLayout f302425f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f302426g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f302427h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f302428i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f302429j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f302430k;

    public static final void a(jx2.h hVar, android.view.View view, android.content.Context context) {
        hVar.getClass();
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.lkn);
        if (textView != null) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
        }
        if (weImageView != null) {
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
        }
        view.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
    }

    public final android.view.View b(android.content.Context context, java.lang.String str, int i17) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.ady, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.lkn);
        if (i17 == 0) {
            weImageView.setVisibility(0);
            weImageView.setImageDrawable(context.getResources().getDrawable(com.tencent.mm.R.raw.finder_ad_feedback_no_interesting));
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else if (i17 != 1) {
            weImageView.setVisibility(8);
        } else {
            weImageView.setVisibility(0);
            weImageView.setImageDrawable(context.getResources().getDrawable(com.tencent.mm.R.raw.finder_ad_feedback_approve));
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        textView.setText(str);
        return inflate;
    }

    public final void c(android.content.Context context) {
        jx2.k kVar = this.f302421b;
        if (kVar == null) {
            return;
        }
        boolean z17 = !this.f302429j.isEmpty();
        android.widget.TextView textView = this.f302428i;
        if (textView != null) {
            textView.setVisibility(z17 ? 0 : 8);
        }
        java.lang.String string = ((jx2.l) kVar).f302436a.getString(com.tencent.mm.R.string.f490507x1);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.widget.TextView textView2 = this.f302428i;
        if (textView2 != null) {
            textView2.setText(string);
        }
        android.widget.TextView textView3 = this.f302428i;
        if (textView3 != null) {
            textView3.setBackground(z17 ? context.getResources().getDrawable(com.tencent.mm.R.drawable.f481057jk) : context.getResources().getDrawable(com.tencent.mm.R.drawable.f481063jr));
        }
        android.widget.TextView textView4 = this.f302428i;
        if (textView4 != null) {
            textView4.setTextColor(context.getResources().getColor(z17 ? com.tencent.mm.R.color.BW_100 : com.tencent.mm.R.color.FG_0));
        }
    }
}
