package df2;

/* loaded from: classes3.dex */
public final class gi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f230220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f230221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f230222f;

    public gi(df2.wi wiVar, kotlin.jvm.internal.c0 c0Var, r45.z53 z53Var) {
        this.f230220d = wiVar;
        this.f230221e = c0Var;
        this.f230222f = z53Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        df2.wi wiVar = this.f230220d;
        com.tencent.mars.xlog.Log.i(wiVar.f231690m, "dialog ok isInstall:" + this.f230221e.f310112d);
        com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
        android.content.Context O6 = wiVar.O6();
        java.lang.String string = this.f230222f.getString(3);
        if (string == null) {
            string = "";
        }
        b3Var.c(O6, string);
        if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
            com.tencent.mm.plugin.finder.assist.x2.f102672a.b(8);
        }
    }
}
