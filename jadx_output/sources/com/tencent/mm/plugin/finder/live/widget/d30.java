package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f118048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f118049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, yz5.l lVar) {
        super(0);
        this.f118048d = e30Var;
        this.f118049e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f118048d;
        e30Var.f118217v.setImageDrawable(com.tencent.mm.ui.uk.e(e30Var.f365323d.getContext(), com.tencent.mm.R.raw.icons_filled_call_good, e30Var.G));
        yz5.l lVar = this.f118049e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
