package cx2;

/* loaded from: classes9.dex */
public class d implements com.tencent.mm.ui.widget.dialog.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.i0 f224531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224533c;

    public d(com.tencent.mm.ui.widget.dialog.i0 i0Var, android.content.Context context, java.lang.String str) {
        this.f224531a = i0Var;
        this.f224532b = context;
        this.f224533c = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d0
    public void a(android.widget.EditText editText) {
        com.tencent.mm.ui.widget.dialog.i0 i0Var;
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        if (editText == null || (j0Var = (i0Var = this.f224531a).f211822c) == null) {
            return;
        }
        if (j0Var.getWindow() != null) {
            i0Var.f211822c.getWindow().setSoftInputMode(5);
        }
        ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
        com.tencent.mm.ui.i1.c(editText, this.f224532b, this.f224533c);
        i0Var.f211822c.M = new cx2.c(this);
    }
}
