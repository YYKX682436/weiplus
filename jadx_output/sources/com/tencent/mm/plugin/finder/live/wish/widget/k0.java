package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f120724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, androidx.lifecycle.y yVar, com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        super(0);
        this.f120723d = context;
        this.f120724e = yVar;
        this.f120725f = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f120723d;
        androidx.lifecycle.y yVar = this.f120724e;
        gk2.e eVar = dk2.ef.I;
        boolean O7 = eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).O7() : false;
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120725f;
        return new com.tencent.mm.plugin.finder.live.wish.widget.e(context, yVar, O7, t0Var, t0Var.f120777n);
    }
}
