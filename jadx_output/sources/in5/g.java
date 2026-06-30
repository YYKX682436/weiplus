package in5;

/* loaded from: classes2.dex */
public final class g extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f293048a;

    public g(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f293048a = recyclerView;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f293048a.hashCode();
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
