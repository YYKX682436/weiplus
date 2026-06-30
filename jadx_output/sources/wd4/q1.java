package wd4;

/* loaded from: classes4.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity f445008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd4.g f445009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc4.j0 f445010g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445011h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity snsFlexibleVideoActivity, wd4.g gVar, fc4.j0 j0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445008e = snsFlexibleVideoActivity;
        this.f445009f = gVar;
        this.f445010g = j0Var;
        this.f445011h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        wd4.q1 q1Var = new wd4.q1(this.f445008e, this.f445009f, this.f445010g, this.f445011h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        return q1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        java.lang.Object invokeSuspend = ((wd4.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f445007d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            wd4.r rVar = wd4.r.f445015a;
            com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity snsFlexibleVideoActivity = this.f445008e;
            kotlinx.coroutines.y0 b17 = v65.m.b(snsFlexibleVideoActivity);
            androidx.appcompat.app.AppCompatActivity context = snsFlexibleVideoActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            wd4.g gVar = this.f445009f;
            fc4.j0 j0Var = this.f445010g;
            wd4.h hVar = new wd4.h(b17, context, gVar, new wd4.m1(j0Var), new wd4.n1(this.f445011h));
            kz5.p0 p0Var = kz5.p0.f313996d;
            java.util.List c17 = kz5.b0.c(new wd4.o1(j0Var));
            wd4.p1 p1Var = wd4.p1.f445001d;
            this.f445007d = 1;
            if (rVar.c(hVar, p0Var, p0Var, c17, p1Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        return f0Var;
    }
}
