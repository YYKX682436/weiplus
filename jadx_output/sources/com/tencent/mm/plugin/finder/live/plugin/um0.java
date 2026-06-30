package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class um0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f114590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f114589d = hVar;
        this.f114590e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.um0(this.f114589d, continuation, this.f114590e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.um0 um0Var = (com.tencent.mm.plugin.finder.live.plugin.um0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        um0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f114589d).f454381b).f454379a;
        if (jVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f114590e;
            android.content.Context context = wn0Var.f365323d.getContext();
            android.content.res.Resources resources = wn0Var.f365323d.getContext().getResources();
            int i17 = jVar.f397425f;
            db5.t7.h(context, resources.getString(com.tencent.mm.R.string.f493746ow2, java.lang.String.valueOf(i17)));
            com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "createRewardWishList error: " + i17 + " msg: " + jVar.f397426g);
        }
        return jz5.f0.f302826a;
    }
}
