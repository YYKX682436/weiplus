package n34;

/* loaded from: classes4.dex */
public final class b5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f334560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f334561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334562g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334563h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334564i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334565m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n34.d5 f334566n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334567o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(int i17, long j17, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.Context context, n34.d5 d5Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334560e = i17;
        this.f334561f = j17;
        this.f334562g = str;
        this.f334563h = snsInfo;
        this.f334564i = u3Var;
        this.f334565m = context;
        this.f334566n = d5Var;
        this.f334567o = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
        n34.b5 b5Var = new n34.b5(this.f334560e, this.f334561f, this.f334562g, this.f334563h, this.f334564i, this.f334565m, this.f334566n, this.f334567o, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
        return b5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
        java.lang.Object invokeSuspend = ((n34.b5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f334563h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f334559d;
        int i18 = this.f334560e;
        int i19 = 1;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.model.n6 n6Var = com.tencent.mm.plugin.sns.model.n6.f164514a;
            this.f334559d = 1;
            obj = n6Var.a(i18, this.f334561f, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.ja6 ja6Var = (r45.ja6) obj;
        java.lang.String str = this.f334562g;
        if (ja6Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineStarHelper", "change star success " + str + ", " + i18);
            try {
                com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) parseFrom;
                if (i18 != 1) {
                    i19 = 0;
                }
                snsObject.InTopList = i19;
                snsInfo.field_attrBuf = snsObject.toByteArray();
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimelineStarHelper", "parse obj error");
            }
            com.tencent.mm.plugin.sns.storage.l1.d(snsInfo.getSnsId(), snsInfo);
            pb4.e eVar = pb4.e.f353196a;
            java.lang.String field_userName = snsInfo.field_userName;
            kotlin.jvm.internal.o.f(field_userName, "field_userName");
            pb4.e.b(eVar, field_userName, snsInfo.field_snsId, false, 4, null);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            n34.z4 z4Var = new n34.z4(this.f334564i, this.f334565m, this.f334566n, this.f334567o, this.f334563h, null);
            this.f334559d = 2;
            if (kotlinx.coroutines.l.g(g3Var, z4Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineStarHelper", "change star error " + str + ", " + i18);
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
            n34.a5 a5Var = new n34.a5(this.f334564i, this.f334565m, null);
            this.f334559d = 3;
            if (kotlinx.coroutines.l.g(g3Var2, a5Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1");
        return f0Var2;
    }
}
