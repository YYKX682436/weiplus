package uu2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final uu2.b f431269a = new uu2.b();

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider a() {
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoEditorConfig", "getAlbumProvider");
        hp.b bVar = new hp.b();
        bVar.e(true);
        bVar.g(true);
        bVar.c(false);
        bVar.b(true);
        bVar.i(com.tencent.mm.R.drawable.f481057jk, 0, "", 0);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider d17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.d("", "");
        d17.F = 11;
        d17.f155677o = bVar.f282904a;
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        com.tencent.mm.modelcontrol.VideoTransPara K2 = com.tencent.mm.plugin.finder.storage.t70.f127590a.K2();
        d17.f155676n = K2;
        d17.f155679q = 3;
        d17.f155685w = K2.f71195h * 1000;
        bVar.h(false);
        b(d17, false);
        return d17;
    }

    public final void b(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, boolean z17) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_use_timeline_editor, true);
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoEditorConfig", "useTimelineEditor: " + fj6);
        if (fj6) {
            recordConfigProvider.a(4, com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout.class.getName());
        } else {
            recordConfigProvider.a(4, com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.class.getName());
        }
        recordConfigProvider.a(3, com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.class.getName());
        recordConfigProvider.a(1, com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.class.getName());
        recordConfigProvider.a(0, com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout.class.getName());
        if (z17) {
            ts2.a aVar = ts2.a.f421620a;
            if (!py0.b.f358971a.a()) {
                recordConfigProvider.a(0, com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout.class.getName());
            } else {
                recordConfigProvider.a(0, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.class.getName());
                recordConfigProvider.M.putInt("key_camera_instance", 3);
            }
        }
    }
}
