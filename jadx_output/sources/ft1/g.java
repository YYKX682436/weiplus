package ft1;

/* loaded from: classes8.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f266488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f266489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ft1.j f266490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xg3.t f266491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, ft1.j jVar, xg3.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266489e = j17;
        this.f266490f = jVar;
        this.f266491g = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ft1.g(this.f266489e, this.f266490f, this.f266491g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ft1.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        com.tencent.mm.protobuf.g gVar;
        java.util.LinkedList<r45.yx6> linkedList;
        com.tencent.mm.protobuf.g gVar2;
        java.util.LinkedList linkedList2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f266488d;
        xg3.t tVar = this.f266491g;
        ft1.j jVar = this.f266490f;
        long j17 = this.f266489e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (j17 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "getVerifyRecordHistory: version is 0, reset all fetched flag");
                    jVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "resetAllFetchedFlag");
                    ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) jVar.f266495e).getValue()).putBoolean("all_history_fetched", false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "getVerifyRecordHistory, version: " + j17);
                r45.ar3 ar3Var = new r45.ar3();
                ar3Var.f370230d = j17;
                com.tencent.mm.modelbase.i b18 = ar3Var.b();
                this.f266488d = 1;
                b17 = rm0.h.b(b18, this);
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                b17 = obj;
            }
            com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) b17;
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "getVerifyRecordHistory: " + fVar);
            if (fVar.b()) {
                r45.br3 br3Var = (r45.br3) fVar.f70618d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get verifyRecord ");
                sb6.append((br3Var == null || (linkedList2 = br3Var.f371003d) == null) ? null : new java.lang.Integer(linkedList2.size()));
                sb6.append(", has_more: ");
                sb6.append(br3Var != null ? java.lang.Boolean.valueOf(br3Var.f371004e) : null);
                sb6.append(" sync_key_buff: ");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.l((br3Var == null || (gVar2 = br3Var.f371005f) == null) ? null : gVar2.f192156a));
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", sb6.toString());
                if (br3Var != null && (linkedList = br3Var.f371003d) != null) {
                    for (r45.yx6 yx6Var : linkedList) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("VerifyRecord: ");
                        kotlin.jvm.internal.o.d(yx6Var);
                        sb7.append(ft1.k.b(yx6Var));
                        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", sb7.toString());
                        java.util.LinkedList<r45.mx6> linkedList3 = yx6Var.f391483f;
                        if (linkedList3 != null) {
                            for (r45.mx6 mx6Var : linkedList3) {
                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                sb8.append("VerifyMsg: ");
                                kotlin.jvm.internal.o.d(mx6Var);
                                sb8.append(ft1.k.a(mx6Var));
                                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", sb8.toString());
                            }
                        }
                        ft1.j.wi(jVar, yx6Var);
                    }
                }
                ft1.j.Ai(jVar, (br3Var == null || (gVar = br3Var.f371005f) == null) ? null : gVar.f192156a);
                boolean z17 = br3Var != null ? br3Var.f371004e : false;
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "getVerifyRecordHistory: all fetched, persist to MMKV");
                    ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) jVar.f266495e).getValue()).putBoolean("all_history_fetched", true);
                }
                if (tVar != null) {
                    boolean z18 = z17;
                    int i18 = fVar.f70615a;
                    int i19 = fVar.f70616b;
                    java.lang.String str = fVar.f70617c;
                    if (str == null) {
                        str = "";
                    }
                    tVar.a(z18, i18, i19, str);
                }
            } else if (tVar != null) {
                int i27 = fVar.f70615a;
                int i28 = fVar.f70616b;
                java.lang.String str2 = fVar.f70617c;
                if (str2 == null) {
                    str2 = "request failed";
                }
                tVar.a(true, i27, i28, str2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddFriendVerifyRecordService", e17, "getVerifyRecordHistory error, version: " + j17, new java.lang.Object[0]);
            if (tVar != null) {
                java.lang.String message = e17.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                tVar.a(true, -1, -1, message);
            }
        }
        return jz5.f0.f302826a;
    }
}
