package com.tencent.mm.plugin.vlog.ui.timelineeditor.scene;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorFollowMusicPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorPlatformVideoPluginLayout;", "Lyo4/p;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljz5/g;", "getMusicPlugin", "()Lyo4/p;", "musicPlugin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TimelineEditorFollowMusicPluginLayout extends com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public final jz5.g musicPlugin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineEditorFollowMusicPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.musicPlugin = jz5.h.b(new pp4.f(this));
    }

    private final yo4.p getMusicPlugin() {
        return (yo4.p) ((jz5.n) this.musicPlugin).getValue();
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout, com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout
    public java.lang.String C() {
        return "MicroMsg.TimelineEditorFollowMusicPluginLayout";
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "init logic " + configProvider);
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout, com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        yo4.p musicPlugin;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo2;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo3;
        android.os.Bundle bundle3;
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        android.os.Bundle bundle4;
        android.os.Bundle bundle5;
        android.os.Bundle bundle6;
        java.lang.String string;
        android.os.Bundle bundle7;
        android.os.Bundle bundle8;
        android.os.Bundle bundle9;
        android.os.Bundle bundle10;
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "loadCurrentPage:" + bVar);
        java.lang.Integer num = null;
        java.lang.String string2 = (bVar == null || (bundle10 = bVar.f222217n) == null) ? null : bundle10.getString("KEY_ORIGIN_MUSIC_PATH");
        boolean z18 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (bVar == null || (bundle = bVar.f222217n) == null) ? null : (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) bundle.getParcelable("KEY_SELECT_AUDIO_INFO");
            if (audioCacheInfo != null && (musicPlugin = getMusicPlugin()) != null) {
                musicPlugin.J(kz5.b0.c(audioCacheInfo));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "initFollowMusicLogic audioInfo2:" + audioCacheInfo);
        } else {
            boolean G = G();
            java.lang.String str3 = "";
            if (bVar == null || (bundle9 = bVar.f222217n) == null || (str = bundle9.getString("KEY_ORIGIN_MUSIC_NAME")) == null) {
                str = "";
            }
            int i17 = (bVar == null || (bundle8 = bVar.f222217n) == null) ? 0 : bundle8.getInt("KEY_ORIGIN_MUSIC_PLAY_DURATION", 0);
            if (!G || i17 <= 0) {
                i17 = (int) getMaxCropVideoDurationMs();
            }
            if (bVar == null || (bundle7 = bVar.f222217n) == null || (str2 = bundle7.getString("KEY_ORIGIN_MUSIC_AUTHOR")) == null) {
                str2 = "";
            }
            java.util.ArrayList arrayList = (!G || kotlin.jvm.internal.o.b(str2, "")) ? new java.util.ArrayList() : kz5.c0.d(str2);
            if (G && bVar != null && (bundle6 = bVar.f222217n) != null && (string = bundle6.getString("KEY_ORIGIN_MUSIC_COVER_URL")) != null) {
                str3 = string;
            }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
            audioCacheInfo2.f155711e = (int) java.lang.System.currentTimeMillis();
            audioCacheInfo2.f155719p = (bVar == null || (bundle5 = bVar.f222217n) == null) ? false : bundle5.getBoolean("KEY_BGM_IF_ORIGIN") ? 1 : 2;
            audioCacheInfo2.f155716m = true;
            audioCacheInfo2.f155722s = true;
            audioCacheInfo2.f155715i = string2;
            audioCacheInfo2.f155723t = str;
            audioCacheInfo2.f155720q = i17;
            audioCacheInfo2.f155725v = str3;
            audioCacheInfo2.f155714h = arrayList;
            yo4.p musicPlugin2 = getMusicPlugin();
            if (musicPlugin2 != null) {
                musicPlugin2.J(kz5.b0.c(audioCacheInfo2));
            }
            boolean z19 = (bVar == null || (bundle4 = bVar.f222217n) == null) ? false : bundle4.getBoolean("KEY_DISABLE_ADD_MUSIC");
            yo4.p musicPlugin3 = getMusicPlugin();
            if (musicPlugin3 != null && musicPlugin3.f464291v != (!z19)) {
                musicPlugin3.f464291v = z17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "initFollowMusicLogic audioInfo1:" + audioCacheInfo2);
        }
        if (bVar != null && (bundle3 = bVar.f222217n) != null) {
            z18 = bundle3.getBoolean("KEY_MEDIA_MUTE", false);
        }
        setMediaMute(z18);
        super.r(bVar);
        android.content.Context context = getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            android.content.Intent intent = activity.getIntent();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
            intent.putExtra("key_ref_feed_id", (configProvider == null || (videoCaptureReportInfo3 = configProvider.I) == null) ? null : java.lang.Long.valueOf(videoCaptureReportInfo3.f155694h));
            android.content.Intent intent2 = activity.getIntent();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider2 = getConfigProvider();
            intent2.putExtra("key_ref_feed_dup_flag", (configProvider2 == null || (videoCaptureReportInfo2 = configProvider2.I) == null) ? null : videoCaptureReportInfo2.f155695i);
            android.content.Intent intent3 = activity.getIntent();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider3 = getConfigProvider();
            if (configProvider3 != null && (videoCaptureReportInfo = configProvider3.I) != null) {
                num = java.lang.Integer.valueOf(videoCaptureReportInfo.f155693g);
            }
            intent3.putExtra("key_ref_comment_scene", num);
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((c61.w8) paVar).getClass();
            com.tencent.mm.plugin.finder.report.p2.N(com.tencent.mm.plugin.finder.report.p2.f125237a, context2, 67, null, 0L, 0, 28, null);
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider4 = getConfigProvider();
        if (configProvider4 == null || (bundle2 = configProvider4.M) == null || !bundle2.containsKey("SOUND_TRACK_TYPE")) {
            return;
        }
        ut3.f.f431176c.e(bundle2.getInt("SOUND_TRACK_TYPE"));
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout, com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        android.os.Bundle bundle3;
        android.os.Bundle bundle4;
        android.os.Bundle bundle5;
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "statusChange " + status + " param:" + bundle);
        if (status == ju3.c0.A1) {
            ut3.f fVar = ut3.f.f431176c;
            int i17 = fVar.f431178b.getInt("SOUND_TRACK_TYPE", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "statusChange: EDIT_FINISH currentSoundTrackType=" + i17);
            if (i17 <= 0) {
                fVar.e(0);
            }
            yo4.p musicPlugin = getMusicPlugin();
            android.os.Bundle bundle6 = fVar.f431178b;
            java.lang.String str = null;
            if (musicPlugin != null && (audioCacheInfo = musicPlugin.f464287r) != null) {
                int i18 = audioCacheInfo.f155719p;
                if (audioCacheInfo.f155722s) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "statusChange: EDIT_FINISH, audio  local, soundTrackType=" + i18);
                    ct0.b captureInfo = getCaptureInfo();
                    bundle6.putString("ORIGIN_MUSIC_ID", (captureInfo == null || (bundle5 = captureInfo.f222217n) == null) ? null : bundle5.getString("KEY_ORIGIN_MUSIC_ID"));
                    ct0.b captureInfo2 = getCaptureInfo();
                    bundle6.putString("ORIGIN_MUSIC_PATH", (captureInfo2 == null || (bundle4 = captureInfo2.f222217n) == null) ? null : bundle4.getString("KEY_ORIGIN_MUSIC_PATH"));
                    ct0.b captureInfo3 = getCaptureInfo();
                    bundle6.putByteArray("ORIGIN_MUSIC_INFO", (captureInfo3 == null || (bundle3 = captureInfo3.f222217n) == null) ? null : bundle3.getByteArray("KEY_ORIGIN_MUSIC_INFO"));
                } else if (audioCacheInfo.f155728y == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "statusChange: EDIT_FINISH, audio finderObject null, soundTrackType=" + i18);
                    bundle6.putByteArray("MEDIA_EXTRA_MUSIC", audioCacheInfo.f155710d.toByteArray());
                }
                fVar.e(i18);
            }
            ct0.b captureInfo4 = getCaptureInfo();
            if (captureInfo4 != null && (bundle2 = captureInfo4.f222217n) != null) {
                str = bundle2.getString("KEY_ORIGIN_BGM_URL");
            }
            bundle6.putString("ORIGIN_BGM_URL", str);
            yo4.p musicPlugin2 = getMusicPlugin();
            bundle6.putBoolean("MEDIA_IS_MUTE", (musicPlugin2 != null ? musicPlugin2.B() : false) || this.isMediaMute);
            bundle6.putBoolean("MUSIC_IS_MUTE", getMusicPlugin() != null ? !r0.A().getWithMusic() : false);
        }
        super.w(status, bundle);
    }
}
