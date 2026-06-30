package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class v0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f158512d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f158513e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f158514f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f158515g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f158516h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f158517i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f158518m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158512d = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.f0(this));
        this.f158514f = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.e0(this));
        this.f158515g = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.i0(this));
        this.f158516h = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.g0(this));
        this.f158517i = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.h0(this));
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView O6() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f158512d).getValue();
    }

    public final void P6(java.util.ArrayList arrayList) {
        this.f158518m = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$reInitAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "getItemConvert, type:" + type);
                ox3.e eVar = new ox3.e();
                eVar.f349738e = new com.tencent.mm.plugin.ringtone.uic.o0(com.tencent.mm.plugin.ringtone.uic.v0.this);
                return eVar;
            }
        }, arrayList, true);
        O6().i(new com.tencent.mm.plugin.ringtone.uic.p0(this));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158518m;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.ringtone.uic.r0(this);
        }
        O6().setAdapter(this.f158518m);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 8 && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.w(pf5.o.TAG, "empty or null contact: " + stringExtra);
            } else {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                mx3.s.a(mx3.u.f332620f, getContext(), 2, stringExtra, ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class)).f158499e, false, null, 48, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
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
    public void onResume() {
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.l0(this, null), 3, null);
        this.f158513e = new androidx.recyclerview.widget.LinearLayoutManager(getActivity());
        O6().setLayoutManager(this.f158513e);
        com.tencent.mm.view.recyclerview.WxRecyclerView O6 = O6();
        com.tencent.mm.plugin.ringtone.uic.m0 m0Var = new com.tencent.mm.plugin.ringtone.uic.m0();
        m0Var.e(2, 10);
        O6.setRecycledViewPool(m0Var);
        O6().setNestedScrollingEnabled(false);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.ringtone.uic.d0(this, null), 3, null);
        P6(new java.util.ArrayList());
    }
}
