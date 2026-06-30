package fq1;

/* loaded from: classes8.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f265511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j f265512e;

    public g(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.j jVar) {
        this.f265511d = j0Var;
        this.f265512e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f265511d.dismiss();
        com.tencent.mm.ui.widget.dialog.j jVar = this.f265512e;
        if (jVar != null) {
            jVar.a(false, null, 0);
        }
    }
}
