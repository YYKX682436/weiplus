package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f175667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.n f175668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f175669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f175670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.vlog.model.n nVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2) {
        super(1);
        this.f175667d = h0Var;
        this.f175668e = nVar;
        this.f175669f = f0Var;
        this.f175670g = f0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession = (com.tencent.tav.core.AssetParallelExportSession) this.f175667d.f310123d;
        if (assetParallelExportSession != null) {
            kotlin.jvm.internal.f0 f0Var = this.f175669f;
            int i17 = f0Var.f310116d;
            int parallelSize = assetParallelExportSession.parallelSize();
            if (i17 < parallelSize) {
                i17 = parallelSize;
            }
            f0Var.f310116d = i17;
            kotlin.jvm.internal.f0 f0Var2 = this.f175670g;
            int i18 = f0Var2.f310116d;
            int instanceCount = com.tencent.tav.codec.MediaCodecAnalyse.INSTANCE.instanceCount();
            if (i18 < instanceCount) {
                i18 = instanceCount;
            }
            f0Var2.f310116d = i18;
        }
        yz5.l lVar = this.f175668e.f175693l;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(floatValue));
        }
        return jz5.f0.f302826a;
    }
}
