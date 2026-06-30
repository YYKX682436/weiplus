package vf2;

/* loaded from: classes3.dex */
public final class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf2.q f436323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f436324e;

    public a(vf2.q qVar, r45.z53 z53Var) {
        this.f436323d = qVar;
        this.f436324e = z53Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
        android.content.Context O6 = this.f436323d.O6();
        java.lang.String string = this.f436324e.getString(3);
        if (string == null) {
            string = "";
        }
        b3Var.c(O6, string);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(10);
    }
}
