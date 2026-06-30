package r35;

/* loaded from: classes11.dex */
public class c4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f369066d;

    public c4(r35.e4 e4Var) {
        this.f369066d = e4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r35.e4 e4Var = this.f369066d;
        e4Var.f369100w = false;
        e4Var.f369101x = false;
        e4Var.d();
        e4Var.f369102y = new com.tencent.mm.pluginsdk.model.m3(1, e4Var.f369090m, e4Var.f369092o, e4Var.f369093p, e4Var.f369094q, "", e4Var.f369095r, e4Var.f369098u, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e4Var.f369096s)) {
            e4Var.f369102y.U(e4Var.f369096s, e4Var.f369097t);
        }
        e4Var.f369102y.T("");
        e4Var.f369102y.V(0);
        e4Var.f369102y.S(e4Var.f369100w);
        gm0.j1.n().f273288b.g(e4Var.f369102y);
    }
}
