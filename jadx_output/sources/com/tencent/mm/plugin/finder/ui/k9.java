package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class k9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f129422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f129424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129423e = finderLivePostHelperUI;
        this.f129424f = i17;
        this.f129425g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.k9(this.f129423e, this.f129424f, this.f129425g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.k9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f129422d;
        com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = this.f129423e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f129422d = 1;
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
        int i18 = this.f129424f;
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "[CTID] internal: user picked wepay, precheckType=" + i18);
            if (i18 == 1) {
                com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.g7(finderLivePostHelperUI);
            } else if (i18 == 4) {
                int i19 = com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.C;
                com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = finderLivePostHelperUI.getUICScope();
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.o8(finderLivePostHelperUI, null), 2, null);
            } else if (i18 != 5) {
                com.tencent.mars.xlog.Log.w("Finder.FinderLivePostHelperUI", "[CTID] internal: unexpected precheckType=" + i18);
            } else {
                com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.k7(finderLivePostHelperUI, this.f129425g);
            }
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "[CTID] internal: user picked CTID, precheckType=" + i18);
            int i27 = com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.C;
            finderLivePostHelperUI.u7(false, i18);
        } else if (ordinal == 2) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "[CTID] internal: user cancelled, precheckType=" + i18);
        }
        return jz5.f0.f302826a;
    }
}
