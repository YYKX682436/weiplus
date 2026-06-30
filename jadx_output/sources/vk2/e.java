package vk2;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vk2.h f437759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, vk2.h hVar) {
        super(0);
        this.f437758d = context;
        this.f437759e = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f437758d;
        int b17 = i65.a.b(context, 400);
        vk2.h hVar = this.f437759e;
        androidx.recyclerview.widget.RecyclerView recyclerView = hVar.f437764m;
        if (recyclerView != null) {
            return new wk2.j(context, b17, recyclerView, hVar.f437767p, hVar.f437762h);
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }
}
