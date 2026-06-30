package k5;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final k5.l f304134d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f304135e;

    public k(k5.l lVar, java.lang.Runnable runnable) {
        this.f304134d = lVar;
        this.f304135e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        k5.l lVar = this.f304134d;
        try {
            this.f304135e.run();
        } finally {
            lVar.a();
        }
    }
}
