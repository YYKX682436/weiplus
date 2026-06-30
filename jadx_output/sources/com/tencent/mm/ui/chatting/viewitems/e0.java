package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f203836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f203838g;

    public e0(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, ot0.q qVar, com.tencent.mm.storage.f9 f9Var) {
        this.f203838g = a0Var;
        this.f203835d = dVar;
        this.f203836e = qVar;
        this.f203837f = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f203838g.q(this.f203835d, this.f203836e, this.f203837f);
    }
}
