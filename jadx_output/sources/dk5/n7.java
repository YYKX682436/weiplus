package dk5;

/* loaded from: classes9.dex */
public class n7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.p7 f234768d;

    public n7(dk5.p7 p7Var) {
        this.f234768d = p7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dk5.p7 p7Var = this.f234768d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = p7Var.f234814b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        dk5.o7 o7Var = p7Var.f234822j;
        if (o7Var != null) {
            o7Var.a(p7Var.f234817e, p7Var.f234818f, p7Var.f234820h, p7Var.f234819g);
        }
    }
}
