package r35;

/* loaded from: classes8.dex */
public class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f369082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j f369083e;

    public e1(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.j jVar) {
        this.f369082d = j0Var;
        this.f369083e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f369082d.dismiss();
        com.tencent.mm.ui.widget.dialog.j jVar = this.f369083e;
        if (jVar != null) {
            jVar.a(false, null, 0);
        }
    }
}
