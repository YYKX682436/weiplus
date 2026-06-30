package qd2;

/* loaded from: classes10.dex */
public final class c1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361710e;

    public c1(qd2.g1 g1Var, java.lang.String str) {
        this.f361709d = g1Var;
        this.f361710e = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        qd2.g1 g1Var = this.f361709d;
        g1Var.getClass();
        g1Var.f361756j = null;
        if (g1Var.f361766t) {
            xm5.d.b(new qd2.b1(this.f361710e, g1Var));
        }
        g1Var.f361766t = false;
    }
}
