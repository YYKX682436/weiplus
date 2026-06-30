package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class g2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f158412d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f158413e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f158414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158413e = true;
        this.f158414f = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.f2(this));
    }

    public final rx3.z O6() {
        return (rx3.z) ((jz5.n) this.f158414f).getValue();
    }

    public final void P6(boolean z17, vx3.i iVar, boolean z18) {
        kotlinx.coroutines.r2 r2Var;
        if (!z17 && !O6().f401086g) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class)).O6();
            return;
        }
        if (z18 && (r2Var = this.f158412d) != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f158412d;
        if (r2Var2 != null && r2Var2.a()) {
            return;
        }
        this.f158412d = kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.e2(this, z17, iVar, null), 3, null);
    }

    public final java.lang.String Q6() {
        java.lang.String l17;
        rx3.s a17 = rx3.s.f401052b.a(1, null);
        rx3.z zVar = a17 instanceof rx3.z ? (rx3.z) a17 : null;
        return (zVar == null || (l17 = java.lang.Long.valueOf(zVar.f401085f).toString()) == null) ? "" : l17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSelectDataUIC", "onCreateAfter");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class)).getClass();
        rx3.z O6 = O6();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        O6.f401084e = ((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158373e;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSelectDataUIC", "onDestroy");
        rx3.z O6 = O6();
        O6.getClass();
        O6.d(1, this);
        kotlinx.coroutines.r2 r2Var = this.f158412d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSelectDataUIC", "onFinished");
        rx3.z O6 = O6();
        O6.getClass();
        O6.d(1, this);
        kotlinx.coroutines.r2 r2Var = this.f158412d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        super.onFinished();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        kotlinx.coroutines.r2 r2Var = this.f158412d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
