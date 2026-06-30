package fk2;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gj1 f263530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(android.content.Context context, r45.gj1 gj1Var) {
        super(3);
        this.f263529d = context;
        this.f263530e = gj1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.pluginsdk.ui.span.f0 finallyMsg = (com.tencent.mm.pluginsdk.ui.span.f0) obj;
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(finallyMsg, "finallyMsg");
        fk2.a2.f263309n.a(this.f263529d, this.f263530e, finallyMsg);
        return jz5.f0.f302826a;
    }
}
