package qv4;

/* loaded from: classes12.dex */
public final class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f366972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qv4.j f366973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f366974f;

    public g(androidx.recyclerview.widget.RecyclerView recyclerView, qv4.j jVar, android.view.ViewGroup viewGroup) {
        this.f366972d = recyclerView;
        this.f366973e = jVar;
        this.f366974f = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f366972d;
        boolean z17 = recyclerView.computeVerticalScrollRange() > recyclerView.getHeight();
        qv4.j jVar = this.f366973e;
        boolean z18 = jVar.f().g().f400562c;
        android.view.ViewGroup viewGroup = this.f366974f;
        if (viewGroup != null) {
            viewGroup.setVisibility(z17 ? 8 : 0);
        }
        jVar.f().g().f400562c = z17;
        if (z18 != z17) {
            jVar.f().j();
        }
    }
}
