package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e0 f118609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.live.widget.e0 e0Var) {
        super(0);
        this.f118609d = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.e0 e0Var = this.f118609d;
        android.view.View E = e0Var.E(e0Var.f118185g);
        return E == null ? android.view.LayoutInflater.from(e0Var.f118183e).inflate(e0Var.A(), (android.view.ViewGroup) null, false) : E;
    }
}
