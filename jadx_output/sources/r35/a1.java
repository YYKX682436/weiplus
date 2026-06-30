package r35;

/* loaded from: classes9.dex */
public class a1 implements com.tencent.mm.ui.widget.dialog.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.i0 f369036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f369037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369038c;

    public a1(com.tencent.mm.ui.widget.dialog.i0 i0Var, android.content.Context context, java.lang.String str) {
        this.f369036a = i0Var;
        this.f369037b = context;
        this.f369038c = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d0
    public void a(android.widget.EditText editText) {
        com.tencent.mm.ui.widget.dialog.i0 i0Var;
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        if (editText == null || (j0Var = (i0Var = this.f369036a).f211822c) == null) {
            return;
        }
        if (j0Var.getWindow() != null) {
            i0Var.f211822c.getWindow().setSoftInputMode(5);
        }
        com.tencent.mm.ui.i1.c(editText, this.f369037b, this.f369038c);
        i0Var.f211822c.M = new r35.z0(this);
    }
}
