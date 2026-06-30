package yo4;

/* loaded from: classes5.dex */
public final class e extends no4.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f464195i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yo4.p f464196j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ju3.d0 d0Var, yo4.p pVar, android.os.Bundle bundle, com.tencent.mm.plugin.vlog.model.i0 i0Var) {
        super(bundle, i0Var);
        this.f464195i = d0Var;
        this.f464196j = pVar;
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void a() {
        this.f464196j.D();
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", info);
        this.f464195i.w(ju3.c0.f301869b2, bundle);
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
        android.os.Bundle bundle = new android.os.Bundle();
        if (lyricsInfos.isEmpty()) {
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
        } else {
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", z17);
            bundle.putParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST", new com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo(lyricsInfos));
        }
        this.f464195i.w(ju3.c0.Z, bundle);
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void d() {
        ju3.d0.k(this.f464195i, ju3.c0.f301870c2, null, 2, null);
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void g(boolean z17) {
        super.g(z17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z17);
        this.f464195i.w(ju3.c0.X, bundle);
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void m(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        super.m(audioCacheInfo);
        com.tencent.mars.xlog.Log.i("MusicPickerReportCallback", "onAudioSelected:" + audioCacheInfo);
        yo4.p pVar = this.f464196j;
        if (kotlin.jvm.internal.o.b(pVar.f464287r, audioCacheInfo)) {
            if (pVar.f464287r != null) {
                pVar.G();
                return;
            }
            return;
        }
        android.widget.ImageView imageView = pVar.f464281i;
        ju3.d0 d0Var = this.f464195i;
        if (audioCacheInfo == null) {
            pVar.f464292w = 0L;
            pVar.f464287r = audioCacheInfo;
            com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "unSelectAudio: ");
            imageView.setVisibility(8);
            pVar.f464287r = null;
            pVar.D();
            pVar.M("");
            ju3.d0.k(d0Var, ju3.c0.Y, null, 2, null);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
            d0Var.w(ju3.c0.Z, bundle);
            d0Var.w(ju3.c0.f301911x, null);
            return;
        }
        if (audioCacheInfo.f155718o == 2) {
            ju3.d0.k(d0Var, ju3.c0.U, null, 2, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MusicPickerReportCallback", "play music:" + audioCacheInfo.f155712f + " cached:" + audioCacheInfo.f155716m + " cachePath:" + audioCacheInfo.f155715i + "  cacheFile:" + com.tencent.mm.vfs.w6.j(audioCacheInfo.f155715i) + ", soundTrack=" + audioCacheInfo.f155719p);
        if ((audioCacheInfo.f155716m && android.text.TextUtils.isEmpty(audioCacheInfo.f155715i)) || (!audioCacheInfo.f155716m && android.text.TextUtils.isEmpty(audioCacheInfo.f155712f))) {
            com.tencent.mm.autogen.mmdata.rpt.TestKvReportStruct testKvReportStruct = new com.tencent.mm.autogen.mmdata.rpt.TestKvReportStruct();
            testKvReportStruct.f61086g = 2020;
            testKvReportStruct.f61085f = testKvReportStruct.b("MsgExt", "null music url", true);
            testKvReportStruct.k();
            return;
        }
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = pVar.f464287r;
        if (audioCacheInfo2 != null) {
            java.lang.String a17 = audioCacheInfo2.a();
            java.lang.String a18 = audioCacheInfo.a();
            if (a18 != null) {
                if (!kotlin.jvm.internal.o.b(a17, a18)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "[syncMusicClipStateOnAudioSelected] switch music, clear trim previousMusicId=" + audioCacheInfo2.f155711e + ", newMusicId=" + audioCacheInfo.f155711e);
                    audioCacheInfo2.G = null;
                    audioCacheInfo2.H = null;
                    audioCacheInfo.G = null;
                    audioCacheInfo.H = null;
                } else if (audioCacheInfo2 != audioCacheInfo) {
                    if (audioCacheInfo2.g()) {
                        audioCacheInfo.G = audioCacheInfo2.G;
                        audioCacheInfo.H = audioCacheInfo2.H;
                    } else {
                        audioCacheInfo.G = null;
                        audioCacheInfo.H = null;
                    }
                }
            }
        }
        pVar.M(audioCacheInfo.f155723t);
        imageView.setVisibility(0);
        pVar.f464287r = audioCacheInfo;
        ju3.d0.k(d0Var, ju3.c0.Y, null, 2, null);
        pVar.f464285p.b(audioCacheInfo);
        pVar.f464292w = audioCacheInfo.f155720q;
        java.util.Iterator it = ((java.util.ArrayList) pVar.f464293x).iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_MUSIC_INDEX_INT", java.lang.Integer.valueOf(audioCacheInfo.f155719p == 4 ? 0 : audioCacheInfo.f155726w + 1));
        iVar.n("KEY_MUSIC_REQ_ID_INT", java.lang.Long.valueOf(audioCacheInfo.f155727x));
        iVar.n("KEY_SEARCH_MUSIC_INT", java.lang.Integer.valueOf(audioCacheInfo.f155719p == 4 ? 1 : 0));
        wt3.v vVar = wt3.v.f449505i;
        if (vVar != null) {
            vVar.d(audioCacheInfo.f155711e, audioCacheInfo.f155719p);
        }
    }
}
