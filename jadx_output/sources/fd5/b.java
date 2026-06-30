package fd5;

/* loaded from: classes10.dex */
public final class b extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f261338n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f261339o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, boolean z17, androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(context);
        this.f261338n = z17;
        this.f261339o = recyclerView;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void d() {
        super.d();
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return 25.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        if (!this.f261338n) {
            return 50;
        }
        android.view.ViewParent viewParent = this.f261339o;
        return (viewParent instanceof com.tencent.mm.pluginsdk.ui.tools.z3 ? ((com.tencent.mm.pluginsdk.ui.tools.z3) viewParent).getF191442e2() : 0) > 0 ? 110 : 50;
    }

    @Override // androidx.recyclerview.widget.o1
    public int n() {
        int n17 = super.n();
        if (this.f261338n) {
            return 1;
        }
        return n17;
    }
}
