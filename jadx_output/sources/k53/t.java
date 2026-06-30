package k53;

/* loaded from: classes8.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k53.c0 f304387d;

    public t(k53.c0 c0Var) {
        this.f304387d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f304387d.notifyDataSetChanged();
    }
}
