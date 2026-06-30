package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class d2 extends com.tencent.mm.ui.component.UIComponent implements ed0.y0 {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f158386d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f158387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158387e = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.c2(this));
    }

    public void O6() {
        kotlinx.coroutines.r2 r2Var = this.f158386d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        P6().e("");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ox3.l lVar = ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class)).f158407d;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
        ((kotlinx.coroutines.flow.q2) lVar.f349764d).e(new ed0.s0(null, 1));
    }

    public final rx3.u P6() {
        return (rx3.u) ((jz5.n) this.f158387e).getValue();
    }

    public void Q6(boolean z17) {
        if (!P6().f401064g) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class)).O6();
            return;
        }
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ox3.l lVar = ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.g.class)).f158407d;
            lVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataViewModel", "loading");
            ((kotlinx.coroutines.flow.q2) lVar.f349764d).e(new ed0.s0(null, 2));
        }
        kotlinx.coroutines.r2 r2Var = this.f158386d;
        boolean z18 = false;
        if (r2Var != null && r2Var.a()) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        this.f158386d = kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.b2(this, null), 3, null);
    }

    public final java.lang.String R6() {
        java.lang.String l17;
        rx3.s a17 = rx3.s.f401052b.a(2, null);
        rx3.u uVar = a17 instanceof rx3.u ? (rx3.u) a17 : null;
        return (uVar == null || (l17 = java.lang.Long.valueOf(uVar.f401063f).toString()) == null) ? "" : l17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSearchDataUIC", "onCreateAfter");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class)).getClass();
        rx3.u P6 = P6();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        P6.f401062e = ((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158373e;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSearchDataUIC", "onDestroy");
        rx3.u P6 = P6();
        P6.getClass();
        P6.d(2, this);
        kotlinx.coroutines.r2 r2Var = this.f158386d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSearchDataUIC", "onFinished");
        rx3.u P6 = P6();
        P6.getClass();
        P6.d(2, this);
        kotlinx.coroutines.r2 r2Var = this.f158386d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        super.onFinished();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        kotlinx.coroutines.r2 r2Var = this.f158386d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.ringtone.uic.g gVar = (com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class);
        java.util.List data = P6().f401055a;
        gVar.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        if (!((java.util.ArrayList) data).isEmpty()) {
            gVar.P6(data);
        }
    }
}
