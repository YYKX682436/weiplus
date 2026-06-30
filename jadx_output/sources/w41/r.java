package w41;

/* loaded from: classes4.dex */
public final class r implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f442881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f442882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f442883c;

    public r(android.view.ViewGroup viewGroup, k41.g0 g0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f442881a = viewGroup;
        this.f442882b = g0Var;
        this.f442883c = y1Var;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        boolean z17 = iArr != null && iArr[0] == 0;
        l41.y1 y1Var = l41.y1.f315970a;
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = this.f442883c;
        k41.g0 contact = this.f442882b;
        android.view.ViewGroup viewGroup = this.f442881a;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.f490604zq), false, 3, null);
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            w41.p pVar = new w41.p(f17, y1Var2);
            kotlin.jvm.internal.o.g(contact, "contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuLocationReqController", "ACCESS_FINE_LOCATION onPermissionGranted");
            java.lang.String str = contact.field_username;
            y1Var.a(context, str != null ? str : "", true, new l41.m1(pVar, contact, context));
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 f18 = com.tencent.mm.ui.widget.dialog.u3.f(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.f490604zq), false, 3, null);
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        w41.q qVar = new w41.q(f18, y1Var2);
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuLocationReqController", "ACCESS_FINE_LOCATION onPermissionGranted");
        java.lang.String str2 = contact.field_username;
        y1Var.a(context2, str2 != null ? str2 : "", true, new l41.m1(qVar, contact, context2));
    }
}
