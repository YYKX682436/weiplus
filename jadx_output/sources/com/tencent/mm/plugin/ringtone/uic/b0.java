package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class b0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public long f158343d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f158344e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f158345f;

    /* renamed from: g, reason: collision with root package name */
    public px3.j f158346g;

    /* renamed from: h, reason: collision with root package name */
    public rx3.h f158347h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158343d = -1L;
        this.f158344e = true;
        this.f158345f = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        rx3.h hVar = new rx3.h();
        this.f158347h = hVar;
        this.f158346g = new px3.j(hVar);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        rx3.h hVar = this.f158347h;
        if (hVar != null) {
            kotlinx.coroutines.z0.e(hVar.f401032a, null, 1, null);
        }
        px3.j jVar = this.f158346g;
        if (jVar != null) {
            kotlinx.coroutines.r2 r2Var = jVar.f358954i;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.y0 y0Var = jVar.f358950e;
            kotlinx.coroutines.l.d(y0Var, null, null, new px3.e(jVar, null), 3, null);
            kotlinx.coroutines.z0.e(y0Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        px3.j jVar = this.f158346g;
        if (jVar != null) {
            jVar.f358954i = kotlinx.coroutines.l.d(jVar.f358950e, null, null, new px3.f(jVar, null), 3, null);
        }
        this.f158344e = true;
        this.f158343d = -1L;
        this.f158345f.clear();
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.a0(this, null), 3, null);
    }
}
