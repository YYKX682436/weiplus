package db5;

/* loaded from: classes11.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f228526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.x6 f228527e;

    public u6(db5.x6 x6Var, java.lang.StringBuilder sb6) {
        this.f228527e = x6Var;
        this.f228526d = sb6;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228527e.f228573f.C.d(this.f228526d.toString());
    }
}
