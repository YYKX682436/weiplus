package gj;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i17;
        long j17;
        while (true) {
            try {
                z17 = com.tencent.matrix.trace.core.AppMethodBeat.isPauseUpdateTime;
                if (!z17) {
                    i17 = com.tencent.matrix.trace.core.AppMethodBeat.status;
                    if (i17 > -1) {
                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                        j17 = com.tencent.matrix.trace.core.AppMethodBeat.sDiffTime;
                        long unused = com.tencent.matrix.trace.core.AppMethodBeat.sCurrentDiffTime = uptimeMillis - j17;
                        android.os.SystemClock.sleep(5L);
                    }
                }
                obj = com.tencent.matrix.trace.core.AppMethodBeat.updateTimeLock;
                synchronized (obj) {
                    obj2 = com.tencent.matrix.trace.core.AppMethodBeat.updateTimeLock;
                    obj2.wait();
                }
            } catch (java.lang.Exception e17) {
                oj.j.b("Matrix.AppMethodBeat", "" + e17.toString(), new java.lang.Object[0]);
                return;
            }
        }
    }
}
