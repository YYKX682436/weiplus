package y22;

/* loaded from: classes10.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f459105a = {-1, -16777216, -314573, -12493, -4920114, -4724993, -144437};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f459106b = {-16777216, -1, -15616, -2724096, -16339626, -15954996, -298125};

    public static final int a(int i17) {
        int V = kz5.z.V(f459105a, i17);
        if (V < 0) {
            return -16777216;
        }
        return f459106b[V];
    }

    public static final int b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        return view.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0);
    }

    public static final int c(android.view.View view) {
        int i17;
        kotlin.jvm.internal.o.g(view, "<this>");
        android.content.res.Resources resources = view.getContext().getResources();
        android.content.Context context = view.getContext();
        if (context == null) {
            i17 = 0;
        } else {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478288fs, typedValue, true);
            i17 = typedValue.resourceId;
        }
        return resources.getColor(i17);
    }

    public static final void d(android.widget.ImageView imageView, int i17, int i18) {
        kotlin.jvm.internal.o.g(imageView, "<this>");
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), i17, i18));
    }
}
