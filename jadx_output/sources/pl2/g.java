package pl2;

/* loaded from: classes3.dex */
public final class g implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pl2.l f356625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356626b;

    public g(pl2.l lVar, pl2.s sVar) {
        this.f356625a = lVar;
        this.f356626b = sVar;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        pm0.v.X(new pl2.f(recyclerView, this.f356625a, this.f356626b));
    }
}
