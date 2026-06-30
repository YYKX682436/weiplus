package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class gz extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f134561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(com.tencent.mm.plugin.finder.viewmodel.component.iz izVar) {
        super(1);
        this.f134561d = izVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.viewmodel.component.iz izVar = this.f134561d;
            izVar.f134774g.clear();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = izVar.f134775h;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("continueWatchAdapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
            izVar.O6();
        }
        return jz5.f0.f302826a;
    }
}
