package r02;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r02.r0 f368315d;

    public n0(r02.r0 r0Var) {
        this.f368315d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f368315d.notifyDataSetChanged();
    }
}
