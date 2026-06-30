package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class p extends androidx.fragment.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlbumUI f209483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.ui.AlbumUI albumUI, androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f209483d = albumUI;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f209483d.f196554f ? 1 : 2;
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        com.tencent.mm.ui.AlbumUI albumUI = this.f209483d;
        com.tencent.mm.ui.MMFragment mMFragment = null;
        if (i17 < 0) {
            int i18 = com.tencent.mm.ui.AlbumUI.f196551h;
            albumUI.getClass();
            return null;
        }
        java.util.HashMap hashMap = albumUI.f196553e;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return (com.tencent.mm.ui.MMFragment) hashMap.get(java.lang.Integer.valueOf(i17));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (albumUI.f196554f) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
            e51.f fVar = ef4.j0.f252452a;
            androidx.fragment.app.Fragment instantiate = androidx.fragment.app.Fragment.instantiate(albumUI, com.tencent.mm.plugin.story.ui.album.StoryAlbumUI.class.getName(), bundle);
            kotlin.jvm.internal.o.e(instantiate, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
            mMFragment = (com.tencent.mm.ui.MMFragment) instantiate;
        } else if (i17 != 0) {
            if (i17 == 1) {
                if (bi4.v1.g()) {
                    ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
                    androidx.fragment.app.Fragment instantiate2 = androidx.fragment.app.Fragment.instantiate(albumUI, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_history_v2_and, bm5.h0.RepairerConfig_TextStatus_NewTextStatusHistory_Int, 1) == 1 ? com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI.class.getName() : com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI.class.getName(), bundle);
                    kotlin.jvm.internal.o.e(instantiate2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
                    mMFragment = (com.tencent.mm.ui.MMFragment) instantiate2;
                } else {
                    ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
                    e51.f fVar2 = ef4.j0.f252452a;
                    androidx.fragment.app.Fragment instantiate3 = androidx.fragment.app.Fragment.instantiate(albumUI, com.tencent.mm.plugin.story.ui.album.StoryAlbumUI.class.getName(), bundle);
                    kotlin.jvm.internal.o.e(instantiate3, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
                    mMFragment = (com.tencent.mm.ui.MMFragment) instantiate3;
                }
            }
        } else {
            ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("instantiateAlbumFragment", "com.tencent.mm.plugin.sns.PluginSns");
            com.tencent.mm.ui.MMFragment mMFragment2 = (com.tencent.mm.ui.MMFragment) androidx.fragment.app.Fragment.instantiate(albumUI, com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.class.getName(), bundle);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("instantiateAlbumFragment", "com.tencent.mm.plugin.sns.PluginSns");
            mMFragment = mMFragment2;
        }
        if (mMFragment != null) {
            mMFragment.setParent(albumUI);
        }
        hashMap.put(java.lang.Integer.valueOf(i17), mMFragment);
        return mMFragment;
    }
}
