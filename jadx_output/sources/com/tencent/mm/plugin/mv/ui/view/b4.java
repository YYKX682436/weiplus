package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment f151786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment) {
        super(1);
        this.f151786d = musicMvTabSearchFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar != null ? fVar.f70615a : 0;
        int i18 = fVar != null ? fVar.f70616b : 0;
        r45.tu2 tu2Var = fVar != null ? (r45.tu2) fVar.f70618d : null;
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = this.f151786d;
        musicMvTabSearchFragment.getClass();
        if (i17 == 0 && i18 == 0) {
            musicMvTabSearchFragment.f151732x = tu2Var != null ? tu2Var.getByteString(5) : null;
            if (tu2Var != null) {
                musicMvTabSearchFragment.f151731w = tu2Var.getInteger(2);
                musicMvTabSearchFragment.setHasMore(tu2Var.getInteger(3) != 0);
                java.util.Iterator it = tu2Var.getList(4).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
                    if (finderObject != null) {
                        jm3.h1.f300322a.a(finderObject);
                        long id6 = finderObject.getId();
                        java.lang.String objectNonceId = finderObject.getObjectNonceId();
                        if (!musicMvTabSearchFragment.getFeedIdMap().contains(java.lang.Long.valueOf(id6))) {
                            musicMvTabSearchFragment.getDataList().add(new com.tencent.mm.plugin.mv.ui.view.q3(new com.tencent.mm.plugin.mv.ui.view.t3(id6, objectNonceId, finderObject, false, 8, null)));
                        }
                    }
                }
                musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
                yz5.a onSceneEndListener = musicMvTabSearchFragment.getOnSceneEndListener();
                if (onSceneEndListener != null) {
                    onSceneEndListener.invoke();
                }
                com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", "onSceneEnd BGFinderFeed " + musicMvTabSearchFragment.getDataList().size());
            }
        }
        musicMvTabSearchFragment.getRlLayout().N(0);
        com.tencent.mm.plugin.mv.ui.view.p3 resultListener = musicMvTabSearchFragment.getResultListener();
        if (resultListener != null) {
            ((com.tencent.mm.plugin.mv.ui.view.h0) resultListener).a(4, musicMvTabSearchFragment.getAdapter().getItemCount());
        }
        return jz5.f0.f302826a;
    }
}
