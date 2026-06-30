package dv2;

/* loaded from: classes2.dex */
public final class l extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f243884l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f243885m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f243886n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dv2.v vVar, java.lang.String titleText) {
        super("");
        kotlin.jvm.internal.o.g(titleText, "titleText");
        this.f243884l = titleText;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        this.f243885m = viewGroup;
        if (viewGroup != null) {
            java.lang.String str = this.f243884l;
            viewGroup.setContentDescription(str);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.qqf);
            this.f243886n = textView;
            if (textView != null) {
                textView.setText(str);
            }
            android.widget.TextView textView2 = this.f243886n;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f243886n;
            if (textView3 != null) {
                textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            android.widget.TextView textView4 = this.f243886n;
            if (textView4 != null) {
                com.tencent.mm.ui.fk.c(textView4);
            }
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (z17) {
            android.widget.TextView textView = this.f243886n;
            if (textView != null) {
                textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c));
            }
            android.widget.TextView textView2 = this.f243886n;
            if (textView2 != null) {
                com.tencent.mm.ui.fk.a(textView2);
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.f243886n;
        if (textView3 != null) {
            textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
        android.widget.TextView textView4 = this.f243886n;
        if (textView4 != null) {
            com.tencent.mm.ui.fk.c(textView4);
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        android.view.View view = this.f243885m;
        return view == null ? this.f477052j : view;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        android.view.View view = this.f243885m;
        return view == null ? this.f477052j : view;
    }
}
