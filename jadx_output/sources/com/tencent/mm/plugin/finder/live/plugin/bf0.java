package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class bf0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f112028d;

    /* renamed from: e, reason: collision with root package name */
    public int f112029e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f112030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f112031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f112032h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(kotlinx.coroutines.f1 f1Var, com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112031g = f1Var;
        this.f112032h = jf0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.bf0 bf0Var = new com.tencent.mm.plugin.finder.live.plugin.bf0(this.f112031g, this.f112032h, continuation);
        bf0Var.f112030f = obj;
        return bf0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.bf0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0075 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.bf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
