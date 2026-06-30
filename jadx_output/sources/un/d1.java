package un;

/* loaded from: classes9.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f429246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429247e;

    public d1(un.g1 g1Var, java.lang.String str) {
        this.f429246d = g1Var;
        this.f429247e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        un.g1 g1Var = this.f429246d;
        androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
        java.lang.String str = this.f429247e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = g1Var.getString(com.tencent.mm.R.string.htw);
        }
        db5.e1.y(activity, str, "", g1Var.getString(com.tencent.mm.R.string.l_e), un.c1.f429243d);
    }
}
