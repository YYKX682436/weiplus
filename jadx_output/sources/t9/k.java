package t9;

/* loaded from: classes15.dex */
public abstract class k {
    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            return "video/avc";
        }
        if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (trim.startsWith("vp9") || trim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (trim.startsWith("vp8") || trim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (trim.startsWith("mp4a")) {
            return "audio/mp4a-latm";
        }
        if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3;
        }
        if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3;
        }
        if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_DTS;
        }
        if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_DTS_HD;
        }
        if (trim.startsWith("opus")) {
            return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_OPUS;
        }
        if (trim.startsWith("vorbis")) {
            return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_VORBIS;
        }
        return null;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new java.lang.IllegalArgumentException("Invalid mime type: ".concat(str));
    }

    public static int c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        if (d(str)) {
            return 1;
        }
        if (e(str)) {
            return 2;
        }
        if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT.equals(b(str)) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA608.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA708.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_MP4CEA608.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_SUBRIP.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_TTML.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_TX3G.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_MP4VTT.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_RAWCC.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_VOBSUB.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_PGS.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        return (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_ID3.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_EMSG.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_SCTE35.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) ? 4 : -1;
    }

    public static boolean d(java.lang.String str) {
        return "audio".equals(b(str));
    }

    public static boolean e(java.lang.String str) {
        return "video".equals(b(str));
    }
}
