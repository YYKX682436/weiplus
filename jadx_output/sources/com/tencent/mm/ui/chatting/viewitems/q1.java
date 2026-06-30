package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class q1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f205305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f205306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot0.q f205307c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f205311g;

    public q1(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, ot0.q qVar, android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        this.f205305a = u3Var;
        this.f205306b = z17;
        this.f205307c = qVar;
        this.f205308d = view;
        this.f205309e = dVar;
        this.f205310f = f9Var;
        this.f205311g = a0Var;
    }

    @Override // q80.f0
    public void fail() {
        boolean z17 = this.f205306b;
        yb5.d dVar = this.f205309e;
        if (z17) {
            com.tencent.mm.ui.chatting.viewitems.c2.h0(this.f205307c, this.f205308d, dVar, this.f205310f, new com.tencent.mm.ui.chatting.viewitems.qq(this.f205311g));
        } else {
            db5.t7.makeText(dVar.g(), com.tencent.mm.R.string.ggb, 0).show();
        }
        this.f205305a.cancel();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 32L, 1L);
        this.f205305a.cancel();
    }
}
