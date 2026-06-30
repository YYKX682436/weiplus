package mx0;

/* loaded from: classes5.dex */
public final class e5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331945d;

    /* renamed from: e, reason: collision with root package name */
    public int f331946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ py0.f0 f331947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx0.k f331948g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331949h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f331950i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f331951m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(py0.f0 f0Var, rx0.k kVar, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331947f = f0Var;
        this.f331948g = kVar;
        this.f331949h = shootComposingPluginLayout;
        this.f331950i = z17;
        this.f331951m = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.e5(this.f331947f, this.f331948g, this.f331949h, this.f331950i, this.f331951m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.e5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String endReason;
        java.lang.String str;
        com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo;
        java.lang.String str2;
        mx0.l1 materialImportPreviewUIPlugin;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f331946e;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331949h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            py0.f0 f0Var = this.f331947f;
            if (f0Var.isShowing()) {
                f0Var.dismiss();
            }
            rx0.k kVar = this.f331948g;
            java.lang.String str3 = kVar != null ? kVar.f400941h : null;
            endReason = "Error";
            if (!(str3 == null || str3.length() == 0)) {
                if (kVar == null || (str2 = kVar.f400941h) == null) {
                    str2 = "";
                }
                shootComposingPluginLayout.U0(str2, new mx0.c5(shootComposingPluginLayout));
            } else if (this.f331950i) {
                endReason = "UserExit";
            } else {
                java.lang.String str4 = (kVar == null || (mJRecordingFinishInfo = kVar.f400936c) == null) ? null : mJRecordingFinishInfo.f47817a;
                if (str4 != null) {
                    this.f331945d = "Completed";
                    this.f331946e = 1;
                    if (this.f331951m.invoke(str4, kVar, this) == aVar) {
                        return aVar;
                    }
                    str = "Completed";
                } else {
                    java.lang.String string = shootComposingPluginLayout.getContext().getString(com.tencent.mm.R.string.llf);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    shootComposingPluginLayout.U0(string, new mx0.d5(shootComposingPluginLayout));
                }
            }
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            m7Var.getClass();
            kotlin.jvm.internal.o.g(endReason, "endReason");
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.b2(m7Var, endReason, null), 3, null);
            materialImportPreviewUIPlugin = shootComposingPluginLayout.getMaterialImportPreviewUIPlugin();
            materialImportPreviewUIPlugin.b();
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) this.f331945d;
        kotlin.ResultKt.throwOnFailure(obj);
        endReason = str;
        yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var2.getClass();
        kotlin.jvm.internal.o.g(endReason, "endReason");
        kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.b2(m7Var2, endReason, null), 3, null);
        materialImportPreviewUIPlugin = shootComposingPluginLayout.getMaterialImportPreviewUIPlugin();
        materialImportPreviewUIPlugin.b();
        return jz5.f0.f302826a;
    }
}
