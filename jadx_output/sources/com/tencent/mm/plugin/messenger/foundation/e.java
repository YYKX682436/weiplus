package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes11.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.e f148635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.messenger.foundation.g f148636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f148637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vg3.e eVar, com.tencent.mm.plugin.messenger.foundation.g gVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f148635d = eVar;
        this.f148636e = gVar;
        this.f148637f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.messenger.foundation.e(this.f148635d, this.f148636e, this.f148637f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.messenger.foundation.e eVar = (com.tencent.mm.plugin.messenger.foundation.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vg3.e eVar = this.f148635d;
        vg3.b bVar = eVar.f436689b;
        long j17 = 0;
        if (bVar == vg3.b.f436645e) {
            this.f148636e.f148650g = eVar.f436688a;
            this.f148636e.f148649f = this.f148635d.f436690c;
            this.f148636e.f148648e = this.f148637f;
            com.tencent.mm.plugin.messenger.foundation.g gVar = this.f148636e;
            vg3.e reportInfo = this.f148635d;
            gVar.getClass();
            kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) gVar.f148647d).getValue(), null, new com.tencent.mm.plugin.messenger.foundation.f(reportInfo, 0L, null), 1, null);
        } else if (bVar == vg3.b.f436646f) {
            if (this.f148636e.f148650g == this.f148635d.f436688a && this.f148636e.f148649f == this.f148635d.f436690c && this.f148636e.f148648e > 0) {
                j17 = this.f148637f - this.f148636e.f148648e;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactOpReportService", "error: lastRequestPage=" + this.f148636e.f148650g + ", lastRequestContent=" + this.f148636e.f148649f + ", lastRequestStartTimeMs=" + this.f148636e.f148648e);
            }
            com.tencent.mm.plugin.messenger.foundation.g gVar2 = this.f148636e;
            vg3.e reportInfo2 = this.f148635d;
            gVar2.getClass();
            kotlin.jvm.internal.o.g(reportInfo2, "reportInfo");
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) gVar2.f148647d).getValue(), null, new com.tencent.mm.plugin.messenger.foundation.f(reportInfo2, j17, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
