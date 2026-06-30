package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class j9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f129388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f129390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129391g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129389e = finderLivePostHelperUI;
        this.f129390f = i17;
        this.f129391g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.j9(this.f129389e, this.f129390f, this.f129391g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.j9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f129388d;
        com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = this.f129389e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f129388d = 1;
            obj = com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.i7(finderLivePostHelperUI, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int ordinal = ((com.tencent.mm.plugin.finder.ui.n8) obj).ordinal();
        int i18 = this.f129390f;
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "[CTID] external: user picked wepay, precheckType=" + i18);
            int i19 = com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.C;
            finderLivePostHelperUI.r7(this.f129391g, i18);
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "[CTID] external: user picked CTID, precheckType=" + i18);
            int i27 = com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.C;
            finderLivePostHelperUI.u7(true, i18);
        } else if (ordinal == 2) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "[CTID] external: user cancelled, precheckType=" + i18);
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.o7(this.f129389e, false, 0, null, 6, null);
        }
        return jz5.f0.f302826a;
    }
}
