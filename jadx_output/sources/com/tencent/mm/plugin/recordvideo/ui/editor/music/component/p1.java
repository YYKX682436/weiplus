package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public class p1 extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status) {
        super(parent, status, false);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public boolean B() {
        return this.f156185z > 0;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void i0(java.util.ArrayList audioList, boolean z17) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        super.i0(audioList, z17);
        dv3.c cVar = this.f156180u;
        if (cVar != null) {
            cVar.I0();
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public in5.s r(yz5.a aVar, yz5.p pVar) {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.TemplateClipMusicSearchInputComponent$buildRVItemConverts$1(pVar, aVar);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public dv3.c s(java.util.ArrayList initData) {
        kotlin.jvm.internal.o.g(initData, "initData");
        return new dv3.f(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.TemplateClipMusicSearchInputComponent$buildRVItemConverts$1(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.o1(this), new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.n1(this)), initData);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo t(r45.mh4 protoInfo) {
        kotlin.jvm.internal.o.g(protoInfo, "protoInfo");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo t17 = super.t(protoInfo);
        t17.f155711e = t17.C.hashCode();
        return t17;
    }
}
