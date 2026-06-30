package eb2;

/* loaded from: classes2.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f250806d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f250807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb2.m0 f250808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f250809g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f250810h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250811i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f250812m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ rn5.a f250813n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f250814o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ db2.v3 f250815p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e f250816q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f250817r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f250818s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(eb2.m0 m0Var, int i17, com.tencent.mm.protobuf.g gVar, java.util.List list, boolean z17, rn5.a aVar, com.tencent.mm.protobuf.g gVar2, db2.v3 v3Var, com.tencent.mm.plugin.finder.feed.model.e eVar, boolean z18, db2.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f250808f = m0Var;
        this.f250809g = i17;
        this.f250810h = gVar;
        this.f250811i = list;
        this.f250812m = z17;
        this.f250813n = aVar;
        this.f250814o = gVar2;
        this.f250815p = v3Var;
        this.f250816q = eVar;
        this.f250817r = z18;
        this.f250818s = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        eb2.l0 l0Var = new eb2.l0(this.f250808f, this.f250809g, this.f250810h, this.f250811i, this.f250812m, this.f250813n, this.f250814o, this.f250815p, this.f250816q, this.f250817r, this.f250818s, continuation);
        l0Var.f250807e = obj;
        return l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eb2.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f250806d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f250807e;
            eb2.m0 m0Var = this.f250808f;
            int i18 = this.f250809g;
            eb2.k0 k0Var = new eb2.k0(m0Var, i18, this.f250810h, this.f250811i, this.f250812m, this.f250813n, this.f250814o, this.f250815p, this.f250816q, this.f250817r, this.f250818s);
            m0Var.f250832t = i18;
            this.f250808f.f250831s = true;
            oz5.l f11582e = y0Var.getF11582e();
            int i19 = kotlinx.coroutines.r2.O0;
            gb2.d dVar = new gb2.d(k0Var, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), null, 4, null);
            this.f250806d = 1;
            z17 = false;
            j17 = ay1.l.j(dVar, false, this, 1, null);
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
            z17 = false;
        }
        this.f250808f.f250831s = z17;
        return jz5.f0.f302826a;
    }
}
