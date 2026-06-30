package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f114573e;

    /* renamed from: f, reason: collision with root package name */
    public int f114574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f114576h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114577i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114578m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ce2.i f114579n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vg2.m f114580o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, int i17, kotlin.jvm.internal.h0 h0Var, java.lang.String str, ce2.i iVar, vg2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114575g = hmVar;
        this.f114576h = i17;
        this.f114577i = h0Var;
        this.f114578m = str;
        this.f114579n = iVar;
        this.f114580o = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.uk(this.f114575g, this.f114576h, this.f114577i, this.f114578m, this.f114579n, this.f114580o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.uk) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.uk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
