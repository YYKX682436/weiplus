package kh1;

/* loaded from: classes13.dex */
public abstract class b {
    public static kh1.e a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncodeFactory", "createEncodeByType:%s", str);
        if (!com.tencent.mm.plugin.appbrand.media.record.d0.a(str)) {
            return null;
        }
        if ("aac".equalsIgnoreCase(str)) {
            return new kh1.a();
        }
        if ("mp3".equalsIgnoreCase(str)) {
            return new kh1.f();
        }
        if ("wav".equalsIgnoreCase(str)) {
            return new kh1.i();
        }
        if ("pcm".equalsIgnoreCase(str)) {
            return new kh1.h();
        }
        if ("opus".equalsIgnoreCase(str)) {
            return new kh1.g();
        }
        return null;
    }
}
