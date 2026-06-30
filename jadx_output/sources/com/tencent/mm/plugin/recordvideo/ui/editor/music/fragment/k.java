package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment f156417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment) {
        super(1);
        this.f156417d = musicPickerRecommendDataFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wt3.v vVar;
        java.util.LinkedList it = (java.util.LinkedList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment = this.f156417d;
        boolean z17 = musicPickerRecommendDataFragment.f156398q;
        java.lang.String str = musicPickerRecommendDataFragment.f156396o;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "EditorView has been destroyed, skip callback");
        } else {
            musicPickerRecommendDataFragment.f156400s = !it.isEmpty();
            dv3.c cVar = musicPickerRecommendDataFragment.f156381e;
            if (cVar != null) {
                cVar.P0(1);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = it.iterator();
            int i17 = 0;
            while (true) {
                if (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo c17 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.c((r45.mh4) next, 1);
                    c17.h();
                    c17.f155719p = musicPickerRecommendDataFragment.J0();
                    c17.f155726w = i17;
                    wt3.e eVar = musicPickerRecommendDataFragment.f156397p;
                    if (eVar != null) {
                        r8 = eVar.f449394c;
                    }
                    c17.f155727x = r8;
                    arrayList.add(c17);
                    i17 = i18;
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResult:audioList size=");
                    sb6.append(it.size());
                    sb6.append(", mAdapter oldItemCount=");
                    dv3.c cVar2 = musicPickerRecommendDataFragment.f156381e;
                    sb6.append(cVar2 != null ? java.lang.Integer.valueOf(cVar2.getItemCount()) : null);
                    sb6.append(", pendingKeepSelected=");
                    com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = musicPickerRecommendDataFragment.f156402u;
                    sb6.append(audioCacheInfo != null ? audioCacheInfo.f155723t : null);
                    sb6.append(", suppressAutoPlayThisRefresh=");
                    sb6.append(musicPickerRecommendDataFragment.f156403v);
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                    dv3.c cVar3 = musicPickerRecommendDataFragment.f156381e;
                    if ((cVar3 != null && cVar3.getItemCount() == 0) && arrayList.isEmpty()) {
                        musicPickerRecommendDataFragment.y0();
                    } else {
                        musicPickerRecommendDataFragment.z0();
                        dv3.c cVar4 = musicPickerRecommendDataFragment.f156381e;
                        if (cVar4 != null) {
                            dv3.c.F0(cVar4, arrayList, false, 2, null);
                        }
                    }
                    dv3.c cVar5 = musicPickerRecommendDataFragment.f156381e;
                    if (cVar5 != null && cVar5.K == 1) {
                        musicPickerRecommendDataFragment.A0();
                    }
                    if (musicPickerRecommendDataFragment.f156400s && (vVar = wt3.v.f449505i) != null) {
                        wt3.e eVar2 = musicPickerRecommendDataFragment.f156397p;
                        vVar.f449510d = eVar2 != null ? eVar2.f449394c : -1L;
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
