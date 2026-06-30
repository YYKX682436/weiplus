package kv3;

/* loaded from: classes5.dex */
public final class a extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f {

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f312671q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f312672r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f312673s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, int i17) {
        super(parent, status, i17);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f312671q = kz5.z.D0(new java.lang.Integer[]{12, 13});
        this.f312672r = kz5.c0.i(8, 7, 9, 14, 10);
        this.f312673s = kz5.c0.i(9, 12, 13);
    }

    @Override // ev3.d
    public void b(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
        java.util.Iterator it = this.f312672r.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f156221n).get(java.lang.Integer.valueOf(intValue));
            if (cVar != null) {
                cVar.q(i17, info, z17, musicPlayStatus);
            }
        }
    }

    @Override // ev3.d
    public void i(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
        ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f156221n).get(14);
        if (cVar != null) {
            cVar.w(i17, info, z17, musicPlayStatus);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f, ev3.d
    public void k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i17, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar;
        super.k(audioCacheInfo, i17, view, z17, z18, bundle);
        if (audioCacheInfo == null || this.f312673s.contains(java.lang.Integer.valueOf(i17))) {
            return;
        }
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.uin) : null;
        if (findViewById == null || (aVar = this.f156222o) == null) {
            return;
        }
        aVar.e(findViewById, audioCacheInfo);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f, ev3.d
    public void l(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, boolean z19) {
        super.l(i17, audioCacheInfo, z17, z18, z19);
        if (!z17 || audioCacheInfo == null) {
            return;
        }
        int i18 = audioCacheInfo.f155719p;
        if (i18 == 7 || i18 == 8) {
            return;
        }
        nv3.c.f340654a.b(audioCacheInfo, true, i17, rv3.y.f400419a, this);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f
    public java.util.List o(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i17) {
        return this.f312672r;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f
    public boolean q(int i17) {
        return this.f312671q.contains(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f
    public void u() {
        i95.m c17 = i95.n0.c(su4.x0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) c17)).aj().getClass();
        java.lang.String f17 = su4.r2.f(3206);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = this.f156222o;
        if (aVar != null) {
            aVar.q(f17);
        }
    }
}
