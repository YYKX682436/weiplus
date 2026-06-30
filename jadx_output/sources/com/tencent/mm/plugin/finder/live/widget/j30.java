package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q30 f118722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(com.tencent.mm.plugin.finder.live.widget.q30 q30Var) {
        super(0);
        this.f118722d = q30Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.q30 q30Var = this.f118722d;
        android.content.Context context = q30Var.f119467d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.plugin.finder.live.widget.vp(context, q30Var.f119468e, q30Var.f119469f);
    }
}
