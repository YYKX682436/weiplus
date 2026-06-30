package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class as extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f111934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f111935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f111937g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f111938h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str, boolean z17, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f111935e = etVar;
        this.f111936f = str;
        this.f111937g = z17;
        this.f111938h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.as asVar = new com.tencent.mm.plugin.finder.live.plugin.as(this.f111935e, this.f111936f, this.f111937g, this.f111938h, continuation);
        asVar.f111934d = obj;
        return asVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.as asVar = (com.tencent.mm.plugin.finder.live.plugin.as) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        asVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04a4  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r52) {
        /*
            Method dump skipped, instructions count: 2418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.as.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
