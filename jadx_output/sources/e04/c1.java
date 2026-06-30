package e04;

/* loaded from: classes13.dex */
public class c1 implements java.lang.Runnable {
    public c1(e04.d1 d1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ScanDarkDetectEvent scanDarkDetectEvent = new com.tencent.mm.autogen.events.ScanDarkDetectEvent();
        scanDarkDetectEvent.f54729g.f7932a = false;
        scanDarkDetectEvent.e();
    }
}
