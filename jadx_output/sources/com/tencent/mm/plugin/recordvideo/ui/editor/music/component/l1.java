package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class l1 implements ev3.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 f156288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 f156289e;

    public l1(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 m1Var, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 j0Var) {
        this.f156288d = m1Var;
        this.f156289e = j0Var;
    }

    @Override // ev3.d
    public void c(int i17, ev3.c cVar) {
        this.f156288d.f156221n.put(java.lang.Integer.valueOf(i17), cVar);
    }

    @Override // ev3.d
    public void k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i17, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 m1Var = this.f156288d;
        java.lang.String str = m1Var.f156295q;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = m1Var.f156222o;
        if (aVar != null) {
            aVar.k(audioCacheInfo, java.lang.String.valueOf(i17), view, z18, z17, bundle);
        }
    }

    @Override // ev3.d
    public void l(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 m1Var = this.f156288d;
        if (z17) {
            if (audioCacheInfo != null) {
                m1Var.y(i17, audioCacheInfo, z18);
                wv3.b.f450048a.c(audioCacheInfo, z19, i17);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(m1Var.f156295q, "onSelectMusic: false, same=" + kotlin.jvm.internal.o.b(m1Var.f156220m.f413388b, audioCacheInfo));
        if (audioCacheInfo == null || !kotlin.jvm.internal.o.b(m1Var.f156220m.f413388b, audioCacheInfo)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_boolean", true);
        this.f156289e.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156253p, bundle);
    }
}
