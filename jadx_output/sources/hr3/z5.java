package hr3;

/* loaded from: classes9.dex */
public class z5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.a6 f284232d;

    public z5(hr3.a6 a6Var) {
        this.f284232d = a6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.t6 t6Var = this.f284232d.f283377d;
        java.lang.String d17 = t6Var.f284004f.d1();
        com.tencent.mm.storage.f9 r66 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).r6(d17);
        ((e21.z0) c01.d9.b().w()).c(new e21.m(d17, r66.I0()));
        t6Var.I = false;
        com.tencent.mm.ui.MMActivity mMActivity = t6Var.f284002d;
        t6Var.H = db5.e1.Q(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490604zq), true, true, new hr3.h6(t6Var));
        c01.w9.h(d17, new hr3.i6(t6Var));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(d17, 15);
    }
}
