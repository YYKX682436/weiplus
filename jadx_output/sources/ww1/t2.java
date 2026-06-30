package ww1;

/* loaded from: classes15.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f450301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f450302e;

    public t2(ww1.b3 b3Var, ww1.a3 a3Var) {
        this.f450301d = b3Var;
        this.f450302e = a3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.b3 b3Var = this.f450301d;
        android.view.ViewGroup.LayoutParams layoutParams = b3Var.V.getLayoutParams();
        if (b3Var.f450139k.getHeight() != 0) {
            layoutParams.height = b3Var.f450139k.getHeight();
        } else {
            layoutParams.height = (int) this.f450302e.f450115y;
        }
        b3Var.V.setLayoutParams(layoutParams);
    }
}
