package he2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f280887a;

    /* renamed from: b, reason: collision with root package name */
    public int f280888b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f280889c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f280890d;

    public e(oa.i tab, int i17, yz5.a aVar) {
        android.view.View view;
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f280887a = tab;
        tab.f343778a = this;
        tab.c(com.tencent.mm.R.layout.apf);
        android.view.View view2 = tab.f343783f;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.nuw) : null;
        this.f280889c = textView;
        if (j65.f.f297943g > 1.0f && textView != null) {
            textView.setTextSize(15.0f);
        }
        android.view.View view3 = tab.f343783f;
        this.f280890d = view3 != null ? (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.nut) : null;
        if (aVar != null && (view = tab.f343783f) != null) {
            view.setOnClickListener(new he2.c(aVar));
        }
        oa.k kVar = tab.f343785h;
        oa.k kVar2 = kVar instanceof android.view.View ? kVar : null;
        if (kVar2 != null) {
            kVar2.setOnTouchListener(he2.d.f280886d);
        }
        b(com.tencent.mm.R.color.BW_100_Alpha_0_5);
        a(false);
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f280889c;
        if (textView != null) {
            if (z17) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }

    public final void b(int i17) {
        android.widget.TextView textView = this.f280889c;
        if (textView != null) {
            android.view.View view = this.f280887a.f343783f;
            kotlin.jvm.internal.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(i17));
        }
    }

    public final void c(boolean z17) {
        android.widget.ImageView imageView = this.f280890d;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z17 ? 0 : 8);
    }
}
