package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168826d;

    /* renamed from: e, reason: collision with root package name */
    public int f168827e;

    /* renamed from: f, reason: collision with root package name */
    public int f168828f;

    /* renamed from: g, reason: collision with root package name */
    public int f168829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.e f168830h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.ui.improve.component.header.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168830h = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
        com.tencent.mm.plugin.sns.ui.improve.component.header.d dVar = new com.tencent.mm.plugin.sns.ui.improve.component.header.d(this.f168830h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.improve.component.header.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0192 -> B:6:0x019a). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.header.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
