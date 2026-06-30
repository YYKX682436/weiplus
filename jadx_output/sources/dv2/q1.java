package dv2;

/* loaded from: classes2.dex */
public final class q1 extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f243932l;

    /* renamed from: m, reason: collision with root package name */
    public final int f243933m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f243934n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f243935o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ dv2.s1 f243936p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(dv2.s1 s1Var, java.lang.String title, int i17) {
        super("");
        kotlin.jvm.internal.o.g(title, "title");
        this.f243936p = s1Var;
        this.f243932l = title;
        this.f243933m = i17;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        this.f243934n = viewGroup;
        if (viewGroup != null) {
            java.lang.String str = this.f243932l;
            viewGroup.setContentDescription(str);
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.qqf);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById;
            this.f243935o = textView;
            textView.setText(str);
            android.widget.TextView textView2 = this.f243935o;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.f243935o;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.widget.TextView textView4 = this.f243935o;
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
        if (!z17) {
            android.widget.TextView textView = this.f243935o;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.widget.TextView textView2 = this.f243935o;
            if (textView2 != null) {
                com.tencent.mm.ui.fk.c(textView2);
                return;
            } else {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f243936p.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.getIntent().putExtra("KEY_MIX_SEARCH_CUR_TAB", this.f243933m);
        android.widget.TextView textView3 = this.f243935o;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c));
        android.widget.TextView textView4 = this.f243935o;
        if (textView4 != null) {
            com.tencent.mm.ui.fk.a(textView4);
        } else {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        android.view.View view = this.f243934n;
        return view == null ? this.f477052j : view;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        android.view.View view = this.f243934n;
        return view == null ? this.f477052j : view;
    }
}
