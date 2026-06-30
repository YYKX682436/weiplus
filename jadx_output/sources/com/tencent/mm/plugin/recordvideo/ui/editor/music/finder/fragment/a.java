package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class a implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerEditRecommendFragment f156360a;

    public a(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerEditRecommendFragment finderMusicPickerEditRecommendFragment) {
        this.f156360a = finderMusicPickerEditRecommendFragment;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        kotlin.jvm.internal.o.g(bgmList, "bgmList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerEditRecommendFragment finderMusicPickerEditRecommendFragment = this.f156360a;
        if (finderMusicPickerEditRecommendFragment.f156398q) {
            com.tencent.mars.xlog.Log.i("FinderMusicPickerEditRecommendFragment", "EditorView has been destroyed, skip callback");
            return;
        }
        finderMusicPickerEditRecommendFragment.f156400s = !bgmList.isEmpty();
        dv3.c cVar = finderMusicPickerEditRecommendFragment.f156381e;
        if (cVar != null) {
            cVar.P0(1);
        }
        this.f156360a.U0(bgmList, z17, z18, j17);
    }

    @Override // wt3.i0
    public android.app.Activity getActivity() {
        return this.f156360a.getActivity();
    }
}
