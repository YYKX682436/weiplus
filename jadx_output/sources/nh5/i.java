package nh5;

/* loaded from: classes10.dex */
public final class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI f337152d;

    public i(com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI) {
        this.f337152d = matrixBaseLeakResultUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixBaseLeakResultUI", "confirmed ");
        com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI = this.f337152d;
        if (matrixBaseLeakResultUI.d > 0) {
            return false;
        }
        int i17 = matrixBaseLeakResultUI.e - 1;
        matrixBaseLeakResultUI.e = i17;
        if (i17 <= 0) {
            matrixBaseLeakResultUI.finish();
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).A("Click-Count-Down");
        dp.a.makeText(this.f337152d.getApplicationContext(), "再点 " + this.f337152d.e + " 次", 1).show();
        ((ku5.t0) ku5.t0.f312615d).l(new nh5.h(this.f337152d), 5000L, "Click-Count-Down");
        return false;
    }
}
