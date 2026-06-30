package ss2;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f411925d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f411926e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f411927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        getIntent().getIntExtra("key_member_qa_type", 0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pzt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f411927f = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q0b);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f411925d = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.q0a);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f411926e = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.q0i);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        getContext().getWindow().getDecorView().setSystemUiVisibility(getContext().getWindow().getDecorView().getSystemUiVisibility() | 1024 | 256);
        android.view.View decorView = getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        com.tencent.mm.ui.r0.a(getActivity(), false);
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        float dimension = getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479623ay);
        int h17 = com.tencent.mm.ui.bl.h(getActivity());
        int b17 = a06.d.b(dimension + h17);
        android.view.View view = this.f411927f;
        if (view == null) {
            kotlin.jvm.internal.o.o("postActionaBar");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = b17;
        view.setLayoutParams(layoutParams);
        view.setPadding(0, h17, 0, 0);
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).getController().W0(getActivity(), getResources().getColor(com.tencent.mm.R.color.aaw));
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity2).setSelfNavigationBarVisible(8);
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity3).updataStatusBarIcon(com.tencent.mm.ui.bk.C());
        }
        if (isBelongFragment()) {
            android.view.View view2 = this.f411925d;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("closeIv");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f411926e;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("cancelTv");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = this.f411925d;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("closeIv");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f411926e;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("cancelTv");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = this.f411926e;
        if (view6 != null) {
            view6.setOnClickListener(new ss2.a(this));
        } else {
            kotlin.jvm.internal.o.o("cancelTv");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
