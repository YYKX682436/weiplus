package qn1;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f364934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn1.b0 f364935e;

    public a0(qn1.b0 b0Var, int i17) {
        this.f364935e = b0Var;
        this.f364934d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kn1.b bVar = this.f364935e.f364937a.f364950b;
        if (bVar != null) {
            ((un1.c) bVar).a(this.f364934d);
        }
    }
}
