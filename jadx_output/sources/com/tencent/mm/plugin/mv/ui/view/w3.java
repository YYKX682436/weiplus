package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment f151980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bq.z1 f151981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f151982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment, bq.z1 z1Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151980d = musicMvTabMyPostFragment;
        this.f151981e = z1Var;
        this.f151982f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.view.w3(this.f151980d, this.f151981e, this.f151982f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.mv.ui.view.w3 w3Var = (com.tencent.mm.plugin.mv.ui.view.w3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bq.z1 z1Var = this.f151981e;
        com.tencent.mm.protobuf.g E = z1Var.E();
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = this.f151980d;
        musicMvTabMyPostFragment.f151730w = E;
        java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> K = z1Var.K();
        if (K != null) {
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : K) {
                jm3.h1.f300322a.a(finderObject);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                if (finderObject.getPrivateFlag() != 1 ? objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || finderMedia.getMediaType() != 2 : false) {
                    long id6 = finderObject.getId();
                    java.lang.String objectNonceId = finderObject.getObjectNonceId();
                    if (!musicMvTabMyPostFragment.getFeedIdMap().contains(new java.lang.Long(id6))) {
                        musicMvTabMyPostFragment.getDataList().add(new com.tencent.mm.plugin.mv.ui.view.q3(new com.tencent.mm.plugin.mv.ui.view.t3(id6, objectNonceId, finderObject, false, 8, null)));
                    }
                }
            }
            musicMvTabMyPostFragment.getAdapter().notifyDataSetChanged();
            yz5.a onSceneEndListener = musicMvTabMyPostFragment.getOnSceneEndListener();
            if (onSceneEndListener != null) {
                onSceneEndListener.invoke();
            }
        }
        musicMvTabMyPostFragment.setHasMore(z1Var.f23548z);
        this.f151982f.invoke();
        return jz5.f0.f302826a;
    }
}
