package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class bo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.eo f133914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar) {
        super(0);
        this.f133914d = eoVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar = this.f133914d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = eoVar.f134283e;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        eoVar.f134287i = (r45.e8) eoVar.f134286h.getCustom(4);
        eoVar.U6();
        return jz5.f0.f302826a;
    }
}
