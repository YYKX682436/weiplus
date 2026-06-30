package iu3;

/* loaded from: classes5.dex */
public final class b implements com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu3.e f294986a;

    public b(iu3.e eVar) {
        this.f294986a = eVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void a() {
        this.f294986a.f294997m.a();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", info);
        this.f294986a.f294992e.w(ju3.c0.f301869b2, bundle);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
        if (lyricsInfos.isEmpty()) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST", new com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo(lyricsInfos));
        bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", z17);
        this.f294986a.f294992e.w(ju3.c0.Z, bundle);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void d() {
        ju3.d0.k(this.f294986a.f294992e, ju3.c0.f301870c2, null, 2, null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void g(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z17);
        this.f294986a.f294992e.w(ju3.c0.X, bundle);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.lang.String sourceTabID, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(sourceTabID, "sourceTabID");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void m(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        iu3.e eVar = this.f294986a;
        if (audioCacheInfo == null) {
            eVar.f294994g.setVisibility(8);
            eVar.f294998n = null;
            eVar.f294997m.a();
            android.view.View view = eVar.f294995h;
            kotlin.jvm.internal.o.g(view, "view");
            view.setTag(com.tencent.mm.R.id.f482773nl, i65.a.r(view.getContext(), com.tencent.mm.R.string.f489971h0));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
            eVar.f294992e.w(ju3.c0.Z, bundle);
            eVar.f294992e.w(ju3.c0.f301911x, null);
            return;
        }
        if (audioCacheInfo.f155718o == 2) {
            eVar.f294997m.a();
            return;
        }
        eVar.f294994g.setVisibility(0);
        eVar.f294998n = audioCacheInfo;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("EDIT_SELECT_MUSIC_PARCELABLE", audioCacheInfo);
        eVar.f294992e.w(ju3.c0.Y, bundle2);
        eVar.f294997m.b(audioCacheInfo);
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_MUSIC_ID_STRING", audioCacheInfo.e());
        iVar.n("KEY_MUSIC_INDEX_INT", java.lang.Integer.valueOf(audioCacheInfo.f155719p == 4 ? 0 : audioCacheInfo.f155726w + 1));
        iVar.n("KEY_MUSIC_REQ_ID_INT", java.lang.Long.valueOf(audioCacheInfo.f155727x));
        iVar.n("KEY_SEARCH_MUSIC_INT", java.lang.Integer.valueOf(audioCacheInfo.f155719p == 4 ? 1 : 0));
        java.lang.String str = audioCacheInfo.D;
        if (str == null) {
            str = "";
        }
        iVar.n("KEY_MUSIC_SESSION_BUFFER", str);
        android.view.View view2 = eVar.f294995h;
        kotlin.jvm.internal.o.g(view2, "view");
        view2.setTag(com.tencent.mm.R.id.f482773nl, i65.a.r(view2.getContext(), com.tencent.mm.R.string.f489970gz));
        wt3.u uVar = wt3.v.f449504h;
        wt3.v vVar = wt3.v.f449505i;
        if (vVar != null) {
            vVar.d(audioCacheInfo.f155711e, audioCacheInfo.f155719p);
        }
    }
}
