package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f125356d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f125357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f125358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.u0 f125359g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f125360h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.n4 f125361i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kotlin.jvm.internal.f0 f0Var, com.tencent.mm.plugin.finder.report.u0 u0Var, so2.u1 u1Var, com.tencent.mm.plugin.finder.report.n4 n4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f125358f = f0Var;
        this.f125359g = u0Var;
        this.f125360h = u1Var;
        this.f125361i = n4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.report.t0 t0Var = new com.tencent.mm.plugin.finder.report.t0(this.f125358f, this.f125359g, this.f125360h, this.f125361i, continuation);
        t0Var.f125357e = obj;
        return t0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.report.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
