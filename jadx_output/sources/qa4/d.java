package qa4;

/* loaded from: classes4.dex */
public final class d implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f361078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m0 f361080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f361081g;

    public d(r45.jj4 jj4Var, java.lang.String str, com.tencent.mm.plugin.sns.model.m0 m0Var, kotlinx.coroutines.q qVar) {
        this.f361078d = jj4Var;
        this.f361079e = str;
        this.f361080f = m0Var;
        this.f361081g = qVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        if (kotlin.jvm.internal.o.b(str, this.f361078d.f377855d)) {
            this.f361080f.v(this);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f361081g.resumeWith(kotlin.Result.m521constructorimpl(this.f361079e));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageLoader", "onSightFinish: " + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String mediaId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (kotlin.jvm.internal.o.b(mediaId, this.f361078d.f377855d)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onThumbFinish: ");
            java.lang.String str = this.f361079e;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageLoader", sb6.toString());
            this.f361080f.v(this);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f361081g.resumeWith(kotlin.Result.m521constructorimpl(str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
    }
}
