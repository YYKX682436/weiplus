package hw2;

/* loaded from: classes5.dex */
public final class c implements com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hw2.e f285507a;

    public c(hw2.e eVar) {
        this.f285507a = eVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void a() {
        this.f285507a.b();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", info);
        this.f285507a.f285513e.w(ju3.c0.f301869b2, bundle);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void d() {
        ju3.d0.k(this.f285507a.f285513e, ju3.c0.f301870c2, null, 2, null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void g(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z17);
        this.f285507a.f285513e.w(ju3.c0.X, bundle);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void m(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        hw2.e eVar = this.f285507a;
        if (kotlin.jvm.internal.o.b(eVar.f285519n, audioCacheInfo)) {
            if (eVar.f285519n != null) {
                eVar.c();
                return;
            }
            return;
        }
        ju3.d0 d0Var = eVar.f285513e;
        if (audioCacheInfo == null) {
            eVar.f285519n = audioCacheInfo;
            iu3.i iVar = eVar.f285514f;
            if (iVar != null) {
                com.tencent.mars.xlog.Log.i(iVar.f295007b, "reset music");
                kk4.v vVar = iVar.f295008c;
                if (vVar != null) {
                    vVar.stop();
                }
                kk4.v vVar2 = iVar.f295008c;
                if (vVar2 != null) {
                    vVar2.recycle();
                }
                iVar.f295008c = null;
            }
            ju3.d0.k(d0Var, ju3.c0.Y, null, 2, null);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
            d0Var.w(ju3.c0.Z, bundle);
            d0Var.w(ju3.c0.f301911x, null);
            return;
        }
        if (audioCacheInfo.f155718o == 2) {
            eVar.b();
            ju3.d0.k(d0Var, ju3.c0.U, null, 2, null);
            return;
        }
        eVar.f285519n = audioCacheInfo;
        ju3.d0.k(d0Var, ju3.c0.Y, null, 2, null);
        if (eVar.f285521p) {
            eVar.f285521p = false;
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = eVar.f285515g;
            if (editorAudioView != null) {
                editorAudioView.postDelayed(eVar.f285524s, eVar.f285522q);
            }
        } else if (eVar.f285520o) {
            iu3.i iVar2 = eVar.f285514f;
            if (iVar2 != null) {
                iVar2.b(eVar.f285519n);
            }
        } else {
            iu3.i iVar3 = eVar.f285514f;
            if (iVar3 != null) {
                iVar3.c(eVar.f285519n);
            }
        }
        wt3.v vVar3 = wt3.v.f449505i;
        if (vVar3 != null) {
            vVar3.d(audioCacheInfo.f155711e, audioCacheInfo.f155719p);
        }
    }
}
