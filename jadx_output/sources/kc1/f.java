package kc1;

/* loaded from: classes14.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    public static kc1.f f306292d;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.xeffect.FaceTracker f306293a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f306294b = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f306295c = new java.util.ArrayList();

    public static synchronized kc1.f b() {
        kc1.f fVar;
        synchronized (kc1.f.class) {
            if (f306292d == null) {
                f306292d = new kc1.f();
            }
            fVar = f306292d;
        }
        return fVar;
    }

    public int a(kc1.c cVar) {
        switch (cVar.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return -1;
        }
    }
}
