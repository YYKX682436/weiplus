package ir1;

/* loaded from: classes5.dex */
public final class a1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f293932d;

    public a1(ir1.i1 i1Var) {
        this.f293932d = i1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            jr1.i iVar = jr1.i.f301360a;
            ir1.i1 i1Var = this.f293932d;
            int i18 = i1Var.f293986f;
            java.lang.String str = i1Var.f293985e;
            hr1.a aVar = i1Var.P;
            kotlin.jvm.internal.o.d(aVar);
            java.lang.String field_identityName = aVar.field_identityName;
            kotlin.jvm.internal.o.f(field_identityName, "field_identityName");
            hr1.a aVar2 = i1Var.P;
            kotlin.jvm.internal.o.d(aVar2);
            iVar.d(i18, str, field_identityName, aVar2.field_identityType, false, new ir1.z0(i1Var));
        }
    }
}
