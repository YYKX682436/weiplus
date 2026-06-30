package nv3;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final nv3.k f340686a = new nv3.k();

    public final void a(android.view.View view, rv3.h feed) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.MusicClipRangeBarView musicClipRangeBarView;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout musicPickerComponentLayout;
        jz5.l lVar;
        yz5.l lVar2;
        yz5.l musicClipPlayProgressListenerRegistrar$plugin_recordvideo_release;
        yz5.l lVar3;
        yz5.p musicClipInitialRangeProvider$plugin_recordvideo_release;
        android.view.View itemView = view;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
        android.content.Context context = view.getContext();
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = feed.f400395d;
        long j17 = audioCacheInfo.f155720q;
        int i17 = audioCacheInfo.f155711e;
        while (true) {
            musicClipRangeBarView = null;
            if (itemView == null) {
                musicPickerComponentLayout = null;
                break;
            } else if (itemView instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout) {
                musicPickerComponentLayout = (com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout) itemView;
                break;
            } else {
                java.lang.Object parent = itemView.getParent();
                itemView = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show: musicId=");
        sb6.append(i17);
        sb6.append(" totalDurationMs=");
        sb6.append(j17);
        sb6.append(" hasBusinessChannel=");
        sb6.append((musicPickerComponentLayout != null ? musicPickerComponentLayout.getMusicClipChangeListener$plugin_recordvideo_release() : null) != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderMusicClipHelper", sb6.toString());
        if (musicPickerComponentLayout == null || (musicClipInitialRangeProvider$plugin_recordvideo_release = musicPickerComponentLayout.getMusicClipInitialRangeProvider$plugin_recordvideo_release()) == null || (lVar = (jz5.l) musicClipInitialRangeProvider$plugin_recordvideo_release.invoke(audioCacheInfo, java.lang.Long.valueOf(j17))) == null) {
            lVar = new jz5.l(0L, java.lang.Long.valueOf(j17));
        }
        long longValue = ((java.lang.Number) lVar.f302833d).longValue();
        long longValue2 = ((java.lang.Number) lVar.f302834e).longValue();
        kotlin.jvm.internal.o.d(context);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j jVar = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j(context);
        if (j17 < 0) {
            j17 = 0;
        }
        jVar.f156263c = j17;
        long h17 = e06.p.h(longValue, 0L, j17);
        jVar.f156264d = h17;
        jVar.f156265e = e06.p.h(longValue2, h17, jVar.f156263c);
        jVar.f156271k = new nv3.j(i17, musicPickerComponentLayout, audioCacheInfo);
        yz5.l lVar4 = jVar.f156270j;
        if (musicPickerComponentLayout != null && (musicClipPlayProgressListenerRegistrar$plugin_recordvideo_release = musicPickerComponentLayout.getMusicClipPlayProgressListenerRegistrar$plugin_recordvideo_release()) != null) {
            if (jVar.f156272l) {
                yz5.l lVar5 = jVar.f156269i;
                if (lVar5 != null) {
                    lVar5.invoke(null);
                }
                jVar.f156272l = false;
            }
            jVar.f156269i = musicClipPlayProgressListenerRegistrar$plugin_recordvideo_release;
            com.tencent.mm.ui.widget.dialog.y1 y1Var = jVar.f156262b;
            if ((y1Var != null && y1Var.f()) && (lVar3 = jVar.f156269i) != null && !jVar.f156272l) {
                lVar3.invoke(lVar4);
                jVar.f156272l = true;
            }
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = jVar.f156262b;
        if (y1Var2 != null && y1Var2.f()) {
            return;
        }
        android.content.Context context2 = jVar.f156261a;
        com.tencent.mm.ui.widget.dialog.y1 y1Var3 = new com.tencent.mm.ui.widget.dialog.y1(context2);
        y1Var3.d(true);
        android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.eky, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.uih);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        jVar.f156267g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.uig);
        jVar.f156268h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.uic);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.MusicClipRangeBarView musicClipRangeBarView2 = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.MusicClipRangeBarView) inflate.findViewById(com.tencent.mm.R.id.uid);
        if (musicClipRangeBarView2 != null) {
            long j18 = jVar.f156263c;
            long j19 = jVar.f156264d;
            long j27 = jVar.f156265e;
            long max = java.lang.Math.max(0L, j18);
            musicClipRangeBarView2.G = max;
            long h18 = e06.p.h(j19, 0L, max);
            long h19 = e06.p.h(j27, h18, musicClipRangeBarView2.G);
            musicClipRangeBarView2.H = h18;
            long j28 = h19 - h18;
            long j29 = musicClipRangeBarView2.f156144J;
            if (j28 < j29) {
                h19 = java.lang.Math.min(musicClipRangeBarView2.G, h18 + j29);
            }
            musicClipRangeBarView2.I = h19;
            musicClipRangeBarView2.K = -1L;
            musicClipRangeBarView2.invalidate();
            musicClipRangeBarView2.setOnRangeChanging(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h(jVar));
            musicClipRangeBarView2.setOnRangeChanged(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i(jVar));
            musicClipRangeBarView = musicClipRangeBarView2;
        }
        jVar.f156266f = musicClipRangeBarView;
        jVar.a();
        y1Var3.f212037s = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.q1(jVar, y1Var3);
        y1Var3.k(inflate);
        jVar.f156262b = y1Var3;
        y1Var3.s();
        if (jVar.f156262b != y1Var3 || (lVar2 = jVar.f156269i) == null || jVar.f156272l) {
            return;
        }
        lVar2.invoke(lVar4);
        jVar.f156272l = true;
    }
}
