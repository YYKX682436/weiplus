package gk4;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f272549e;

    public e0(gk4.h0 h0Var, android.graphics.Bitmap bitmap) {
        this.f272548d = h0Var;
        this.f272549e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f272548d.G;
        if (lVar != null) {
            lVar.invoke(this.f272549e);
        }
    }
}
