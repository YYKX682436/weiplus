package r35;

/* loaded from: classes8.dex */
public class d1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f369070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j f369071e;

    public d1(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.j jVar) {
        this.f369070d = j0Var;
        this.f369071e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f369070d;
        j0Var.dismiss();
        com.tencent.mm.ui.widget.dialog.j jVar = this.f369071e;
        if (jVar != null) {
            java.lang.String h17 = j0Var.h();
            android.widget.EditText editText = j0Var.f211837r;
            jVar.a(true, h17, editText instanceof com.tencent.mm.ui.widget.edittext.PasterEditText ? ((com.tencent.mm.ui.widget.edittext.PasterEditText) editText).getPasterLen() : 0);
        }
    }
}
