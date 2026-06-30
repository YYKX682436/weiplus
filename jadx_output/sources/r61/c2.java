package r61;

/* loaded from: classes9.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.d2 f392832d;

    public c2(r61.d2 d2Var) {
        this.f392832d = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r61.d2 d2Var = this.f392832d;
        d2Var.f392840f.d();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = d2Var.f392840f.f73109f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
