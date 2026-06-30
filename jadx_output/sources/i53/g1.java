package i53;

/* loaded from: classes8.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.i1 f288579d;

    public g1(i53.i1 i1Var) {
        this.f288579d = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f288579d.notifyDataSetChanged();
    }
}
