package i95;

/* loaded from: classes10.dex */
public enum k0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final byte[] f289806d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f289807e = new java.util.ArrayList(2);

    /* renamed from: f, reason: collision with root package name */
    public int f289808f = 0;

    k0() {
    }

    public android.os.Looper h() {
        android.os.Handler handler;
        synchronized (this.f289806d) {
            if (((java.util.ArrayList) this.f289807e).size() < 2) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("wc_lp_srvinit_" + ((java.util.ArrayList) this.f289807e).size(), -8);
                handlerThread.start();
                handler = new android.os.Handler(handlerThread.getLooper());
                ((java.util.ArrayList) this.f289807e).add(handler);
            } else {
                if (this.f289808f >= ((java.util.ArrayList) this.f289807e).size()) {
                    this.f289808f = 0;
                }
                java.util.List list = this.f289807e;
                int i17 = this.f289808f;
                this.f289808f = i17 + 1;
                handler = (android.os.Handler) ((java.util.ArrayList) list).get(i17);
            }
        }
        return handler.getLooper();
    }
}
