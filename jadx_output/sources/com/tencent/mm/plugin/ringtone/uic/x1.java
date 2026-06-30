package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class x1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public cy3.d f158541d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f158542e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f158543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158543f = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.w1(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.c8m);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        cy3.d dVar = new cy3.d(findViewById);
        this.f158541d = dVar;
        androidx.lifecycle.j0 j0Var = dVar.f224767i;
        if (j0Var != null) {
            j0Var.observe(getActivity(), new com.tencent.mm.plugin.ringtone.uic.o1(this));
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.k1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.k1.class)).f158440d.observe(getActivity(), new com.tencent.mm.plugin.ringtone.uic.p1(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.q1(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        rx3.z zVar = (rx3.z) ((jz5.n) this.f158543f).getValue();
        zVar.getClass();
        zVar.d(1, this);
        if (by3.a.f36370b) {
            b21.m.g();
            ((ll3.j1) ((c21.i) i95.n0.c(c21.i.class))).getClass();
            b21.r b17 = b21.m.b();
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicFloatBallService", "resumeMusicFloatBall %s", b17);
            if ((b17 == null || b17.N) ? false : true) {
                b17.N = true;
                b21.m.k(b17);
            }
            ll3.q0.d(b17);
        }
        by3.a.f36370b = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.v1(this, null), 3, null);
        cy3.d dVar = this.f158541d;
        if (dVar != null) {
            dVar.b(false);
        }
    }
}
