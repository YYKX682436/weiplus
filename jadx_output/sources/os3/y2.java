package os3;

/* loaded from: classes8.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.z2 f348256e;

    public y2(os3.z2 z2Var, java.lang.String str) {
        this.f348256e = z2Var;
        this.f348255d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(this.f348256e.f348263a, this.f348255d, 0).show();
    }
}
