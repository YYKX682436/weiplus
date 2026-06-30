package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class l9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f129463d;

    /* renamed from: e, reason: collision with root package name */
    public int f129464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f129465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129466g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f129467h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(boolean z17, com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129465f = z17;
        this.f129466g = finderLivePostHelperUI;
        this.f129467h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.l9(this.f129465f, this.f129466g, this.f129467h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.l9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b9  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.l9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
