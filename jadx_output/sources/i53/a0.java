package i53;

/* loaded from: classes8.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.d0 f288494e;

    public a0(i53.d0 d0Var, java.lang.String str) {
        this.f288494e = d0Var;
        this.f288493d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f288494e.Bi(this.f288493d, -2);
    }
}
