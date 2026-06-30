package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class sb0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.multitask.n f135886d;

    /* renamed from: e, reason: collision with root package name */
    public final bw5.up f135887e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f135888f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135887e = new bw5.up();
        jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.ob0.f135462d);
        jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.pb0.f135545d);
        new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (this.f135888f) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (!((w03.u) pf5.z.f353948a.a(activity).a(w03.u.class)).f441907h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoAddHistoryUIC", "onBackPressed: update ret=false");
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.multitask.l0.Bd((com.tencent.mm.plugin.multitask.l0) c17, 2, null, 0, null, 14, null);
            }
        }
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_FLOAT_BALL_INFO");
        java.lang.String nk6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk();
        if (byteArrayExtra != null) {
            this.f135888f = true;
            try {
                this.f135887e.parseFrom(byteArrayExtra);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MegaVideoAddHistoryUIC", "onCreateAfter", th6);
            }
        }
        android.app.Activity context = getContext();
        android.app.Activity context2 = getContext();
        android.view.View decorView = getContext().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        com.tencent.mm.plugin.finder.megavideo.multitask.n nVar = new com.tencent.mm.plugin.finder.megavideo.multitask.n(context, new com.tencent.mm.plugin.finder.megavideo.multitask.o(context2, null, decorView));
        this.f135886d = nVar;
        nVar.y(25, nk6);
        com.tencent.mm.plugin.finder.megavideo.multitask.n nVar2 = this.f135886d;
        if (nVar2 == null) {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
        nVar2.f300126s = false;
        if (this.f135888f) {
            if (nVar2 != null) {
                nVar2.f120874x = new com.tencent.mm.plugin.finder.viewmodel.component.qb0(this);
                return;
            } else {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
        }
        if (nVar2 != null) {
            nVar2.f120875y = new com.tencent.mm.plugin.finder.viewmodel.component.rb0(this);
        } else {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.finder.megavideo.multitask.n nVar = this.f135886d;
        if (nVar != null) {
            nVar.A();
        } else {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.megavideo.multitask.n nVar = this.f135886d;
        if (nVar != null) {
            nVar.z();
        } else {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
    }
}
