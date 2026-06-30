package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class m8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5 f129510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
        super(0);
        this.f129510d = finderLiveNormalOccupyUI5;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5 = this.f129510d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) finderLiveNormalOccupyUI5.findViewById(com.tencent.mm.R.id.f487267o30);
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(finderLiveNormalOccupyUI5, 1, false));
        return wxRecyclerView;
    }
}
