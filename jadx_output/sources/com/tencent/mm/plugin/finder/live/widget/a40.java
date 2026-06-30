package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class a40 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117723d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c40 f117725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(com.tencent.mm.plugin.finder.live.widget.c40 c40Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117725f = c40Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.widget.a40 a40Var = new com.tencent.mm.plugin.finder.live.widget.a40(this.f117725f, continuation);
        a40Var.f117724e = obj;
        return a40Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.a40) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.a40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
