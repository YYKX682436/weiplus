package dw3;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.e0 f244202a = new dw3.e0();

    public final dw3.d0 a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(path, true);
        if (d17 == null) {
            return null;
        }
        if (d17.f162385d <= 0 || d17.f162384c <= 0) {
            try {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(path);
                d17.f162384c = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(18), 0);
                d17.f162385d = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(19), 0);
                d17.f162383b = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(20), 0);
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused) {
            }
        }
        int mp4RotateVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(path);
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
        boolean z17 = mp4RotateVFS == 270 || mp4RotateVFS == 90;
        return new dw3.d0(d17.f162384c, d17.f162385d, d17.f162382a, mp4RotateVFS, d17.f162383b, d17.f162386e, ((double) java.lang.Math.abs((((float) (z17 ? d17.f162385d : d17.f162384c)) / ((float) (z17 ? d17.f162384c : d17.f162385d))) - (((float) h17.x) / ((float) h17.y)))) <= 0.01d, d17.f162390i, d17.f162392k, d17.f162391j);
    }
}
