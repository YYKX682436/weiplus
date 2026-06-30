package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class st extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ut f135918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st(com.tencent.mm.plugin.finder.viewmodel.component.ut utVar) {
        super(0);
        this.f135918d = utVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f135918d.getActivity().getIntent().getStringExtra("finder_username");
        return stringExtra == null ? "" : stringExtra;
    }
}
