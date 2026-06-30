package j00;

/* loaded from: classes9.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f296949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j00.k1 k1Var, android.content.Context context) {
        super(3);
        this.f296948d = k1Var;
        this.f296949e = context;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.Map enrichedParams = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(enrichedParams, "enrichedParams");
        kotlin.jvm.internal.o.g((bw5.bf0) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g((bw5.ph0) obj3, "<anonymous parameter 2>");
        j00.y yVar = j00.y.f296946a;
        kotlinx.coroutines.l.d(j00.y.f296947b, null, null, new j00.x("ecs_gift_reveal_blind_gift", enrichedParams, j00.k1.Ai(this.f296948d, this.f296949e), null, null), 3, null);
        return jz5.f0.f302826a;
    }
}
