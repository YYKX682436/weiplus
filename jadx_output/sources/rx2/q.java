package rx2;

/* loaded from: classes10.dex */
public final class q extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f400991n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, android.content.Context context) {
        super(context);
        this.f400991n = finderLinearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        int i17;
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = this.f400991n;
        finderLinearLayoutManager.getClass();
        float f17 = finderLinearLayoutManager.f132640y;
        if (f17 > 0.0f) {
            i17 = displayMetrics.heightPixels;
        } else {
            f17 = finderLinearLayoutManager.f132639x;
            i17 = displayMetrics.densityDpi;
        }
        return f17 / i17;
    }
}
