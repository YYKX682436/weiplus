package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes9.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x0 f118488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.live.widget.x0 x0Var) {
        super(0);
        this.f118488d = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.x0 x0Var = this.f118488d;
        zl2.u4 uiMode = x0Var.f120256g;
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(x0Var.f120254e).inflate(android.R.layout.simple_list_item_1, (android.view.ViewGroup) null, false);
    }
}
