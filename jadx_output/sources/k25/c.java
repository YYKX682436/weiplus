package k25;

/* loaded from: classes13.dex */
public class c implements k25.a {
    @Override // k25.a
    public boolean d() {
        if (!com.tencent.xweb.XWebCoreContentProvider.f220203e.get()) {
            by5.c4.f("XWebCoreContentProvider", "isBusy = true, xweb not init yet");
            return true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.xweb.XWebCoreContentProvider.f220204f.get();
        if (currentTimeMillis < 0 || currentTimeMillis > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            by5.c4.f("XWebCoreContentProvider", "isBusy = false");
            return false;
        }
        by5.c4.f("XWebCoreContentProvider", "isBusy = true, is operating now");
        return true;
    }
}
