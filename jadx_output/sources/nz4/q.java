package nz4;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f341633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341634e;

    public q(nz4.y yVar, boolean z17) {
        this.f341634e = yVar;
        this.f341633d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f341634e.C(this.f341633d);
    }
}
