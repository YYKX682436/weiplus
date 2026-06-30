package wo2;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f448115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f448116b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f448117c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f448118d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f448119e;

    public q(oa.i tab, int i17) {
        android.widget.ImageView imageView;
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f448115a = tab;
        this.f448116b = i17;
        jz5.g b17 = jz5.h.b(new wo2.o(this));
        jz5.g b18 = jz5.h.b(new wo2.p(this));
        tab.f343778a = this;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (displayMetrics.density * 15.0f) / context.getResources().getDisplayMetrics().density;
        if (i17 != 1006) {
            switch (i17) {
                case 1001:
                    tab.c(com.tencent.mm.R.layout.c6d);
                    android.widget.TextView textView = ((ap2.b) ((jz5.n) b17).getValue()).f12778c;
                    kotlin.jvm.internal.o.d(textView);
                    this.f448117c = textView;
                    android.widget.ImageView imageView2 = ((ap2.b) ((jz5.n) b17).getValue()).f12777b;
                    kotlin.jvm.internal.o.d(imageView2);
                    this.f448119e = imageView2;
                    imageView2.setImageResource(com.tencent.mm.R.raw.finder_live_icon);
                    textView.setTextSize(1, f17);
                    return;
                case 1002:
                    break;
                case 1003:
                    tab.c(com.tencent.mm.R.layout.c6e);
                    ap2.c cVar = (ap2.c) ((jz5.n) b18).getValue();
                    android.widget.TextView textView2 = cVar != null ? cVar.f12781c : null;
                    kotlin.jvm.internal.o.d(textView2);
                    this.f448117c = textView2;
                    textView2.setTextSize(1, f17);
                    ap2.c cVar2 = (ap2.c) ((jz5.n) b18).getValue();
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = cVar2 != null ? cVar2.f12782d : null;
                    kotlin.jvm.internal.o.d(weImageView);
                    this.f448118d = weImageView;
                    ap2.c cVar3 = (ap2.c) ((jz5.n) b18).getValue();
                    imageView = cVar3 != null ? cVar3.f12780b : null;
                    kotlin.jvm.internal.o.d(imageView);
                    this.f448119e = imageView;
                    if (((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).wi()) {
                        weImageView.setVisibility(4);
                        return;
                    } else {
                        weImageView.setVisibility(0);
                        return;
                    }
                default:
                    tab.c(com.tencent.mm.R.layout.aka);
                    return;
            }
        }
        tab.c(com.tencent.mm.R.layout.c6d);
        ap2.b bVar = (ap2.b) ((jz5.n) b17).getValue();
        android.widget.TextView textView3 = bVar != null ? bVar.f12778c : null;
        kotlin.jvm.internal.o.d(textView3);
        this.f448117c = textView3;
        ap2.b bVar2 = (ap2.b) ((jz5.n) b17).getValue();
        imageView = bVar2 != null ? bVar2.f12777b : null;
        kotlin.jvm.internal.o.d(imageView);
        this.f448119e = imageView;
        textView3.setTextSize(1, f17);
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f448117c;
        if (textView != null) {
            if (z17) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }
}
