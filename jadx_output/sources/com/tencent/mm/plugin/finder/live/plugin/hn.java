package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hn extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112846d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f112847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kn f112848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce2.i f112849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(com.tencent.mm.plugin.finder.live.plugin.kn knVar, ce2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112848f = knVar;
        this.f112849g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.hn hnVar = new com.tencent.mm.plugin.finder.live.plugin.hn(this.f112848f, this.f112849g, continuation);
        hnVar.f112847e = obj;
        return hnVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.hn) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0022 A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.hn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
