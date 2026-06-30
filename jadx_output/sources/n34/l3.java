package n34;

/* loaded from: classes4.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f334668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f334669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334672i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334673m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(int i17, long j17, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334668e = i17;
        this.f334669f = j17;
        this.f334670g = str;
        this.f334671h = snsInfo;
        this.f334672i = u3Var;
        this.f334673m = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
        n34.l3 l3Var = new n34.l3(this.f334668e, this.f334669f, this.f334670g, this.f334671h, this.f334672i, this.f334673m, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
        return l3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
        java.lang.Object invokeSuspend = ((n34.l3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f334671h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f334667d;
        int i18 = this.f334668e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.model.n6 n6Var = com.tencent.mm.plugin.sns.model.n6.f164514a;
            this.f334667d = 1;
            a17 = n6Var.a(i18, this.f334669f, this);
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        r45.ja6 ja6Var = (r45.ja6) a17;
        java.lang.String str = this.f334670g;
        if (ja6Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryStarHelper", "change star success " + str + ", " + i18);
            try {
                com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) parseFrom;
                snsObject.InTopList = i18 == 1 ? 1 : 0;
                snsInfo.field_attrBuf = snsObject.toByteArray();
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryStarHelper", "parse obj error");
            }
            com.tencent.mm.plugin.sns.storage.l1.d(str, snsInfo);
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
            n34.j3 j3Var = new n34.j3(this.f334672i, this.f334668e, this.f334673m, this.f334671h, null);
            this.f334667d = 2;
            if (kotlinx.coroutines.l.g(g3Var, j3Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryStarHelper", "change star error " + str + ", " + i18);
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
            n34.k3 k3Var = new n34.k3(this.f334672i, this.f334673m, null);
            this.f334667d = 3;
            if (kotlinx.coroutines.l.g(g3Var2, k3Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1");
        return f0Var2;
    }
}
