package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class up extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.vp f119985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(com.tencent.mm.plugin.finder.live.widget.vp vpVar, android.content.Context context) {
        super(0);
        this.f119985d = vpVar;
        this.f119986e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.vp vpVar = this.f119985d;
        return new com.tencent.mm.plugin.finder.live.widget.sp(this.f119986e, vpVar, vpVar.Q, vpVar.N, vpVar.P, new com.tencent.mm.plugin.finder.live.widget.tp(vpVar));
    }
}
