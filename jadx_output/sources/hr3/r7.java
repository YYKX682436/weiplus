package hr3;

/* loaded from: classes5.dex */
public class r7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f283941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f283942e;

    public r7(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f283941d = u3Var;
        this.f283942e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f283941d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f283942e.sendEmptyMessage(0);
        }
    }
}
