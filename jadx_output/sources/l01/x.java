package l01;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.c0 f314793e;

    public x(l01.c0 c0Var, android.graphics.Bitmap bitmap) {
        this.f314793e = c0Var;
        this.f314792d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f314793e.g(this.f314792d);
    }
}
