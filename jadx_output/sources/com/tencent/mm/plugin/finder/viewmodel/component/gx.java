package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class gx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f134556d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f134557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f134558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f134559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134558f = sxVar;
        this.f134559g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.viewmodel.component.gx gxVar = new com.tencent.mm.plugin.finder.viewmodel.component.gx(this.f134558f, this.f134559g, continuation);
        gxVar.f134557e = obj;
        return gxVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.gx) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ee  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.gx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
