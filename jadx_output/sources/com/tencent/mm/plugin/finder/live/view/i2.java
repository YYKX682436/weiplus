package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.j2 f116367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f116368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zh2.c f116369f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.finder.live.view.j2 j2Var, gk2.e eVar, zh2.c cVar) {
        super(0);
        this.f116367d = j2Var;
        this.f116368e = eVar;
        this.f116369f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.j2 j2Var = this.f116367d;
        android.view.View view = j2Var.f116403n;
        if (view != null) {
            return new kj2.o(view, this.f116368e, new com.tencent.mm.plugin.finder.live.view.g2(this.f116369f), null, new com.tencent.mm.plugin.finder.live.view.h2(j2Var));
        }
        kotlin.jvm.internal.o.o("inviteListLayout");
        throw null;
    }
}
