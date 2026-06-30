package fi2;

/* loaded from: classes10.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f262883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f262884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(fi2.x0 x0Var, zi2.w wVar) {
        super(0);
        this.f262883d = x0Var;
        this.f262884e = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fi2.x0 x0Var = this.f262883d;
        android.content.Context context = x0Var.f262926d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new lj2.k(context, x0Var.f262927e.findViewById(com.tencent.mm.R.id.tmi), this.f262884e);
    }
}
