package np5;

/* loaded from: classes9.dex */
public class a0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ np5.b0 f338813d;

    public a0(np5.b0 b0Var) {
        this.f338813d = b0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        np5.b0 b0Var = this.f338813d;
        if (b0Var.f338823i == null || !b0Var.f338820f.isEmpty()) {
            return;
        }
        b0Var.f338823i.dismiss();
        java.util.Iterator it = b0Var.f338821g.iterator();
        while (it.hasNext()) {
            com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) it.next();
            gm0.j1.i();
            gm0.j1.n().f273288b.d(m1Var);
        }
        b0Var.f338821g.clear();
    }
}
