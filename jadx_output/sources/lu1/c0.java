package lu1;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f321322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu1.d0 f321323e;

    public c0(lu1.d0 d0Var, android.graphics.Bitmap bitmap) {
        this.f321323e = d0Var;
        this.f321322d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        lu1.d0 d0Var = this.f321323e;
        d0Var.f321324a.setImageBitmap(this.f321322d);
        d0Var.f321324a.setColorFilter(d0Var.f321325b, android.graphics.PorterDuff.Mode.SRC_IN);
    }
}
