package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fn extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f112571d;

    /* renamed from: e, reason: collision with root package name */
    public int f112572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kn f112573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce2.i f112574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f112575h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f112576i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112577m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(com.tencent.mm.plugin.finder.live.plugin.kn knVar, ce2.i iVar, boolean z17, kotlin.jvm.internal.h0 h0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112573f = knVar;
        this.f112574g = iVar;
        this.f112575h = z17;
        this.f112576i = h0Var;
        this.f112577m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.fn(this.f112573f, this.f112574g, this.f112575h, this.f112576i, this.f112577m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.fn) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0330, code lost:
    
        if (r0 == false) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.fn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
