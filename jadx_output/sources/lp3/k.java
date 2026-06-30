package lp3;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.k55 f320290d;

    public k(lp3.l lVar, r45.k55 k55Var) {
        this.f320290d = k55Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i2f));
        f9Var.setType(10000);
        f9Var.j1(0);
        f9Var.u1(this.f320290d.f378385d);
        f9Var.e1(java.lang.System.currentTimeMillis());
        c01.w9.x(f9Var);
    }
}
