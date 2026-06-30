package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class nm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm f129562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(com.tencent.mm.plugin.finder.ui.qm qmVar) {
        super(0);
        this.f129562d = qmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f129562d.f106424g;
        if (i0Var != null && (o17 = i0Var.o()) != null) {
            o17.onChanged();
        }
        return jz5.f0.f302826a;
    }
}
