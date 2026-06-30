package ht3;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ht3.m f284954a = new ht3.m();

    public final float a(android.content.Context context, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
    }

    public final void b(android.view.View view, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(view, "view");
        switch (i17) {
            case -16777216:
                i18 = com.tencent.mm.R.string.f489954gj;
                break;
            case -16535286:
            case -16268960:
                i18 = com.tencent.mm.R.string.f489957gm;
                break;
            case -15683841:
            case -15172610:
                i18 = com.tencent.mm.R.string.f489955gk;
                break;
            case -10197008:
            case -7054596:
                i18 = com.tencent.mm.R.string.f489962gr;
                break;
            case -707825:
            case -372399:
                i18 = com.tencent.mm.R.string.f489963gs;
                break;
            case -17592:
            case -15616:
                i18 = com.tencent.mm.R.string.f489965gu;
                break;
            case -1:
                i18 = com.tencent.mm.R.string.f489964gt;
                break;
            case 99:
                i18 = com.tencent.mm.R.string.f489958gn;
                break;
            case 100:
                i18 = com.tencent.mm.R.string.f489961gq;
                break;
            default:
                return;
        }
        java.lang.String r17 = i65.a.r(view.getContext(), com.tencent.mm.R.string.f489959go);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{i65.a.r(view.getContext(), i18)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        view.setContentDescription(format);
    }

    public final void c(android.view.View view, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "<this>");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        float f17 = i17;
        int a17 = (int) a(context, f17);
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        int a18 = (int) a(context2, f17);
        android.content.Context context3 = view.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        int a19 = (int) a(context3, f17);
        android.content.Context context4 = view.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        view.setPadding(a17, a19, a18, (int) a(context4, f17));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.content.Context context5 = view.getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        float f18 = i19;
        layoutParams.width = (int) a(context5, f18);
        android.content.Context context6 = view.getContext();
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        layoutParams.height = (int) a(context6, f18);
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            android.content.Context context7 = view.getContext();
            kotlin.jvm.internal.o.f(context7, "getContext(...)");
            float f19 = i18;
            layoutParams2.leftMargin = (int) a(context7, f19);
            android.content.Context context8 = view.getContext();
            kotlin.jvm.internal.o.f(context8, "getContext(...)");
            layoutParams2.rightMargin = (int) a(context8, f19);
        }
        view.setLayoutParams(layoutParams);
    }
}
