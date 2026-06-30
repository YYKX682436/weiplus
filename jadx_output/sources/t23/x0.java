package t23;

/* loaded from: classes10.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t23.h f415290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t23.y0 f415291e;

    public x0(t23.y0 y0Var, t23.h hVar) {
        this.f415291e = y0Var;
        this.f415290d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f415291e.a().post(new t23.w0(this, this.f415290d.a()));
    }
}
