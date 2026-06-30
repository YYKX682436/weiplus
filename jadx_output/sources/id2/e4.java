package id2;

/* loaded from: classes3.dex */
public final class e4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f290552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.j4 f290553e;

    public e4(kotlin.jvm.internal.c0 c0Var, id2.j4 j4Var) {
        this.f290552d = c0Var;
        this.f290553e = j4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f290552d.f310112d = true;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        id2.v3 v3Var = this.f290553e.O6().f290904g;
        if (v3Var != null) {
            v3Var.a();
        }
    }
}
