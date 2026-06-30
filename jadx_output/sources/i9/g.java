package i9;

/* loaded from: classes15.dex */
public final class g implements i9.h {
    public i9.e a(com.google.android.exoplayer2.Format format) {
        java.lang.String str = format.f44080i;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_DVBSUBS)) {
                    c17 = 0;
                    break;
                }
                break;
            case -1026075066:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_MP4VTT)) {
                    c17 = 1;
                    break;
                }
                break;
            case -1004728940:
                if (str.equals("text/vtt")) {
                    c17 = 2;
                    break;
                }
                break;
            case 691401887:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_TX3G)) {
                    c17 = 3;
                    break;
                }
                break;
            case 822864842:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.TEXT_SSA)) {
                    c17 = 4;
                    break;
                }
                break;
            case 930165504:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_MP4CEA608)) {
                    c17 = 5;
                    break;
                }
                break;
            case 1566015601:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA608)) {
                    c17 = 6;
                    break;
                }
                break;
            case 1566016562:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA708)) {
                    c17 = 7;
                    break;
                }
                break;
            case 1668750253:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_SUBRIP)) {
                    c17 = '\b';
                    break;
                }
                break;
            case 1693976202:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_TTML)) {
                    c17 = '\t';
                    break;
                }
                break;
        }
        int i17 = format.F;
        java.util.List list = format.f44082n;
        switch (c17) {
            case 0:
                return new k9.a(list);
            case 1:
                return new p9.b();
            case 2:
                return new p9.k();
            case 3:
                return new o9.a(list);
            case 4:
                return new l9.a(list);
            case 5:
            case 6:
                return new j9.c(format.f44080i, i17);
            case 7:
                return new j9.g(i17);
            case '\b':
                return new m9.a();
            case '\t':
                return new n9.b();
            default:
                throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported format");
        }
    }
}
