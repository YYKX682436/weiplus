package du0;

/* loaded from: classes5.dex */
public final class b1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final float f243328d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f243329e;

    /* renamed from: f, reason: collision with root package name */
    public du0.w0 f243330f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f243331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243328d = j65.q.a(getContext()).getDimension(com.tencent.mm.R.dimen.f479706d1);
        this.f243329e = jz5.h.b(new du0.y0(activity));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dvg, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s9t);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s9s);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rwt);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rws);
        textView.setText(j65.q.a(inflate.getContext()).getString(com.tencent.mm.R.string.o89));
        textView2.setText(j65.q.a(inflate.getContext()).getString(com.tencent.mm.R.string.o88));
        textView3.setText(j65.q.a(inflate.getContext()).getString(com.tencent.mm.R.string.o86));
        textView4.setText(j65.q.a(inflate.getContext()).getString(com.tencent.mm.R.string.o87));
        textView3.setOnClickListener(new du0.z0(this));
        textView4.setOnClickListener(new du0.a1(this));
        this.f243331g = inflate;
    }

    public final void O6() {
        android.view.View view = this.f243331g;
        if (view.getParent() == null) {
            return;
        }
        android.view.View view2 = this.f243331g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/common/uic/MusicRecommendedUseUIC", "disAppearView$plugin_mj_template_release", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/common/uic/MusicRecommendedUseUIC", "disAppearView$plugin_mj_template_release", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationY(0.0f);
        view.animate().translationY(this.f243328d).alpha(0.0f).setDuration(200L).withEndAction(new du0.x0(this)).start();
        du0.w0 w0Var = this.f243330f;
        if (w0Var != null) {
            ((gx0.e6) w0Var).a(false);
        }
    }
}
