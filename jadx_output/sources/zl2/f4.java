package zl2;

/* loaded from: classes3.dex */
public final class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f473768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f473769f;

    public f4(java.lang.String str, android.view.View view, boolean z17) {
        this.f473767d = str;
        this.f473768e = view;
        this.f473769f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        android.view.View view = this.f473768e;
        java.lang.String str2 = this.f473767d;
        if (str2 != null) {
            kotlin.jvm.internal.o.g(view, "<this>");
            try {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getResourceEntryName(view.getId());
                kotlin.jvm.internal.o.d(str);
            } catch (java.lang.Exception unused) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i(str2, "[withOutScale] View:".concat(str));
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int s07 = (int) r4Var.s0(context, view.getPaddingLeft());
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        int s08 = (int) r4Var.s0(context2, view.getPaddingRight());
        android.content.Context context3 = view.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        int s09 = (int) r4Var.s0(context3, view.getPaddingTop());
        android.content.Context context4 = view.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        view.setPadding(s07, s09, s08, (int) r4Var.s0(context4, view.getPaddingBottom()));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width > 0) {
            android.content.Context context5 = view.getContext();
            kotlin.jvm.internal.o.f(context5, "getContext(...)");
            layoutParams.width = (int) r4Var.s0(context5, layoutParams.width);
        }
        if (layoutParams.height > 0) {
            android.content.Context context6 = view.getContext();
            kotlin.jvm.internal.o.f(context6, "getContext(...)");
            layoutParams.height = (int) r4Var.s0(context6, layoutParams.height);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context context7 = view.getContext();
            kotlin.jvm.internal.o.f(context7, "getContext(...)");
            marginLayoutParams.leftMargin = (int) r4Var.s0(context7, marginLayoutParams.leftMargin);
            android.content.Context context8 = view.getContext();
            kotlin.jvm.internal.o.f(context8, "getContext(...)");
            marginLayoutParams.rightMargin = (int) r4Var.s0(context8, marginLayoutParams.rightMargin);
            android.content.Context context9 = view.getContext();
            kotlin.jvm.internal.o.f(context9, "getContext(...)");
            marginLayoutParams.topMargin = (int) r4Var.s0(context9, marginLayoutParams.topMargin);
            android.content.Context context10 = view.getContext();
            kotlin.jvm.internal.o.f(context10, "getContext(...)");
            marginLayoutParams.bottomMargin = (int) r4Var.s0(context10, marginLayoutParams.bottomMargin);
        }
        if (!this.f473769f && (view instanceof android.widget.TextView)) {
            ((android.widget.TextView) view).setTextSize(0, ((android.widget.TextView) view).getTextSize() / i65.a.q(((android.widget.TextView) view).getContext()));
        }
        view.setLayoutParams(layoutParams);
    }
}
