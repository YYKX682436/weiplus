package fi2;

/* loaded from: classes10.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f262881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f262882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(fi2.x0 x0Var, zi2.w wVar) {
        super(0);
        this.f262881d = x0Var;
        this.f262882e = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f262881d.f262926d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zi2.w wVar = this.f262882e;
        return new dj2.g(context, wVar, wVar);
    }
}
