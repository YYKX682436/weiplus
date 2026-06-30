package dv2;

/* loaded from: classes2.dex */
public final class u1 extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f243956l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f243957m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ dv2.w1 f243958n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(dv2.w1 w1Var, java.lang.String title) {
        super("");
        kotlin.jvm.internal.o.g(title, "title");
        this.f243958n = w1Var;
        this.f243956l = title;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        java.lang.String str = this.f243956l;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f477050h = str;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.qqf);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById;
            this.f243957m = textView;
            textView.setText(str);
            android.widget.TextView textView2 = this.f243957m;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.f243957m;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.widget.TextView textView4 = this.f243957m;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            com.tencent.mm.ui.fk.c(textView4);
            android.widget.TextView textView5 = this.f243957m;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView5.setTextSize(0, viewGroup.getResources().getDimension(com.tencent.mm.R.dimen.f479674cb));
            viewGroup.setPadding(viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0, viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.an6);
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.d0q);
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (!z17) {
            android.widget.TextView textView = this.f243957m;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.widget.TextView textView2 = this.f243957m;
            if (textView2 != null) {
                com.tencent.mm.ui.fk.c(textView2);
                return;
            } else {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f243958n.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.getIntent().putExtra("KEY_MIX_SEARCH_HISTORY_SUB_TAB", 8);
        android.widget.TextView textView3 = this.f243957m;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c));
        android.widget.TextView textView4 = this.f243957m;
        if (textView4 != null) {
            com.tencent.mm.ui.fk.a(textView4);
        } else {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        return null;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        return null;
    }
}
