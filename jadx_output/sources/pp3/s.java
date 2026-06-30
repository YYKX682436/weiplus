package pp3;

/* loaded from: classes5.dex */
public final class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.u f357496d;

    public s(pp3.u uVar) {
        this.f357496d = uVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        pp3.u.f357498s = null;
        pp3.u uVar = this.f357496d;
        uVar.f357508r.d();
        android.util.SparseArray sparseArray = ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).f246514d;
        if (sparseArray.indexOfKey(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT) >= 0) {
            ((java.util.LinkedList) sparseArray.get(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT)).remove(uVar);
        }
        r45.n55 n55Var = (r45.n55) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(uVar.f357499f, 4, r45.n55.class);
        if (n55Var == null) {
            return;
        }
        n55Var.f381091d = 0;
    }
}
