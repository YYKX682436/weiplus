package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class if0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f112965d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f112966e;

    /* renamed from: f, reason: collision with root package name */
    public int f112967f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f112968g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f112969h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f112970i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if0(kotlinx.coroutines.f1 f1Var, com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112969h = f1Var;
        this.f112970i = jf0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.if0 if0Var = new com.tencent.mm.plugin.finder.live.plugin.if0(this.f112969h, this.f112970i, continuation);
        if0Var.f112968g = obj;
        return if0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.if0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.if0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
