package z32;

/* loaded from: classes12.dex */
public final class s extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469935d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469936e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rq3 f469937f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f469938g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ed6 f469939h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f469938g = new java.util.LinkedList();
    }

    public final void O6(android.widget.TextView textView, float f17) {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }
}
