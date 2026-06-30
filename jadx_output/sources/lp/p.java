package lp;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f320237d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f320238e;

    public p(lp.q qVar, int i17) {
        this.f320238e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f320237d;
        this.f320237d = i17 + 1;
        if (i17 >= this.f320238e) {
            throw new java.lang.StackOverflowError("Just for test !!");
        }
        run();
    }
}
