package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class m7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117254d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117256f = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.viewmodel.m7 m7Var = new com.tencent.mm.plugin.finder.live.viewmodel.m7(this.f117256f, continuation);
        m7Var.f117255e = obj;
        return m7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.m7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.m7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
