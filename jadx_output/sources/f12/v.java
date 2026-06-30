package f12;

/* loaded from: classes4.dex */
public final class v implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258673d;

    public v(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258673d = springLuckyEggActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258673d;
        f12.c0 c0Var = springLuckyEggActivity.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var.f258572a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int a17 = fp.j0.a(springLuckyEggActivity.getContext(), 0);
        androidx.appcompat.app.AppCompatActivity context = springLuckyEggActivity.getContext();
        f12.c0 c0Var2 = springLuckyEggActivity.f97440f;
        if (c0Var2 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        int c17 = i65.a.c(context, c0Var2.f258572a.getMeasuredHeight() + a17);
        if (c17 > 812) {
            f12.c0 c0Var3 = springLuckyEggActivity.f97440f;
            if (c0Var3 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c0Var3.f258582k.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = i65.a.b(springLuckyEggActivity.getContext(), ((c17 - gd1.l.CTRL_INDEX) / 2) + 94) - a17;
            f12.c0 c0Var4 = springLuckyEggActivity.f97440f;
            if (c0Var4 != null) {
                c0Var4.f258582k.requestLayout();
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }
    }
}
