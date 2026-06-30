package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q30 f119032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(com.tencent.mm.plugin.finder.live.widget.q30 q30Var) {
        super(0);
        this.f119032d = q30Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.q30 q30Var = this.f119032d;
        android.content.Context context = q30Var.f119467d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new ni2.l1(context, q30Var.f119468e, q30Var.f119469f);
    }
}
