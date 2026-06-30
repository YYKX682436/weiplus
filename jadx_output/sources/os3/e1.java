package os3;

/* loaded from: classes11.dex */
public class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.j1 f348063d;

    public e1(os3.j1 j1Var) {
        this.f348063d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os3.j1 j1Var = this.f348063d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(j1Var.d())) {
            j1Var.e(false, null);
            j1Var.f();
        } else {
            android.content.Context context = j1Var.f348112d;
            j1Var.f348118m = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490604zq), false, false, null);
            gm0.j1.d().g(new ks3.g0());
        }
    }
}
