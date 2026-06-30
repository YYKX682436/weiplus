package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class vn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114803d;

    /* renamed from: e, reason: collision with root package name */
    public int f114804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f114805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f114806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114805f = wn0Var;
        this.f114806g = linkedList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.vn0(this.f114805f, this.f114806g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.vn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0131  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.vn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
