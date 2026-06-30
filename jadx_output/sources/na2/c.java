package na2;

/* loaded from: classes2.dex */
public final class c extends x92.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // x92.e, x92.r
    public void R6() {
        super.R6();
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.e9f);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(na2.a.f335952d);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getActivity().findViewById(com.tencent.mm.R.id.e9d);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new na2.b(this));
        }
    }

    @Override // x92.e
    public v92.g X6() {
        return new v92.g(getActivity());
    }

    @Override // x92.e
    public java.lang.String Y6() {
        return "";
    }
}
