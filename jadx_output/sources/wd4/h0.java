package wd4;

/* loaded from: classes4.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f444917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd4.g f444918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f444919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.sns.ui.FlipView flipView, wd4.g gVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444917e = flipView;
        this.f444918f = gVar;
        this.f444919g = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        wd4.h0 h0Var = new wd4.h0(this.f444917e, this.f444918f, this.f444919g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        return h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        java.lang.Object invokeSuspend = ((wd4.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f444916d;
        com.tencent.mm.plugin.sns.ui.FlipView flipView = this.f444917e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            wd4.r rVar = wd4.r.f445015a;
            kotlinx.coroutines.y0 a17 = v65.m.a(flipView);
            android.content.Context context = flipView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            wd4.h hVar = new wd4.h(a17, context, this.f444918f, new wd4.x(this.f444919g), new wd4.y(flipView));
            kz5.p0 p0Var = kz5.p0.f313996d;
            java.util.List c17 = kz5.b0.c(new wd4.c0(flipView));
            java.util.List c18 = kz5.b0.c(new wd4.g0(flipView));
            this.f444916d = 1;
            d17 = wd4.r.d(rVar, hVar, p0Var, c17, c18, null, this, 16, null);
            if (d17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            d17 = obj;
        }
        zh1.z0 z0Var = (zh1.z0) d17;
        if (z0Var != null) {
            new wd4.k0(flipView, z0Var);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        return f0Var;
    }
}
