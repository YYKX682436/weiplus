package sj3;

/* loaded from: classes14.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f408671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408672e;

    public o4(sj3.a5 a5Var, boolean z17) {
        this.f408672e = a5Var;
        this.f408671d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.a5 a5Var = this.f408672e;
        a5Var.A.setChecked(this.f408671d);
        a5Var.y();
    }
}
