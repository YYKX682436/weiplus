package i33;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.c f288159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i33.c cVar) {
        super(0);
        this.f288159d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f288159d.T6().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        return (androidx.recyclerview.widget.GridLayoutManager) layoutManager;
    }
}
