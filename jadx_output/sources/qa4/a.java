package qa4;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f361069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f361070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f361071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.jj4 jj4Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f361070e = jj4Var;
        this.f361071f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        qa4.a aVar = new qa4.a(this.f361070e, this.f361071f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        return aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        java.lang.Object invokeSuspend = ((qa4.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f361069d;
        boolean z17 = this.f361071f;
        r45.jj4 jj4Var = this.f361070e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f361069d = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImagePathFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new qa4.e(z17, jj4Var, null), this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagePathFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
            if (g17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
                return aVar;
            }
            obj = g17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
            return null;
        }
        if (z17) {
            android.graphics.Bitmap s17 = ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).s(jj4Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
            return s17;
        }
        android.graphics.Bitmap p17 = ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).p(str, jj4Var.f377855d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        return p17;
    }
}
