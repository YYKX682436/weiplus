package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class i implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment f156371a;

    public i(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment finderMusicPickerRecommendFeedFragment) {
        this.f156371a = finderMusicPickerRecommendFeedFragment;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        kotlin.jvm.internal.o.g(bgmList, "bgmList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment finderMusicPickerRecommendFeedFragment = this.f156371a;
        if (finderMusicPickerRecommendFeedFragment.f156341t) {
            com.tencent.mars.xlog.Log.i(finderMusicPickerRecommendFeedFragment.f156337p, "EditorView has been destroyed, skip callback");
            return;
        }
        dv3.c cVar = finderMusicPickerRecommendFeedFragment.f156381e;
        if (cVar != null) {
            cVar.P0(1);
        }
        finderMusicPickerRecommendFeedFragment.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : bgmList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.vv0 vv0Var = (r45.vv0) obj;
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo a17 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.a(vv0Var, 1, finderMusicPickerRecommendFeedFragment.f156335n);
            a17.f155719p = 15;
            a17.f155726w = 0;
            a17.f155727x = 0L;
            nv3.t.f340702o.a(finderMusicPickerRecommendFeedFragment.getContext(), vv0Var, a17);
            arrayList.add(a17);
            a17.h();
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i(finderMusicPickerRecommendFeedFragment.f156337p, "handleResult:audioList size=" + bgmList.size() + ", loadFirstPage=" + z17 + ", hasNextPage=" + z18);
        if (z18) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
            audioCacheInfo.f155718o = 5;
            arrayList.add(audioCacheInfo);
        }
        if (bgmList.isEmpty()) {
            dv3.c cVar2 = finderMusicPickerRecommendFeedFragment.f156381e;
            if (cVar2 != null && cVar2.K == 1) {
                finderMusicPickerRecommendFeedFragment.y0();
                return;
            }
        }
        finderMusicPickerRecommendFeedFragment.z0();
        if (z17) {
            dv3.c cVar3 = finderMusicPickerRecommendFeedFragment.f156381e;
            if (cVar3 != null) {
                cVar3.T0(arrayList);
                return;
            }
            return;
        }
        dv3.c cVar4 = finderMusicPickerRecommendFeedFragment.f156381e;
        if (cVar4 != null) {
            dv3.c.F0(cVar4, arrayList, false, 2, null);
        }
    }

    @Override // wt3.i0
    public android.app.Activity getActivity() {
        return this.f156371a.getActivity();
    }
}
