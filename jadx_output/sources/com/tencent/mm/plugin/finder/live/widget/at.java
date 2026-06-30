package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class at extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f117795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        super(1);
        this.f117795d = etVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.qp1 it = (r45.qp1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f117795d.f211798d;
        android.view.View findViewById = (y1Var != null ? y1Var.C : null).findViewById(com.tencent.mm.R.id.exd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        new com.tencent.mm.plugin.finder.live.widget.se(findViewById, null, null, null, 14, null).c(7, it, 0, com.tencent.mm.plugin.finder.live.widget.zs.f120608d);
        return jz5.f0.f302826a;
    }
}
