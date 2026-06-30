package m11;

/* loaded from: classes12.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m11.l1 f322699d;

    public g1(m11.l1 l1Var) {
        this.f322699d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        m11.l1 l1Var = this.f322699d;
        ((java.util.LinkedList) l1Var.f322749a).clear();
        l1Var.f322751c = true;
    }
}
