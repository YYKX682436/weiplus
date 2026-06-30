package l41;

/* loaded from: classes15.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315796d;

    public d1(l41.j1 j1Var) {
        this.f315796d = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l41.j1 j1Var = this.f315796d;
        boolean z17 = ((java.lang.String) ((jz5.n) j1Var.f315858q).getValue()).length() > 0;
        android.app.Activity activity = j1Var.f315842a;
        if (z17) {
            dp.a.makeText(activity, (java.lang.String) ((jz5.n) j1Var.f315858q).getValue(), 0).show();
        } else {
            dp.a.makeText(activity, activity.getString(com.tencent.mm.R.string.hew), 0).show();
        }
    }
}
