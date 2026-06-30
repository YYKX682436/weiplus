package cw2;

/* loaded from: classes10.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.w4 f224040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f224041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(cw2.w4 w4Var, yz5.a aVar) {
        super(3);
        this.f224040d = w4Var;
        this.f224041e = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        kk4.b player = this.f224040d.f224084a.getPlayer();
        if (player != null) {
            kk4.b.i(player, false, false, 2, null);
        }
        this.f224041e.invoke();
        return jz5.f0.f302826a;
    }
}
