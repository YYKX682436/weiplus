package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j2 f123726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.finder.profile.uic.j2 j2Var) {
        super(0);
        this.f123726d = j2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f123726d.getRlLayout().getRecyclerView();
        kotlin.jvm.internal.o.d(recyclerView);
        return recyclerView;
    }
}
