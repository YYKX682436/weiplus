package r02;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f368317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r02.r0 f368318e;

    public o0(r02.r0 r0Var, int i17) {
        this.f368318e = r0Var;
        this.f368317d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f368318e.notifyItemRemoved(this.f368317d);
    }
}
