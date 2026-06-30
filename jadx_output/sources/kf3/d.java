package kf3;

/* loaded from: classes5.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f307330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f307331e;

    public d(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f307330d = u3Var;
        this.f307331e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f307330d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f307331e.sendEmptyMessage(0);
        }
    }
}
