package dh4;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f232507e;

    public c0(dh4.f0 f0Var, int i17) {
        this.f232507e = f0Var;
        this.f232506d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f232507e.f(this.f232506d - 1);
    }
}
