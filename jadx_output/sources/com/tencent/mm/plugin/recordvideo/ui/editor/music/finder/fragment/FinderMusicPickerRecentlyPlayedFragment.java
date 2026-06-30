package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecentlyPlayedFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerLikeFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class FinderMusicPickerRecentlyPlayedFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment {

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f156334x;

    public FinderMusicPickerRecentlyPlayedFragment(ev3.d dVar, boolean z17, boolean z18) {
        super(dVar, z17, z18);
        this.f156334x = "FinderMusicPickerRecentlyPlayedFragment[" + hashCode() + ']';
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment
    public int C0() {
        return 17;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment
    /* renamed from: F0, reason: from getter */
    public java.lang.String getF156334x() {
        return this.f156334x;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment
    public int K0() {
        return 14;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment
    public void L0(rv3.h item, int i17, android.view.View itemView) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        nv3.c.f340654a.b(item.f400395d, false, 14, rv3.w.f400417a, this.f156380d);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment
    public void M0(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // ev3.b
    public void h(android.view.View itemView, rv3.h feed, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
        nv3.c.f340654a.a(feed, i17, z17, 14, this.f156381e, this.f156380d);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public boolean l0() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323411g);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 14;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, ev3.c
    public void q(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.U0(info, z17);
        }
    }

    @Override // ev3.c
    public void w(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
        if (!z17) {
            java.lang.String a17 = info.a();
            dv3.c cVar = this.f156381e;
            int K0 = cVar != null ? cVar.K0(a17) : -1;
            dv3.c cVar2 = this.f156381e;
            if (cVar2 != null) {
                cVar2.Q0(K0);
                return;
            }
            return;
        }
        dv3.c cVar3 = this.f156381e;
        if (cVar3 != null) {
            int K02 = cVar3.K0(info.a());
            if (K02 > 0) {
                cVar3.I.remove(K02);
                cVar3.notifyItemRemoved(K02);
            }
            dv3.c.H0(cVar3, kz5.b0.c(info), false, 2, null);
        }
        dv3.c cVar4 = this.f156381e;
        if (cVar4 != null) {
            cVar4.V0(info.a(), musicPlayStatus);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.post(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.e(this));
        }
    }
}
