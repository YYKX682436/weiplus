package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class zt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.du f136718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(com.tencent.mm.plugin.finder.viewmodel.component.du duVar) {
        super(0);
        this.f136718d = duVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f136718d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI");
        return (com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI) context;
    }
}
