package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class o9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f119274d;

    /* renamed from: e, reason: collision with root package name */
    public int f119275e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f119276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f119277g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(com.tencent.mm.plugin.finder.live.widget.x9 x9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119277g = x9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.widget.o9 o9Var = new com.tencent.mm.plugin.finder.live.widget.o9(this.f119277g, continuation);
        o9Var.f119276f = obj;
        return o9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.o9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.o9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
