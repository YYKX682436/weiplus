package on2;

/* loaded from: classes3.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f346989d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f346990e;

    /* renamed from: f, reason: collision with root package name */
    public int f346991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f346992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f346993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f346994i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f346995m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r45.dz1 dz1Var, on2.a2 a2Var, android.content.Context context, on2.j1 j1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f346992g = dz1Var;
        this.f346993h = a2Var;
        this.f346994i = context;
        this.f346995m = j1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new on2.q1(this.f346992g, this.f346993h, this.f346994i, this.f346995m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on2.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
