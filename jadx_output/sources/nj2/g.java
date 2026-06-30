package nj2;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nj2.h f337834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, nj2.h hVar) {
        super(0);
        this.f337833d = context;
        this.f337834e = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f337833d;
        nj2.h hVar = this.f337834e;
        gk2.e eVar = hVar.H;
        android.view.View view = hVar.R;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.qy8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new mj2.f(context, hVar, eVar, findViewById, hVar.I, hVar.f337835J, null, 64, null);
    }
}
