package lh1;

/* loaded from: classes15.dex */
public abstract class e {
    public static boolean a(com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam) {
        return !android.text.TextUtils.isEmpty(recordParam.f85839h) && recordParam.f85835d >= 0 && recordParam.f85838g > 0 && recordParam.f85836e > 0 && recordParam.f85837f > 0;
    }

    public static void b(com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.RecordParamCompatibility", "recordParam duration:%d, numberOfChannels:%d, sampleRate:%d, encodeBitRate:%d", java.lang.Integer.valueOf(recordParam.f85835d), java.lang.Integer.valueOf(recordParam.f85837f), java.lang.Integer.valueOf(recordParam.f85836e), java.lang.Integer.valueOf(recordParam.f85838g));
        int i17 = recordParam.f85835d;
        if (i17 <= 0) {
            recordParam.f85835d = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        } else if (i17 >= 600000) {
            recordParam.f85835d = 600000;
        }
        int i18 = recordParam.f85837f;
        if (i18 < 1 && i18 > 2) {
            recordParam.f85837f = 2;
        }
        int i19 = recordParam.f85836e;
        if (i19 > 48000) {
            recordParam.f85836e = 48000;
        } else if (i19 < 8000) {
            recordParam.f85836e = 8000;
        }
        int i27 = recordParam.f85838g;
        if (i27 > 320000) {
            recordParam.f85838g = 320000;
        } else if (i27 < 16000) {
            recordParam.f85838g = 16000;
        }
    }
}
