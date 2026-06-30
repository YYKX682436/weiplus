package hr3;

/* loaded from: classes9.dex */
public class x6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.a7 f284172d;

    public x6(hr3.a7 a7Var) {
        this.f284172d = a7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.a7 a7Var = this.f284172d;
        a7Var.f283385n = false;
        android.content.Context context = a7Var.f283378d;
        a7Var.f283384m = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, true, new hr3.y6(a7Var));
        c01.w9.h("fmessage", new hr3.z6(a7Var));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I("fmessage", 15);
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("fmessage");
    }
}
