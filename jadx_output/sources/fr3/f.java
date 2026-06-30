package fr3;

/* loaded from: classes10.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f265792d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f265793e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f265794f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f265795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(fr3.l.f265800a);
        this.f265792d = a17;
        this.f265793e = kotlinx.coroutines.flow.l.b(a17);
    }

    public final void O6(fr3.i intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("MVI_Model", "dispatchIntent() called with: intent = " + intent);
        if (intent instanceof fr3.h) {
            if (this.f265795g != null) {
                r45.gh3 gh3Var = new r45.gh3();
                gh3Var.f375245d = this.f265794f;
                gh3Var.b().l().I(getActivity()).K(new fr3.e(this));
                return;
            }
            return;
        }
        if (intent instanceof fr3.g) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            hr3.z8 z8Var = (hr3.z8) pf5.z.f353948a.a(activity).a(hr3.z8.class);
            fr3.c cVar = new fr3.c(this);
            z8Var.getClass();
            java.util.List list = ((fr3.g) intent).f265796a;
            if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                return;
            }
            z8Var.f284237f = cVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.DeleteContactUIC", "deleteContact() called with: userNameList = " + list);
            androidx.appcompat.app.AppCompatActivity activity2 = z8Var.getActivity();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity2);
            e4Var.f211776c = z8Var.getString(com.tencent.mm.R.string.omp);
            e4Var.f211780g = 2;
            e4Var.f211778e = true;
            z8Var.f284235d = e4Var.c();
            gm0.j1.n().f273288b.g(new w11.h0(list, 1, 2, z8Var.f284236e));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("INTENT_KEY_LAST_CGI_CONTEXT");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f265794f = stringExtra;
    }
}
