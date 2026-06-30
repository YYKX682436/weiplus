package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class v8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f129946d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f129947e;

    /* renamed from: f, reason: collision with root package name */
    public int f129948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129950h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129949g = finderLivePostHelperUI;
        this.f129950h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.v8(this.f129949g, this.f129950h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.v8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.v8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
