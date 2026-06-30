package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class m1 extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f156295q;

    /* renamed from: r, reason: collision with root package name */
    public final sv3.b f156296r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1 f156297s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l1 f156298t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, int i17) {
        super(parent, status, i17);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f156295q = "MicroMsg.TemplateClipMusicCallbackComponent";
        this.f156296r = new sv3.b(0, null, 3, null);
        this.f156297s = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1(this);
        this.f156298t = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l1(this, status);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f
    public void t(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2;
        sv3.a aVar = this.f156220m;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3 = aVar.f413388b;
        java.lang.String a17 = audioCacheInfo != null ? audioCacheInfo.a() : null;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo4 = aVar.f413388b;
        kotlin.jvm.internal.o.b(a17, audioCacheInfo4 != null ? audioCacheInfo4.a() : null);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar2 = this.f156222o;
        ev3.a aVar3 = aVar2 instanceof ev3.a ? (ev3.a) aVar2 : null;
        if (aVar3 != null) {
            ((zy0.c) aVar3).t(audioCacheInfo, this.f156297s);
        }
        int i17 = aVar.f413387a;
        if (audioCacheInfo == null && (audioCacheInfo2 = aVar.f413388b) != null) {
            r(audioCacheInfo2, i17);
        }
        if (audioCacheInfo != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo5 = aVar.f413388b;
            if (kotlin.jvm.internal.o.b(audioCacheInfo5 != null ? audioCacheInfo5.a() : null, audioCacheInfo.a())) {
                s(aVar.f413388b, i17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f
    public ev3.d w() {
        return this.f156298t;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f
    public void y(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentSelectedAudio: loading ");
        sv3.b bVar = this.f156296r;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = bVar.f413390b;
        sb6.append(audioCacheInfo2 != null ? audioCacheInfo2.a() : null);
        sb6.append(", new ");
        sb6.append(audioCacheInfo != null ? audioCacheInfo.a() : null);
        com.tencent.mars.xlog.Log.i(this.f156295q, sb6.toString());
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3 = bVar.f413390b;
        if (!kotlin.jvm.internal.o.b(audioCacheInfo3 != null ? audioCacheInfo3.a() : null, audioCacheInfo != null ? audioCacheInfo.a() : null)) {
            r(bVar.f413390b, bVar.f413389a);
            bVar.f413390b = audioCacheInfo;
            bVar.f413389a = i17;
        }
        if (i17 == 16) {
            if ((audioCacheInfo != null ? audioCacheInfo.C : null) != null) {
                wv3.b.f450049b.add(audioCacheInfo.C);
            }
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = this.f156222o;
        ev3.a aVar2 = aVar instanceof ev3.a ? (ev3.a) aVar : null;
        if (aVar2 != null) {
            ((zy0.c) aVar2).t(audioCacheInfo, this.f156297s);
        }
    }
}
