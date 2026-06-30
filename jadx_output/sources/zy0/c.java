package zy0;

/* loaded from: classes5.dex */
public final class c implements ev3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy0.e f477310a;

    public c(zy0.e eVar) {
        this.f477310a = eVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void g(boolean z17) {
        zy0.e eVar = this.f477310a;
        yz5.l lVar = eVar.f477314c;
        if (lVar != null) {
            lVar.invoke(new dz0.i(null, java.lang.Boolean.valueOf(z17), 1, null));
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = eVar.f477316e;
        if (aVar != null) {
            aVar.g(z17);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.lang.String sourceTabID, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(sourceTabID, "sourceTabID");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "bgm_panel_song_item");
        aVar.Ai(view, new zy0.a(audioCacheInfo, sourceTabID));
        zy0.e eVar = this.f477310a;
        aVar.Vj(view, 40, new zy0.b(eVar, "bgm_panel_song_item"));
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar2 = eVar.f477316e;
        if (aVar2 != null) {
            aVar2.k(audioCacheInfo, sourceTabID, view, z17, z18, bundle);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void m(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        t(audioCacheInfo, null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void s(boolean z17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = this.f477310a.f477316e;
        if (aVar != null) {
            aVar.s(z17, audioCacheInfo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r7, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c r8) {
        /*
            r6 = this;
            zy0.e r0 = r6.f477310a
            java.lang.String r1 = r0.f477318g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onAudioSelected: new:"
            r2.<init>(r3)
            r3 = 0
            if (r7 == 0) goto L11
            java.lang.String r4 = r7.C
            goto L12
        L11:
            r4 = r3
        L12:
            r2.append(r4)
            java.lang.String r4 = " cur:"
            r2.append(r4)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = r0.f477320i
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.C
            goto L22
        L21:
            r4 = r3
        L22:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            r1 = 2
            if (r7 == 0) goto L5e
            java.lang.String r2 = r7.C
            int r2 = r2.length()
            if (r2 != 0) goto L39
            r2 = 1
            goto L3a
        L39:
            r2 = 0
        L3a:
            if (r2 == 0) goto L44
            java.lang.String r7 = r0.f477318g
            java.lang.String r8 = "onAudioSelected: mjMusicId null"
            com.tencent.mars.xlog.Log.i(r7, r8)
            return
        L44:
            yz5.l r2 = r0.f477314c
            if (r2 == 0) goto L52
            dz0.i r4 = new dz0.i
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.<init>(r5, r3, r1, r3)
            r2.invoke(r4)
        L52:
            yz5.p r2 = r0.f477313b
            if (r2 == 0) goto L5e
            java.lang.String r4 = r7.C
            r2.invoke(r4, r8)
            jz5.f0 r8 = jz5.f0.f302826a
            goto L5f
        L5e:
            r8 = r3
        L5f:
            if (r8 != 0) goto L76
            yz5.l r8 = r0.f477314c
            if (r8 == 0) goto L6f
            dz0.i r2 = new dz0.i
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.<init>(r4, r3, r1, r3)
            r8.invoke(r2)
        L6f:
            java.lang.String r8 = "clear music"
            java.lang.String r1 = r0.f477318g
            com.tencent.mars.xlog.Log.i(r1, r8)
        L76:
            if (r7 == 0) goto L7b
            java.lang.String r8 = r7.C
            goto L7c
        L7b:
            r8 = r3
        L7c:
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = r0.f477320i
            if (r1 == 0) goto L83
            java.lang.String r1 = r1.C
            goto L84
        L83:
            r1 = r3
        L84:
            boolean r8 = kotlin.jvm.internal.o.b(r8, r1)
            if (r8 != 0) goto Lb0
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$a r8 = r0.f477316e
            if (r8 == 0) goto L91
            r8.m(r7)
        L91:
            yz5.q r8 = r0.f477317f
            if (r8 == 0) goto Lb0
            if (r7 == 0) goto L9a
            java.lang.String r1 = r7.C
            goto L9b
        L9a:
            r1 = r3
        L9b:
            if (r7 == 0) goto La4
            r45.pg4 r2 = r7.A
            if (r2 == 0) goto La4
            java.lang.String r2 = r2.f383018d
            goto La5
        La4:
            r2 = r3
        La5:
            if (r7 == 0) goto Lad
            boolean r3 = r7.K
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        Lad:
            r8.invoke(r1, r2, r3)
        Lb0:
            r0.f477320i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zy0.c.t(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c):void");
    }
}
