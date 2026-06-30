package nj2;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nj2.z f337863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, nj2.z zVar) {
        super(0);
        this.f337862d = context;
        this.f337863e = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f337862d;
        nj2.z zVar = this.f337863e;
        gk2.e eVar = zVar.f337868h;
        android.view.View view = zVar.f337875r;
        if (view != null) {
            return new lj2.n(context, eVar, view.findViewById(com.tencent.mm.R.id.tmj), zVar.f337869i, zVar, null);
        }
        kotlin.jvm.internal.o.o("rootView");
        throw null;
    }
}
