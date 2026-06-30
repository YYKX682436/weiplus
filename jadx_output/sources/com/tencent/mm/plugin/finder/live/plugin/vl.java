package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f114793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(0);
        this.f114793d = recyclerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter = this.f114793d.getAdapter();
        bm2.a4 a4Var = adapter instanceof bm2.a4 ? (bm2.a4) adapter : null;
        if (a4Var != null) {
            a4Var.B(false);
        }
        return jz5.f0.f302826a;
    }
}
