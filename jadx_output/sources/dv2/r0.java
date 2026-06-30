package dv2;

/* loaded from: classes2.dex */
public final class r0 extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f243938l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f243939m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f243940n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(dv2.t0 t0Var, java.lang.String title, int i17) {
        super("");
        kotlin.jvm.internal.o.g(title, "title");
        this.f243938l = title;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        this.f243939m = viewGroup;
        if (viewGroup != null) {
            java.lang.String str = this.f243938l;
            viewGroup.setContentDescription(str);
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.qqf);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById;
            this.f243940n = textView;
            textView.setText(str);
            android.widget.TextView textView2 = this.f243940n;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.f243940n;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.widget.TextView textView4 = this.f243940n;
            if (textView4 != null) {
                com.tencent.mm.ui.fk.c(textView4);
            } else {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (z17) {
            android.widget.TextView textView = this.f243940n;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c));
            android.widget.TextView textView2 = this.f243940n;
            if (textView2 != null) {
                com.tencent.mm.ui.fk.a(textView2);
                return;
            } else {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.f243940n;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
        android.widget.TextView textView4 = this.f243940n;
        if (textView4 != null) {
            com.tencent.mm.ui.fk.c(textView4);
        } else {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        android.view.View view = this.f243939m;
        return view == null ? this.f477052j : view;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        android.view.View view = this.f243939m;
        return view == null ? this.f477052j : view;
    }
}
