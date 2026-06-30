package xt0;

/* loaded from: classes5.dex */
public abstract class a {
    public final void a(bu0.c cVar) {
        if (cVar == null) {
            com.tencent.mars.xlog.Log.i("BaseComposingJumper", "fillMusicInfo: musicInfo null");
            return;
        }
        byte[] bArr = cVar.f24488b;
        byte[] bArr2 = cVar.f24490d;
        java.lang.Integer num = cVar.f24489c;
        if (num != null) {
            ut3.f.f431176c.e(num.intValue());
        }
        ut3.f fVar = ut3.f.f431176c;
        fVar.f431178b.putString("ORIGIN_MUSIC_ID", cVar.f24487a);
        fVar.f431178b.putByteArray("ORIGIN_MUSIC_INFO", bArr);
        fVar.f431178b.putByteArray("MEDIA_EXTRA_MUSIC", bArr2);
    }

    public final void b(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = configProvider.I;
        if (videoCaptureReportInfo != null) {
            ut3.f fVar = ut3.f.f431176c;
            fVar.f431178b.putLong("key_ref_feed_id", videoCaptureReportInfo.f155694h);
            fVar.f431178b.putString("key_ref_feed_dup_flag", videoCaptureReportInfo.f155695i);
        }
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo2 = configProvider.I;
        if (videoCaptureReportInfo2 != null) {
            ut3.f.f431176c.f431178b.putInt("key_ref_enter_scene", videoCaptureReportInfo2.f155693g);
        }
    }
}
