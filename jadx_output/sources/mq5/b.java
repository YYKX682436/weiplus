package mq5;

/* loaded from: classes15.dex */
public final class b extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wepicker.view.SmoothCalendarLayoutManager f330811n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.wepicker.view.SmoothCalendarLayoutManager smoothCalendarLayoutManager, android.content.Context context) {
        super(context);
        this.f330811n = smoothCalendarLayoutManager;
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return this.f330811n.f214346v / displayMetrics.densityDpi;
    }
}
