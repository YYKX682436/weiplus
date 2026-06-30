package ee5;

/* loaded from: classes9.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251860d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f251861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.h0 f251862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251863g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ee5.h0 h0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251862f = h0Var;
        this.f251863g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.e0 e0Var = new ee5.e0(this.f251862f, this.f251863g, continuation);
        e0Var.f251861e = obj;
        return e0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ee5.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251860d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f251861e;
            bm5.t0 t0Var = bm5.t0.f22738a;
            if (!t0Var.a() || !t0Var.b()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
            } else if (aq.o.f12922c == null) {
                aq.o.f12922c = new aq.n();
                com.tencent.mm.storage.s8.f195314a.a();
            }
            ee5.h0 h0Var = this.f251862f;
            ce5.d dVar = h0Var.f251911w;
            java.lang.String currentRoomId = h0Var.f251895d;
            aq.c queryType = h0Var.f251910v;
            dVar.getClass();
            java.lang.String queryText = this.f251863g;
            kotlin.jvm.internal.o.g(queryText, "queryText");
            kotlin.jvm.internal.o.g(currentRoomId, "currentRoomId");
            kotlin.jvm.internal.o.g(queryType, "queryType");
            com.tencent.mars.xlog.Log.i("MicroMsg.LoadMoreImageDataModel", "getLoadMoreDataFlow >> " + queryText + ", " + currentRoomId + ", " + queryType);
            dVar.f40812a = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
            dVar.f40814c = kotlinx.coroutines.l.d(dVar.f40813b, kotlinx.coroutines.q1.f310570c, null, new ce5.c(queryText, dVar, currentRoomId, queryType, null), 2, null);
            kotlinx.coroutines.flow.i2 i2Var = dVar.f40812a;
            kotlin.jvm.internal.o.d(i2Var);
            ee5.d0 d0Var = new ee5.d0(h0Var, y0Var);
            this.f251860d = 1;
            if (kotlinx.coroutines.flow.q2.l((kotlinx.coroutines.flow.q2) i2Var, d0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
