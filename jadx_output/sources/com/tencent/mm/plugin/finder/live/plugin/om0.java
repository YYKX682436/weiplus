package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class om0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f113768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f113769e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f113768d = hVar;
        this.f113769e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.om0(this.f113768d, continuation, this.f113769e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.om0 om0Var = (com.tencent.mm.plugin.finder.live.plugin.om0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        om0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        if ((r0.getLong(1) > 0 && r0.getLong(0) > ((long) 0) && r0.getLong(0) <= ((long) 3)) == false) goto L29;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.om0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
