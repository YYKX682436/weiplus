package x94;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452731d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452732e;

    /* renamed from: f, reason: collision with root package name */
    public int f452733f;

    /* renamed from: g, reason: collision with root package name */
    public int f452734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout f452735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout snsCoverImageEditPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f452735h = snsCoverImageEditPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
        x94.c cVar = new x94.c(this.f452735h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
        java.lang.Object invokeSuspend = ((x94.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        int i17;
        ut3.f fVar;
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f452734g;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_COVER_UPLOAD_SOURCE_INT_SYNC, 0);
            com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout snsCoverImageEditPluginLayout = this.f452735h;
            if (r17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverImageEditPluginLayout", "debug info,post source image");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                og3.a aVar2 = og3.a.f345156e;
                int i19 = com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout.f163991n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
                java.lang.String str = snsCoverImageEditPluginLayout.f163993m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
                kotlin.jvm.internal.o.d(str);
                arrayList.add(new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo(aVar2, str, null, 4, null));
                ut3.f.f431176c.b(snsCoverImageEditPluginLayout.getContext(), -1, new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo(arrayList.size() > 0, arrayList, null));
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
                return f0Var;
            }
            ut3.f fVar2 = ut3.f.f431176c;
            android.content.Context context2 = snsCoverImageEditPluginLayout.getContext();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPreviewPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
            y94.a0 a0Var = snsCoverImageEditPluginLayout.f163992i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPreviewPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
            this.f452731d = fVar2;
            this.f452732e = context2;
            this.f452733f = -1;
            this.f452734g = 1;
            a0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exportCoverImage", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new y94.o(a0Var, null), this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exportCoverImage", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (g17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
                return aVar;
            }
            i17 = -1;
            fVar = fVar2;
            context = context2;
        } else {
            if (i18 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
                throw illegalStateException;
            }
            i17 = this.f452733f;
            context = (android.content.Context) this.f452732e;
            ut3.f fVar3 = (ut3.f) this.f452731d;
            kotlin.ResultKt.throwOnFailure(obj);
            fVar = fVar3;
            g17 = obj;
        }
        fVar.b(context, i17, (com.tencent.mm.plugin.mediabasic.data.MediaResultInfo) g17);
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.A().f60514e = 1;
        s0Var.z().f60509e = 1;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
        return f0Var2;
    }
}
