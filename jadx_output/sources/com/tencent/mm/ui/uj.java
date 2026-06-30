package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class uj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.TipUseDuplicateGroupUI f211094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f211096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f211097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(com.tencent.mm.ui.TipUseDuplicateGroupUI tipUseDuplicateGroupUI, java.lang.String str, java.util.List list, java.util.List list2) {
        super(1);
        this.f211094d = tipUseDuplicateGroupUI;
        this.f211095e = str;
        this.f211096f = list;
        this.f211097g = list2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.f stateCenter;
        com.tencent.mm.ui.hj itemData = (com.tencent.mm.ui.hj) obj;
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mars.xlog.Log.i("MicroMsg.TipUseDuplicateGroupUI", "select: " + itemData.f208886d);
        java.lang.String str = this.f211095e;
        java.util.List list = this.f211096f;
        java.util.List list2 = this.f211097g;
        pm0.v.K(null, new com.tencent.mm.ui.tj(str, list, list2, itemData));
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(this.f211094d);
        if (a17 != null && (stateCenter = a17.getStateCenter()) != null) {
            ((wi5.n0) stateCenter.getState()).F.put("select_num", java.lang.String.valueOf(list2.size()));
            stateCenter.B3(new wi5.j(itemData.f208886d, false, 7L, 2, null));
        }
        return jz5.f0.f302826a;
    }
}
