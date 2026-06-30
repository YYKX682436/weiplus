package n34;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f334657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f334658f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334659g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334660h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n34.p f334661i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334662m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f334663n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, long j17, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, n34.p pVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334657e = i17;
        this.f334658f = j17;
        this.f334659g = str;
        this.f334660h = snsInfo;
        this.f334661i = pVar;
        this.f334662m = u3Var;
        this.f334663n = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        n34.l lVar = new n34.l(this.f334657e, this.f334658f, this.f334659g, this.f334660h, this.f334661i, this.f334662m, this.f334663n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        java.lang.Object invokeSuspend = ((n34.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f334660h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f334656d;
        int i18 = this.f334657e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.model.n6 n6Var = com.tencent.mm.plugin.sns.model.n6.f164514a;
            this.f334656d = 1;
            a17 = n6Var.a(i18, this.f334658f, this);
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        r45.ja6 ja6Var = (r45.ja6) a17;
        n34.p pVar = this.f334661i;
        java.lang.String str = this.f334659g;
        if (ja6Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CommentDetailStarHelper", "change star success " + str + ", " + i18);
            try {
                com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) parseFrom;
                snsObject.InTopList = i18 == 1 ? 1 : 0;
                snsInfo.field_attrBuf = snsObject.toByteArray();
                pVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarClickCallback", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
                n34.p2 p2Var = pVar.f334705f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarClickCallback", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
                if (p2Var != null) {
                    p2Var.a(i18);
                }
                oi0.e.f345591d.e(snsObject);
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CommentDetailStarHelper", "parse obj error");
            }
            com.tencent.mm.plugin.sns.storage.l1.d(snsInfo.getSnsId(), snsInfo);
            pb4.e eVar = pb4.e.f353196a;
            if (i18 == 1) {
                pb4.e.i(eVar, snsInfo, false, 2, null);
            } else {
                java.lang.String field_userName = snsInfo.field_userName;
                kotlin.jvm.internal.o.f(field_userName, "field_userName");
                pb4.e.b(eVar, field_userName, snsInfo.field_snsId, false, 4, null);
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            n34.j jVar = new n34.j(this.f334662m, this.f334657e, this.f334661i, this.f334663n, this.f334660h, null);
            this.f334656d = 2;
            if (kotlinx.coroutines.l.g(g3Var, jVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommentDetailStarHelper", "change star error " + str + ", " + i18);
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
            n34.k kVar = new n34.k(this.f334662m, pVar, null);
            this.f334656d = 3;
            if (kotlinx.coroutines.l.g(g3Var2, kVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        return f0Var2;
    }
}
