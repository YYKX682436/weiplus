package ef0;

/* loaded from: classes2.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.aa f252200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(qk.aa aaVar) {
        super(0);
        this.f252200d = aaVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.aa aaVar = this.f252200d;
        android.app.Activity activity = aaVar.f364012a;
        java.lang.String string = activity.getResources().getString(com.tencent.mm.R.string.lpk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = activity.getResources().getString(com.tencent.mm.R.string.lpj);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        com.tencent.mm.ui.widget.snackbar.j.c(string, string2, activity, new ef0.d2(aaVar, activity), null);
        return jz5.f0.f302826a;
    }
}
