package fi2;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f262834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f262835e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(fi2.x0 x0Var, zi2.w wVar) {
        super(0);
        this.f262834d = x0Var;
        this.f262835e = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f262834d.f262926d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zi2.w wVar = this.f262835e;
        return new dj2.e(context, wVar, wVar);
    }
}
