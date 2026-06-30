package in5;

/* loaded from: classes2.dex */
public final class m extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f293090a;

    public m(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f293090a = recyclerView;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f293090a.hashCode();
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
