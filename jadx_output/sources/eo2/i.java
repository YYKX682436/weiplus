package eo2;

/* loaded from: classes2.dex */
public class i extends eo2.j {

    /* renamed from: e, reason: collision with root package name */
    public v92.g f255570e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f255571f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f255572g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f255573h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f255574i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f255575m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f255576n;

    /* renamed from: o, reason: collision with root package name */
    public final int f255577o;

    /* renamed from: p, reason: collision with root package name */
    public int f255578p;

    /* renamed from: q, reason: collision with root package name */
    public final int f255579q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f255577o = getActivity().getResources().getColor(com.tencent.mm.R.color.a9e);
        this.f255578p = getActivity().getResources().getColor(com.tencent.mm.R.color.f478979mi);
        this.f255579q = i65.a.b(getContext(), 72);
    }

    @Override // eo2.j
    public void P6() {
        this.f255571f = (android.widget.FrameLayout) getActivity().findViewById(com.tencent.mm.R.id.f485878jf4);
        this.f255572g = getActivity().findViewById(com.tencent.mm.R.id.jfw);
        this.f255575m = (android.widget.FrameLayout) getActivity().findViewById(com.tencent.mm.R.id.jfx);
        this.f255576n = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.f482547hd);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getActivity().findViewById(com.tencent.mm.R.id.e9d);
        android.widget.LinearLayout linearLayout2 = null;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new eo2.g(this));
        } else {
            linearLayout = null;
        }
        this.f255573h = linearLayout;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) getActivity().findViewById(com.tencent.mm.R.id.jf7);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new eo2.h(this));
            linearLayout2 = linearLayout3;
        }
        this.f255574i = linearLayout2;
        this.f255578p = getActivity().getResources().getColor(com.tencent.mm.R.color.f478489a);
        android.widget.TextView textView = this.f255576n;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        }
    }

    @Override // eo2.j
    public void T6(com.tencent.mm.protobuf.f fVar) {
        this.f255580d = fVar;
        android.widget.TextView textView = this.f255576n;
        if (textView == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.lang.String X6 = X6();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, X6));
    }

    public final void V6(float f17, float f18) {
        if (f17 < 0.5d) {
            Y6(this.f255576n, 4);
        } else {
            Y6(this.f255576n, 0);
        }
        android.widget.LinearLayout linearLayout = this.f255573h;
        if (linearLayout != null) {
            linearLayout.setAlpha(f18);
        }
        android.widget.LinearLayout linearLayout2 = this.f255574i;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setAlpha(f18);
    }

    public v92.g W6() {
        return new fo2.e(getActivity(), "");
    }

    public java.lang.String X6() {
        return "";
    }

    public final void Y6(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/MemberActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/member/MemberActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // eo2.j, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            hc2.i.e(mMActivity, false);
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        hc2.i.a((com.tencent.mm.ui.MMActivity) activity2, this.f255572g, this.f255571f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f255577o = getActivity().getResources().getColor(com.tencent.mm.R.color.a9e);
        this.f255578p = getActivity().getResources().getColor(com.tencent.mm.R.color.f478979mi);
        this.f255579q = i65.a.b(getContext(), 72);
    }
}
