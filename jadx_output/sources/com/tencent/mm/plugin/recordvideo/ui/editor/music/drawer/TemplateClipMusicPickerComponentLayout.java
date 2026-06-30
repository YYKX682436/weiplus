package com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/drawer/TemplateClipMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "", "getPageTypeArray", "", "getDefaultSelectPageTabType", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerTemplateClipRecommendFragment;", "getDefaultTabFragmentInstance", "", "Lcom/tencent/maas/model/MJMusicInfo;", "musicList", "Ljz5/f0;", "setLocalMJMusicInfoList", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class TemplateClipMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateClipMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getDefaultSelectPageTabType() {
        return 5;
    }

    public com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment getDefaultTabFragmentInstance() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment) e(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment.class);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int[] getPageTypeArray() {
        return new int[]{5};
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout, fv3.c
    public void j(fv3.d status, android.os.Bundle bundle) {
        zy0.f fVar;
        kotlin.jvm.internal.o.g(status, "status");
        super.j(status, bundle);
        if (status != com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156256s || bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("key_string_1", "");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 m1Var = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1) d17 : null;
        if (m1Var != null) {
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = m1Var.f156222o;
            ev3.a aVar2 = aVar instanceof ev3.a ? (ev3.a) aVar : null;
            if (aVar2 == null || (fVar = ((zy0.c) aVar2).f477310a.f477315d) == null) {
                return;
            }
            mz0.b2 b2Var = ((mz0.n0) fVar).f333005a;
            b2Var.G7(b2Var.o7().a(), string);
            android.app.Activity context = b2Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69789m.f245056g = "";
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f k() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1(this, this, getDefaultSelectPageTabType());
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_music_search_use_finder_cgi, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.XConfigUtil", "isMusicSearchUseFinderCgi:" + fj6);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 bVar = fj6 ? new uv3.b(this, this, null, true, 4, null) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.p1(this, this);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        bVar.A = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
        bVar.B = d18 != null ? d18.f156223p : null;
        return bVar;
    }

    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r(com.tencent.maas.model.MJMusicInfo it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo b17 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.b(it, 1);
        b17.f155719p = 3;
        b17.f155722s = true;
        return b17;
    }

    public final void setLocalAudioList(java.util.List<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> audioList) {
        rv3.h L0;
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment defaultTabFragmentInstance = getDefaultTabFragmentInstance();
        if (defaultTabFragmentInstance != null) {
            java.lang.String str = "setLocalAudioList: size=" + audioList.size();
            java.lang.String str2 = defaultTabFragmentInstance.f156406o;
            com.tencent.mars.xlog.Log.i(str2, str);
            dv3.c cVar = defaultTabFragmentInstance.f156381e;
            if (cVar != null) {
                cVar.T0(audioList);
            }
            dv3.c cVar2 = defaultTabFragmentInstance.f156381e;
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (cVar2 == null || (L0 = cVar2.L0()) == null) ? null : L0.f400395d;
            if (audioCacheInfo != null) {
                java.lang.String a17 = audioCacheInfo.a();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryPlayCurrentFirstAudio: now ");
                sb6.append(a17);
                sb6.append(' ');
                sb6.append(audioCacheInfo.f155723t);
                sb6.append(", old ");
                dv3.c cVar3 = defaultTabFragmentInstance.f156381e;
                sb6.append(cVar3 != null ? cVar3.f243996J : null);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                audioCacheInfo.f155709J = true;
                dv3.c cVar4 = defaultTabFragmentInstance.f156381e;
                if (kotlin.jvm.internal.o.b(a17, cVar4 != null ? cVar4.f243996J : null)) {
                    dv3.c cVar5 = defaultTabFragmentInstance.f156381e;
                    if (cVar5 != null) {
                        cVar5.I0();
                    }
                } else {
                    dv3.c cVar6 = defaultTabFragmentInstance.f156381e;
                    if (cVar6 != null) {
                        cVar6.S0(audioCacheInfo.a());
                    }
                    ev3.d dVar = defaultTabFragmentInstance.f156380d;
                    if (dVar != null) {
                        ev3.d.e(dVar, 5, audioCacheInfo, true, false, true, 8, null);
                    }
                    wv3.b.f450048a.d(audioCacheInfo, false);
                }
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = defaultTabFragmentInstance.f156382f;
                if (wxRecyclerView != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerTemplateClipRecommendFragment", "tryPlayCurrentFirstAudio", "()V", "Undefined", "scrollToPosition", "(I)V");
                    wxRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerTemplateClipRecommendFragment", "tryPlayCurrentFirstAudio", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
        }
    }

    public final void setLocalMJMusicInfoList(java.util.List<? extends com.tencent.maas.model.MJMusicInfo> musicList) {
        kotlin.jvm.internal.o.g(musicList, "musicList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(musicList, 10));
        java.util.Iterator<T> it = musicList.iterator();
        while (it.hasNext()) {
            arrayList.add(r((com.tencent.maas.model.MJMusicInfo) it.next()));
        }
        setLocalAudioList(arrayList);
    }
}
