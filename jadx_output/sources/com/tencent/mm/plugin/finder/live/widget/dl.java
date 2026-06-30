package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class dl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118126d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f118127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f118129g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f118130h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.hl hlVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118128f = str;
        this.f118129g = hlVar;
        this.f118130h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.widget.dl dlVar = new com.tencent.mm.plugin.finder.live.widget.dl(this.f118128f, this.f118129g, this.f118130h, continuation);
        dlVar.f118127e = obj;
        return dlVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.dl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ff  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.dl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
