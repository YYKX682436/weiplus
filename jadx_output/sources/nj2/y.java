package nj2;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nj2.z f337867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, nj2.z zVar) {
        super(0);
        this.f337866d = context;
        this.f337867e = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f337866d;
        nj2.z zVar = this.f337867e;
        gk2.e eVar = zVar.f337868h;
        android.view.View view = zVar.f337875r;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.qy8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new mj2.m(context, zVar, eVar, findViewById, zVar.f337869i, zVar.f337870m, new nj2.x(zVar));
    }
}
