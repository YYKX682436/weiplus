package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class fc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ic f123711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(com.tencent.mm.plugin.finder.profile.uic.ic icVar) {
        super(0);
        this.f123711d = icVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f123711d.getRlLayout().getRecyclerView();
        kotlin.jvm.internal.o.d(recyclerView);
        return recyclerView;
    }
}
