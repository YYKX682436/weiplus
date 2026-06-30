package x36;

/* loaded from: classes16.dex */
public final class d extends java.lang.Thread {
    public d() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        x36.g a17;
        while (true) {
            try {
                synchronized (x36.g.class) {
                    try {
                        a17 = x36.g.f451676k.a();
                        if (a17 == x36.g.f451675j) {
                            x36.g.f451675j = null;
                            return;
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                if (a17 != null) {
                    a17.l();
                }
            } catch (java.lang.InterruptedException unused) {
                continue;
            }
        }
    }
}
