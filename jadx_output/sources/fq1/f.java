package fq1;

/* loaded from: classes8.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f265509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j f265510e;

    public f(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.j jVar) {
        this.f265509d = j0Var;
        this.f265510e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f265509d;
        j0Var.dismiss();
        com.tencent.mm.ui.widget.dialog.j jVar = this.f265510e;
        if (jVar != null) {
            java.lang.String h17 = j0Var.h();
            android.widget.EditText editText = j0Var.f211837r;
            jVar.a(true, h17, editText instanceof com.tencent.mm.ui.widget.edittext.PasterEditText ? ((com.tencent.mm.ui.widget.edittext.PasterEditText) editText).getPasterLen() : 0);
        }
    }
}
