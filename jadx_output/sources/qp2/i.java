package qp2;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f365784a;

    /* renamed from: b, reason: collision with root package name */
    public int f365785b;

    /* renamed from: c, reason: collision with root package name */
    public int f365786c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f365787d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f365788e;

    public i(oa.i tab, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f365784a = tab;
        jz5.g b17 = jz5.h.b(new qp2.h(this));
        tab.f343778a = this;
        tab.c(com.tencent.mm.R.layout.f489346c75);
        android.widget.TextView textView = ((ap2.d) ((jz5.n) b17).getValue()).f12785c;
        this.f365787d = textView;
        if (textView != null) {
            android.view.View view = tab.f343783f;
            kotlin.jvm.internal.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(z17 ? com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode : com.tencent.mm.R.color.f478873jj));
        }
        android.widget.ImageView imageView = ((ap2.d) ((jz5.n) b17).getValue()).f12784b;
        this.f365788e = imageView;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.raw.finder_live_icon);
        }
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f365787d;
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
