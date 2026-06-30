package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFeedFragment f156373d;

    public k(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFeedFragment finderMusicPickerSearchFeedFragment) {
        this.f156373d = finderMusicPickerSearchFeedFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nv3.t tVar = this.f156373d.f156346w;
        if (tVar != null) {
            tVar.b(false);
        }
    }
}
