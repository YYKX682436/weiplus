package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerShootRecommendFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class FinderMusicPickerShootRecommendFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment {
    public qv3.d A;

    /* renamed from: y, reason: collision with root package name */
    public boolean f156358y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f156359z;

    public FinderMusicPickerShootRecommendFragment(ev3.d dVar, boolean z17) {
        super(dVar, z17);
        this.f156358y = true;
        this.f156359z = true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public wt3.e F0(yu3.a createInfo) {
        kotlin.jvm.internal.o.g(createInfo, "createInfo");
        qv3.d dVar = new qv3.d(this.f156385i, createInfo, 0, 4, null);
        this.A = dVar;
        return dVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public int J0() {
        return 18;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public void K0() {
        java.lang.Object obj = this.f156397p;
        wt3.j0 j0Var = obj instanceof wt3.j0 ? (wt3.j0) obj : null;
        if (j0Var == null) {
            return;
        }
        j0Var.a(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.r(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P0(java.util.List r21) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment.P0(java.util.List):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public void Q0(java.lang.String str) {
        java.lang.Object obj = this.f156397p;
        wt3.j0 j0Var = obj instanceof wt3.j0 ? (wt3.j0) obj : null;
        if (j0Var != null) {
            j0Var.getHelper();
        }
    }

    @Override // ev3.b
    public void X(android.view.View itemView, rv3.h feed, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
        nv3.k.f340686a.a(itemView, feed);
    }

    @Override // ev3.b
    public void h(android.view.View itemView, rv3.h feed, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
        nv3.c.f340654a.a(feed, i17, z17, 8, this.f156381e, this.f156380d);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    /* renamed from: j0 */
    public boolean getS1() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323416o);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public boolean l0() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323411g);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public boolean m0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 8;
    }
}
