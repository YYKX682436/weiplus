package gx5;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        synchronized (gx5.f.class) {
            if (gx5.f.f277458a && gx5.f.f277460c != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WordDetectModHelper", "releaseWordDetect");
                ny4.g gVar = gx5.f.f277460c;
                gVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WeChatPicTranslateManager", "destroyOcrEnv");
                synchronized (gVar.f341466b) {
                    com.tencent.wevision2.modules.ocr.TextRecognizer textRecognizer = gVar.f341465a;
                    if (textRecognizer != null) {
                        textRecognizer.destroy();
                    }
                    gVar.f341465a = null;
                }
                gx5.f.f277460c = null;
                gx5.f.f277458a = false;
            }
        }
    }
}
