package w03;

/* loaded from: classes8.dex */
public final class n extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f441889d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441890e;

    /* renamed from: f, reason: collision with root package name */
    public vn2.q f441891f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        kotlin.jvm.internal.o.d(b17);
        this.f441891f = new vn2.q(b17);
    }

    public final void O6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideo19943ReportUIC", "isCreate from " + this.f441890e + " to " + z17);
        this.f441890e = z17;
    }

    public final void P6(java.lang.String pageName, int i17) {
        kotlin.jvm.internal.o.g(pageName, "pageName");
        vn2.q qVar = this.f441891f;
        if (qVar != null) {
            qVar.f438361g = pageName;
        }
        vn2.q qVar2 = this.f441891f;
        if (qVar2 == null) {
            return;
        }
        qVar2.f438362h = i17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        O6(true);
        vn2.q qVar = this.f441891f;
        if (qVar != null) {
            qVar.e();
        }
        vn2.q qVar2 = this.f441891f;
        if (qVar2 != null) {
            qVar2.b();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f441891f = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        vn2.q qVar;
        super.onPause();
        vn2.q qVar2 = this.f441891f;
        if (qVar2 != null) {
            qVar2.c();
        }
        if (this.f441889d || (qVar = this.f441891f) == null) {
            return;
        }
        qVar.f();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        vn2.q qVar;
        if (!this.f441890e) {
            vn2.q qVar2 = this.f441891f;
            if (qVar2 != null) {
                qVar2.b();
            }
            if (!this.f441889d && (qVar = this.f441891f) != null) {
                qVar.e();
            }
        }
        O6(false);
        this.f441889d = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        vn2.q qVar = this.f441891f;
        if (qVar != null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            qVar.d("onStart ".concat(activity.getClass().getName()));
            qVar.f438357c = activity;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        vn2.q qVar = this.f441891f;
        if (qVar != null) {
            qVar.a(getActivity());
        }
    }
}
