package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment f156420d;

    public n(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment) {
        this.f156420d = musicPickerRecommendDataFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156420d.f156382f;
        if (wxRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment$onMusicNewCome$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment$onMusicNewCome$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
