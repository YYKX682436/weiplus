package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class vb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.yb f124295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(com.tencent.mm.plugin.finder.profile.uic.yb ybVar) {
        super(0);
        this.f124295d = ybVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f124295d.getRlLayout().getRecyclerView();
        kotlin.jvm.internal.o.d(recyclerView);
        return recyclerView;
    }
}
