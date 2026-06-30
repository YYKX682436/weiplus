package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f114087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ep0 f114088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ep0 f114089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114091h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var, com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var2, android.view.View view, android.view.View view2) {
        super(0);
        this.f114087d = r60Var;
        this.f114088e = ep0Var;
        this.f114089f = ep0Var2;
        this.f114090g = view;
        this.f114091h = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f114087d;
        r60Var.getClass();
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f114088e;
        if (ep0Var instanceof com.tencent.mm.plugin.finder.live.plugin.ea0) {
            r60Var.B1(this.f114089f, ep0Var);
        } else {
            r60Var.D1("addPromoteBubbleAnim", this.f114090g);
            android.view.ViewGroup viewGroup = r60Var.f114102w;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("promoteBubbleContainer");
                throw null;
            }
            viewGroup.addView(this.f114091h);
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("promoteBubbleContainer");
                throw null;
            }
            viewGroup.requestLayout();
            com.tencent.mm.plugin.finder.live.plugin.l.b1(r60Var, null, r60Var.f114098s, false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
