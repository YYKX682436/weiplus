package qg5;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f363180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f363181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qg5.r f363182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f363183h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f363184i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f363185m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f363186n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f363187o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qg5.l0 l0Var, java.util.List list, qg5.r rVar, boolean z17, boolean z18, boolean z19, boolean z27, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363180e = l0Var;
        this.f363181f = list;
        this.f363182g = rVar;
        this.f363183h = z17;
        this.f363184i = z18;
        this.f363185m = z19;
        this.f363186n = z27;
        this.f363187o = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qg5.t(this.f363180e, this.f363181f, this.f363182g, this.f363183h, this.f363184i, this.f363185m, this.f363186n, this.f363187o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363179d;
        qg5.r rVar = this.f363182g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oy.j jVar = (oy.j) ((jz5.n) this.f363180e.f363056r).getValue();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.util.List list = this.f363181f;
            com.tencent.mm.storage.z3 z3Var = rVar.f363151b;
            boolean z17 = this.f363183h;
            boolean z18 = this.f363184i;
            boolean z19 = this.f363185m;
            boolean z27 = this.f363186n;
            int i18 = this.f363187o;
            this.f363179d = 1;
            obj = ((te5.l1) jVar).mj(context, list, z3Var, z17, z18, z19, z27, i18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list2 = (java.util.List) obj;
        if (list2.size() != rVar.f363152c.size()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRecordsStagingFeatureService", "PlainText list size mismatch, plainTextListSize=" + list2.size() + ", recordSize=" + rVar.f363152c.size());
        }
        for (jz5.l lVar : kz5.n0.a1(list2, rVar.f363152c)) {
            ((kotlinx.coroutines.a0) ((c01.ob) lVar.f302834e).f37375c).U((java.lang.String) lVar.f302833d);
        }
        return jz5.f0.f302826a;
    }
}
