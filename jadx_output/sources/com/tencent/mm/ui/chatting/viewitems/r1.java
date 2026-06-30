package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class r1 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f205398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205400c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f205401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205402e;

    public r1(ot0.q qVar, android.view.View view, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, com.tencent.mm.storage.f9 f9Var) {
        this.f205398a = qVar;
        this.f205399b = view;
        this.f205400c = dVar;
        this.f205401d = a0Var;
        this.f205402e = f9Var;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(c01.z1.j() & (-8388609)));
        com.tencent.mm.ui.chatting.viewitems.j1.f(this.f205398a, this.f205399b, this.f205400c, this.f205401d, this.f205402e);
    }
}
