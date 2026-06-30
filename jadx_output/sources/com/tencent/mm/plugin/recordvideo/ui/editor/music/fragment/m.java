package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

/* loaded from: classes5.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment f156419d;

    public m(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment) {
        this.f156419d = musicPickerRecommendDataFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wt3.e eVar;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment = this.f156419d;
        if (musicPickerRecommendDataFragment.f156400s || (eVar = musicPickerRecommendDataFragment.f156397p) == null) {
            return;
        }
        eVar.f449403l.obtainMessage(1).sendToTarget();
    }
}
